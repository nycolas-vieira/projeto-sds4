package com.devsuperior.dsvendas.controllers;

import com.devsuperior.dsvendas.dtos.responses.SaleResponseDTO;
import com.devsuperior.dsvendas.dtos.responses.SaleSuccessDTO;
import com.devsuperior.dsvendas.dtos.responses.SaleSumDTO;
import com.devsuperior.dsvendas.services.SaleService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @GetMapping(value = "/amount-by-seller")
    public ResponseEntity<List<SaleSumDTO>> amountBySeller() {
        var response = service.amountBySeller();

        return ResponseEntity.ok(response);
    }

    @GetMapping(value = "/success-by-seller")
    public ResponseEntity<List<SaleSuccessDTO>> successBySeller() {
        var response = service.successBySeller();

        return ResponseEntity.ok(response);
    }
}
