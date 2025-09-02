package com.vaperzone.vaperzone_store.venta.model;

import com.vaperzone.vaperzone_store.vaper.model.Vaper;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LineaVentaPK {

    private Venta venta;

    private Vaper vaper;
}
