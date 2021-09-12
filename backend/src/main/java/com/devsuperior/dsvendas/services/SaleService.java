package com.devsuperior.dsvendas.services;

import com.devsuperior.dsvendas.dtos.responses.SaleResponseDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface SaleService {

    Page<SaleResponseDTO> findAll(Pageable pageable);

}
