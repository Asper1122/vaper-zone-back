package com.vaperzone.vaperzone_store.vaper.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Vaper {

    @Id
    @GeneratedValue
    private UUID id;

    private String nombre;

    private double precioUnitario;

    private double descuento;

    @Column(columnDefinition = "TEXT")
    private String descripcion;

    private String image;
}
