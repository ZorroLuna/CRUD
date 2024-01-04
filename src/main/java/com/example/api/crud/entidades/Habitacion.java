package com.example.api.crud.entidades;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "HABITACION")
public class Habitacion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_habitacion")
	private Long idHabitacion;
	
	@Column(name = "numero")
	private int numero;
	
	@Column(name = "tipo")
	private String tipo;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "capacidad")
	private int capacidad;
	
	@Column(name = "total")
	private BigDecimal total;
	
	@Column(name = "precioXNoche")
	private BigDecimal precioXNoche;
	
	public Habitacion() {}

	/**
	 * @param numero
	 * @param tipo
	 * @param descripcion
	 * @param capacidad
	 * @param total
	 * @param precioXNoche
	 */
	public Habitacion(int numero, String tipo, String descripcion, int capacidad, BigDecimal total,
			BigDecimal precioXNoche) {
		super();
		this.numero = numero;
		this.tipo = tipo;
		this.descripcion = descripcion;
		this.capacidad = capacidad;
		this.total = total;
		this.precioXNoche = precioXNoche;
	}

	/**
	 * @return the idHabitacion
	 */
	public Long getIdHabitacion() {
		return idHabitacion;
	}

	/**
	 * @param idHabitacion the idHabitacion to set
	 */
	public void setIdHabitacion(Long idHabitacion) {
		this.idHabitacion = idHabitacion;
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the capacidad
	 */
	public int getCapacidad() {
		return capacidad;
	}

	/**
	 * @param capacidad the capacidad to set
	 */
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	/**
	 * @return the total
	 */
	public BigDecimal getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	/**
	 * @return the precioXNoche
	 */
	public BigDecimal getPrecioXNoche() {
		return precioXNoche;
	}

	/**
	 * @param precioXNoche the precioXNoche to set
	 */
	public void setPrecioXNoche(BigDecimal precioXNoche) {
		this.precioXNoche = precioXNoche;
	}
	
	
}
