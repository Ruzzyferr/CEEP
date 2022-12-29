package com.example.ceepproject.dto;
import lombok.Data;

import java.util.Set;

@Data
public class ShopProductsDTO {

    private int id;

    private ShopsDTO shop;

    private ProductDTO product;

    private int price;
}
