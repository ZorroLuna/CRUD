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

import com.example.api.crud.entidades.Reserva;
import com.example.api.crud.repositorios.ReservaRepository;
import com.example.api.crud.servicio.IReservaService;


@RestController
@RequestMapping("/api/v2/reservas")
public class ReservaServiceImpl implements IReservaService{

	
	@Autowired
	private ReservaRepository reservRepository;
	@GetMapping
	public List<Reserva> getAllReservas() {
		return reservRepository.findAll();
	}

	@PostMapping
	public Reserva createReserva(Reserva reserva) {
		return reservRepository.save(reserva);
	}

	@GetMapping("{id}")
	public Reserva getIdReservas(Long id) throws Exception {
		return reservRepository.findById(id).orElseThrow(
	            () -> new Exception("No se encontró el registro"));
	}

	@PutMapping("/{id}")
	public Reserva updateReserva(Reserva reserve, Long id) throws Exception {
		try {
	    	  reserve.setIdReserva(id);
	         return this.reservRepository.save(reserve);
	      } catch (Exception e) {
	         throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No se encontró el registro", e);
	      }
	}

	@DeleteMapping("/{id}")
	public void deleteReserva(Long id) throws Exception {
		try {
	         this.getIdReservas(id);
	         reservRepository.deleteById(id);
	      }catch (Exception e){
	         throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No se encontró el registro", e);
	      }
		
	}

}
