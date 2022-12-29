package com.example.ceepproject.controller;

import com.example.ceepproject.dto.ShopProductsDTO;
import com.example.ceepproject.dto.ShopProductsSaveRequestDTO;
import com.example.ceepproject.service.ShopProductsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@RestController
@RequestMapping("/shopProducts")
public class ShopProductsController {

    private final ShopProductsService shopProductsService;


    public ShopProductsController(ShopProductsService shopProductsService) {
        this.shopProductsService = shopProductsService;
    }

    @PostMapping("/save")
    public ResponseEntity<ShopProductsDTO> save(@RequestBody ShopProductsSaveRequestDTO dto){

        ShopProductsDTO shopProductsDTO = shopProductsService.save(dto);

        return new ResponseEntity<>(shopProductsDTO, HttpStatus.OK);
    }

    @GetMapping("/cheapest")
    public ResponseEntity<String> cheapestShopAndTotal(@RequestBody List<Integer> productId){
        String message = shopProductsService.cheapestShopAndTotal(productId);

        return new ResponseEntity<>(message, HttpStatus.OK);
    }

}
