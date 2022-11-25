package com.example.ceepproject.Repository;

import com.example.ceepproject.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Products, Integer> {
}
