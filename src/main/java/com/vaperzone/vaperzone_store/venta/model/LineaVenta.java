package com.vaperzone.vaperzone_store.venta.model;

import com.vaperzone.vaperzone_store.vaper.model.Vaper;
import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@IdClass(LineaVentaPK.class)
public class LineaVenta {

    @Id
    @ManyToOne
    @Column(name = "venta_id")
    private Venta venta;

    @Id
    @ManyToOne
    @Column(name = "vaper_id")
    private Vaper vaper;

    private int cantidad;

    public double getSubTotal() {
        return vaper.getPrecioUnitario() * cantidad;
    }
}
