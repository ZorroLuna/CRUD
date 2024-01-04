package com.example.api.crud.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.api.crud.entidades.Cliente;
import com.example.api.crud.repositorios.ClienteRepository;
import com.example.api.crud.servicio.IClienteService;

@RestController
@RequestMapping("/api/v2/clientes")
public class ClienteServiceImpl implements IClienteService{
		   
	   @Autowired
	   private ClienteRepository clRepository;
	   
	   @GetMapping
	   public List<Cliente> getAllClientes(){
	      return clRepository.findAll();
	   }

	   @PostMapping
	   public Cliente createCliente(@RequestBody Cliente employees){
	      return clRepository.save(employees);
	   }

	   @GetMapping("{id}")
	   public Cliente getIdClientes(@PathVariable("id") Long id) throws Exception {
	      return clRepository.findById(id).orElseThrow(
	            () -> new Exception("No se encontró el registro"));
	   }

	   @PutMapping("/{id}")
	   public Cliente updateCliente(@RequestBody Cliente cliente, @PathVariable("id") Long id) throws Exception {
	      try {
	    	  cliente.setIdCliente(id);
	         return this.clRepository.save(cliente);
	      } catch (Exception e) {
	         throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No se encontró el registro", e);
	      }
	   }

	   @DeleteMapping("/{id}")
	   public void deleteCliente(@PathVariable("id") Long id) throws Exception {
	      try {
	         this.getIdClientes(id);
	         clRepository.deleteById(id);
	      }catch (Exception e){
	         throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No se encontró el registro", e);
	      }
	   }
}
