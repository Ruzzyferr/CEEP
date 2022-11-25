package com.example.ceepproject.dto;

import com.example.ceepproject.entity.Products;
import com.example.ceepproject.entity.Shops;
import lombok.Data;

@Data
public class ShopProductsDTO {

    private int id;

    private Shops shop;

    private Products product;

    private int price;
}
