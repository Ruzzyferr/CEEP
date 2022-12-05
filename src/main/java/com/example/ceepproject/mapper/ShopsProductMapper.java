package com.example.ceepproject.mapper;

import com.example.ceepproject.dto.ShopProductsDTO;
import com.example.ceepproject.dto.ShopProductsSaveRequestDTO;
import com.example.ceepproject.entity.ShopProducts;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface ShopsProductMapper {
    @Named("toDto")
    ShopProductsDTO toDto   (ShopProducts entity);
    @Named("toEntity")
    ShopProducts toEntity   (ShopProductsDTO dto);

    ShopProducts toEntityFromSaveRequestDto (ShopProductsSaveRequestDTO dto);

}
