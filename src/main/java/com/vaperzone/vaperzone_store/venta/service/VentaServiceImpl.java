package com.vaperzone.vaperzone_store.venta.service;

import com.vaperzone.vaperzone_store.venta.repository.VentaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class VentaServiceImpl implements VentaService{

    private final VentaRepository ventaRepository;
}
