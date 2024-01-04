package com.example.api.crud.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.api.crud.entidades.Habitacion;
import com.example.api.crud.repositorios.HabitacionRepository;
import com.example.api.crud.servicio.IHabitacionService;

@RestController
@RequestMapping("/api/v2/habitaciones")
public class HabitacionServiceImpl implements IHabitacionService {

	@Autowired
	private HabitacionRepository habRepository;
	
	
	@GetMapping
	public List<Habitacion> getAllHabitaciones() {
		return habRepository.findAll();
	}

	@PostMapping
	public Habitacion createHabitacion(Habitacion habitacion) {
		return habRepository.save(habitacion);
	}

	@GetMapping("{id}")
	public Habitacion getIdHabitaciones(Long id) throws Exception {
		return habRepository.findById(id).orElseThrow(
	            () -> new Exception("No se encontró el registro"));
	}

	@PutMapping("/{id}")
	public Habitacion updateHabitacion(Habitacion habitacion, Long id) throws Exception {
		 try {
	    	  habitacion.setIdHabitacion(id);
	         return this.habRepository.save(habitacion);
	      } catch (Exception e) {
	         throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No se encontró el registro", e);
	      }
	}

	@DeleteMapping("/{id}")
	public void deleteHabitacion(Long id) throws Exception {
		try {
	         this.getIdHabitaciones(id);
	         habRepository.deleteById(id);
	      }catch (Exception e){
	         throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No se encontró el registro", e);
	      }
		
	}

}
