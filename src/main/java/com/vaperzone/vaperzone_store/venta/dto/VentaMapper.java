package com.vaperzone.vaperzone_store.venta.dto;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface VentaMapper {

    VentaMapper INSTANCE = Mappers.getMapper(VentaMapper.class);
}
