package com.example.ceepproject.dto;

import com.example.ceepproject.entity.Products;
import com.example.ceepproject.entity.Shops;
import lombok.Data;

import javax.persistence.ManyToOne;

@Data
public class ShopProductsSaveRequestDTO {

    private int id;

    private Shops shop;

    private Products product;

    private int price;


}
