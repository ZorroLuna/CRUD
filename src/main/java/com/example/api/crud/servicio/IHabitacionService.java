package com.example.api.crud.servicio;

import java.util.List;

import com.example.api.crud.entidades.Habitacion;

public interface IHabitacionService {
	public List<Habitacion> getAllHabitaciones();
	   public Habitacion createHabitacion(Habitacion habitacion);
	   public Habitacion getIdHabitaciones(Long id) throws Exception;
	   public Habitacion updateHabitacion(Habitacion habitacion, Long id) throws Exception;
	   public void deleteHabitacion(Long id) throws Exception;
}
