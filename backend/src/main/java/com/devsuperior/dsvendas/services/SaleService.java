package com.devsuperior.dsvendas.services;

import com.devsuperior.dsvendas.dtos.responses.SaleResponseDTO;
import com.devsuperior.dsvendas.dtos.responses.SaleSuccessDTO;
import com.devsuperior.dsvendas.dtos.responses.SaleSumDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface SaleService {

    Page<SaleResponseDTO> findAll(Pageable pageable);

    List<SaleSumDTO> amountBySeller();

    List<SaleSuccessDTO> successBySeller();

}
