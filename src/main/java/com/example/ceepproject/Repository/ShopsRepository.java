package com.example.ceepproject.Repository;

import com.example.ceepproject.entity.Shops;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShopsRepository extends JpaRepository<Shops, Integer> {

    List<Shops> findAll ();
    Shops findById(int id);

}
