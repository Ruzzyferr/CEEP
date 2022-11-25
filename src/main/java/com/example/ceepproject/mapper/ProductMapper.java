package com.example.ceepproject.mapper;

import com.example.ceepproject.dto.ProductDTO;
import com.example.ceepproject.dto.ProductSaveRequestDTO;
import com.example.ceepproject.dto.ShopsDTO;
import com.example.ceepproject.dto.ShopsSaveRequestDTO;
import com.example.ceepproject.entity.Products;
import com.example.ceepproject.entity.Shops;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    @Named("toEntity")
    Products toEntity (ProductDTO dto);

    @Named("toDto")
    ProductDTO toDto (Products entity);

    Products toEntityFromSaveRequest (ProductSaveRequestDTO dto);

}
