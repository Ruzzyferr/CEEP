package com.example.ceepproject.service;

import com.example.ceepproject.Repository.ShopsRepository;
import com.example.ceepproject.dto.ShopsDTO;
import com.example.ceepproject.dto.ShopsSaveRequestDTO;
import com.example.ceepproject.entity.Shops;
import com.example.ceepproject.mapper.ShopsMapper;
import org.springframework.stereotype.Service;

@Service
public class ShopsService {

    private final ShopsMapper shopsMapper;
    private final ShopsRepository shopsRepository;

    public ShopsService(ShopsMapper shopsMapper, ShopsRepository shopsRepository) {
        this.shopsMapper = shopsMapper;
        this.shopsRepository = shopsRepository;
    }

    public ShopsDTO save(ShopsSaveRequestDTO dto){
        Shops shops = shopsMapper.toEntityFromSaveRequest(dto);

        shops = shopsRepository.save(shops);

        return shopsMapper.toDto(shops);
    }



}
