package com.devsuperior.dsvendas.controllers;

import com.devsuperior.dsvendas.dtos.responses.SellerResponseDTO;
import com.devsuperior.dsvendas.services.SellerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sellers")
public class SellerController {

    private SellerService service;

    public SellerController(SellerService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<SellerResponseDTO>> findAll() throws Exception {
        var response = service.findAll();

        return ResponseEntity.ok(response);
    }
}
