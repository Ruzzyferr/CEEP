package com.example.ceepproject.service;

import com.example.ceepproject.Repository.ShopsProductRepository;
import com.example.ceepproject.Repository.ShopsRepository;
import com.example.ceepproject.dto.ShopProductsDTO;
import com.example.ceepproject.dto.ShopProductsSaveRequestDTO;
import com.example.ceepproject.entity.ShopProducts;
import com.example.ceepproject.entity.Shops;
import com.example.ceepproject.mapper.ShopsProductMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopProductsService {

    private final ShopsProductMapper shopsProductMapper;
    private final ShopsProductRepository shopsProductRepository;
    private final ShopsRepository shopsRepository;


    public ShopProductsService(ShopsProductMapper shopsProductMapper, ShopsProductRepository shopsProductRepository,
                               ShopsRepository shopsRepository) {
        this.shopsProductMapper = shopsProductMapper;
        this.shopsProductRepository = shopsProductRepository;
        this.shopsRepository = shopsRepository;
    }

    public ShopProductsDTO save(ShopProductsSaveRequestDTO dto){

        ShopProducts shopProducts = shopsProductMapper.toEntityFromSaveRequestDto(dto);

        shopProducts = shopsProductRepository.save(shopProducts);

        return shopsProductMapper.toDto(shopProducts);
    }

    public String cheapestShopAndTotal(List<Integer> product_id){
        List<Shops> shops = shopsRepository.findAll();

        float total = 1827;

        String cheapShop = "";

        for (Shops shops1 : shops) {
            float tempTotal = 0;
            for (Integer integer : product_id) {
                ShopProducts shopProduct =
                        shopsProductRepository.findByShopIdAndProductId(shops1.getId() , integer);
                if (shopProduct == null) {
                    break;
                }
                tempTotal = tempTotal + shopProduct.getPrice();
            }
            if(tempTotal < total){
                total = tempTotal;
                cheapShop = shopsRepository.findById(shops1.getId()).getName();
            }
        }

        return "Cheapest shop is: " + cheapShop + "... and total price is: " + total;
    }



}
