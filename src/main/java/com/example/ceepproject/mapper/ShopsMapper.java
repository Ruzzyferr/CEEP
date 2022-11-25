package com.example.ceepproject.mapper;

import com.example.ceepproject.dto.ShopsDTO;
import com.example.ceepproject.dto.ShopsSaveRequestDTO;
import com.example.ceepproject.entity.Shops;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface ShopsMapper {
    @Named("toEntity")
    Shops toEntity (ShopsDTO dto);

    @Named("toDto")
    ShopsDTO toDto (Shops entity);

    Shops toEntityFromSaveRequest (ShopsSaveRequestDTO dto);
}
