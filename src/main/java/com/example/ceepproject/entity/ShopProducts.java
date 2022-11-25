package com.example.ceepproject.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "shopProducts")
public class ShopProducts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Shops shop;

    @ManyToOne
    private Products product;

    private int price;
}
