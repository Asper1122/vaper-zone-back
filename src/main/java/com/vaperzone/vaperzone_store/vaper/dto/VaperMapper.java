package com.vaperzone.vaperzone_store.vaper.dto;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface VaperMapper {

    VaperMapper INSTANCE = Mappers.getMapper(VaperMapper.class);
}
