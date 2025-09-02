package com.vaperzone.vaperzone_store.venta.controller;

import com.vaperzone.vaperzone_store.venta.service.VentaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/venta")
@RequiredArgsConstructor
public class VentaController {

    private final VentaService ventaService;
}
