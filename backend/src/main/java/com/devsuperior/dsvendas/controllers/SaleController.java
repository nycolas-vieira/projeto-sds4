package com.devsuperior.dsvendas.controllers;

import com.devsuperior.dsvendas.dtos.responses.SaleResponseDTO;
import com.devsuperior.dsvendas.services.SaleService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    private SaleService service;

    public SaleController(SaleService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<Page<SaleResponseDTO>> findAll(Pageable pageable) {
        var response = service.findAll(pageable);

        return ResponseEntity.ok(response);
    }
}
