package com.example.ceepproject.dto;

import com.example.ceepproject.entity.Products;
import com.example.ceepproject.entity.Shops;
import lombok.Data;

import javax.persistence.ManyToOne;
import java.util.Set;

@Data
public class ShopProductsSaveRequestDTO {

    private int id;

    private ShopsDTO shop;

    private ProductDTO product;

    private int price;


}
