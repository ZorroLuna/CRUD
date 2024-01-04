package com.example.api.crud.servicio;

import java.util.List;

import com.example.api.crud.entidades.Reserva;

public interface IReservaService {
	public List<Reserva> getAllReservas();
	   public Reserva createReserva(Reserva reserva);
	   public Reserva getIdReservas(Long id) throws Exception;
	   public Reserva updateReserva(Reserva reserve, Long id) throws Exception;
	   public void deleteReserva(Long id) throws Exception;
}
