package com.example.api.crud.entidades;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "RESERVA")
public class Reserva {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "id_reserva")
	 private Long idReserva;
	
	 @JoinColumn(name = "fk_cli", nullable = false)
     @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
     private Cliente cliente;

	 @JoinColumn(name = "fk_hab", nullable = false)
	 @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	 private Habitacion hab;

	 @Column(name = "fechaInicio")
	 private LocalDate fechaInicio;
	 
	 @Column(name = "fechaFin")
	 private LocalDate fechaFin;
	 
	 @Column(name = "total")
	 private BigDecimal total;
	 
	 @Column(name = "estado")
	 private String estado;
	 
	 public Reserva() {}

	/**
	 * @param cliente
	 * @param hab
	 * @param fechaInicio
	 * @param fechaFin
	 * @param total
	 * @param estado
	 */
	public Reserva(Cliente cliente, Habitacion hab, LocalDate fechaInicio, LocalDate fechaFin, BigDecimal total,
			String estado) {
		super();
		this.cliente = cliente;
		this.hab = hab;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.total = total;
		this.estado = estado;
	}

	/**
	 * @return the idReserva
	 */
	public Long getIdReserva() {
		return idReserva;
	}

	/**
	 * @param idReserva the idReserva to set
	 */
	public void setIdReserva(Long idReserva) {
		this.idReserva = idReserva;
	}

	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return the hab
	 */
	public Habitacion getHab() {
		return hab;
	}

	/**
	 * @param hab the hab to set
	 */
	public void setHab(Habitacion hab) {
		this.hab = hab;
	}

	/**
	 * @return the fechaInicio
	 */
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	/**
	 * @param fechaInicio the fechaInicio to set
	 */
	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	/**
	 * @return the fechaFin
	 */
	public LocalDate getFechaFin() {
		return fechaFin;
	}

	/**
	 * @param fechaFin the fechaFin to set
	 */
	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
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
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}
	 
	 
}
