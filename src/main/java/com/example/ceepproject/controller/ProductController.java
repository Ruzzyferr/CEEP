package com.example.ceepproject.controller;

import com.example.ceepproject.dto.ProductDTO;
import com.example.ceepproject.dto.ProductSaveRequestDTO;
import com.example.ceepproject.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/save")
    public ResponseEntity<ProductDTO> save(@RequestBody ProductSaveRequestDTO dto){
        ProductDTO productDTO = productService.save(dto);
        return new ResponseEntity<>(productDTO, HttpStatus.OK);
    }

}
