package com.example.ceepproject.entity;

import lombok.Data;
import org.springframework.data.repository.cdi.Eager;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "shopProducts")
public class ShopProducts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch=FetchType.EAGER)
    private Shops shop;

    @ManyToOne (fetch=FetchType.EAGER)
    private Products product;

    private int price;
}
