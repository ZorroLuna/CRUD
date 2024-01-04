package com.example.api.crud.servicio;

import java.util.List;

import com.example.api.crud.entidades.Cliente;

public interface IClienteService {
	public List<Cliente> getAllClientes();
	   public Cliente createCliente(Cliente cliente);
	   public Cliente getIdClientes(Long id) throws Exception;
	   public Cliente updateCliente(Cliente cliente, Long id) throws Exception;
	   public void deleteCliente(Long id) throws Exception;
}
