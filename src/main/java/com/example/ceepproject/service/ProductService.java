package com.example.ceepproject.service;

import com.example.ceepproject.Repository.ProductRepository;
import com.example.ceepproject.dto.ProductDTO;
import com.example.ceepproject.dto.ProductSaveRequestDTO;
import com.example.ceepproject.entity.Products;
import com.example.ceepproject.mapper.ProductMapper;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductMapper productMapper;
    private final ProductRepository productRepository;

    public ProductService(ProductMapper productMapper, ProductRepository productRepository) {
        this.productMapper = productMapper;
        this.productRepository = productRepository;
    }

    public ProductDTO save(ProductSaveRequestDTO dto) {
        Products products = productMapper.toEntityFromSaveRequest(dto);

        products = productRepository.save(products);

        return productMapper.toDto(products);
    }
}
