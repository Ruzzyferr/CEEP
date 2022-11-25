package com.example.ceepproject.entity;

import com.example.ceepproject.enums.ProductType;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table (name = "products")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

}
