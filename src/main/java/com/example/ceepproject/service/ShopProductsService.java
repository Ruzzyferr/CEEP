package com.example.ceepproject.service;

import com.example.ceepproject.Repository.ShopsProductRepository;
import com.example.ceepproject.dto.ShopProductsDTO;
import com.example.ceepproject.dto.ShopProductsSaveRequestDTO;
import com.example.ceepproject.entity.ShopProducts;
import com.example.ceepproject.mapper.ShopsProductMapper;
import org.springframework.stereotype.Service;

@Service
public class ShopProductsService {

    private final ShopsProductMapper shopsProductMapper;
    private final ShopsProductRepository shopsProductRepository;


    public ShopProductsService(ShopsProductMapper shopsProductMapper, ShopsProductRepository shopsProductRepository) {
        this.shopsProductMapper = shopsProductMapper;
        this.shopsProductRepository = shopsProductRepository;
    }

    public ShopProductsDTO save(ShopProductsSaveRequestDTO dto){

        ShopProducts shopProducts = shopsProductMapper.toEntityFromSaveRequestDto(dto);

        shopProducts = shopsProductRepository.save(shopProducts);

        return shopsProductMapper.toDto(shopProducts);
    }



}
