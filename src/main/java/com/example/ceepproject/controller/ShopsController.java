package com.example.ceepproject.controller;

import com.example.ceepproject.dto.ShopsDTO;
import com.example.ceepproject.dto.ShopsSaveRequestDTO;
import com.example.ceepproject.service.ShopsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shops")
public class ShopsController {

    private final ShopsService shopsService;

    public ShopsController(ShopsService shopsService) {
        this.shopsService = shopsService;
    }

    @PostMapping("/save")
    public ResponseEntity<ShopsDTO> save(@RequestBody ShopsSaveRequestDTO dto){
        ShopsDTO shopsDTO = shopsService.save(dto);
        return new ResponseEntity<>(shopsDTO, HttpStatus.OK);
    }
}
