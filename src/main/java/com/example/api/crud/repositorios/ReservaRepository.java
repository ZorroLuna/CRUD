package com.example.api.crud.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.api.crud.entidades.Reserva;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva,Long>{

}
