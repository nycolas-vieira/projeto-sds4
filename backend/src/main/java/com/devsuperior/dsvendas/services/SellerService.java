package com.devsuperior.dsvendas.services;

import com.devsuperior.dsvendas.dtos.responses.SellerResponseDTO;

import java.util.List;

public interface SellerService {

    List<SellerResponseDTO> findAll();

}
