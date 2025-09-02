package com.vaperzone.vaperzone_store.venta.repository;

import com.vaperzone.vaperzone_store.venta.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface VentaRepository extends JpaRepository<Venta, UUID> {
}
