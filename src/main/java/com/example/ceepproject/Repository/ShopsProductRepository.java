package com.example.ceepproject.Repository;

import com.example.ceepproject.entity.ShopProducts;
import jdk.dynalink.linker.LinkerServices;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShopsProductRepository extends JpaRepository<ShopProducts, Integer> {

    ShopProducts findByShopIdAndProductId (int shop_id,int product_id);

}
