package com.example.ceepproject.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Shops")
public class Shops {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String adress;
}
