package com.rodrigo.pedidos.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rodrigo.pedidos.entity.Detalle;

@Repository("detalleRepository")
public interface DetalleRepository extends JpaRepository<Detalle, Serializable> {

}
