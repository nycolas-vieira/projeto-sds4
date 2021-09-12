package com.devsuperior.dsvendas.dtos.mappers;

import com.devsuperior.dsvendas.dtos.responses.SellerResponseDTO;
import com.devsuperior.dsvendas.repositories.entities.Seller;

import java.util.List;
import java.util.stream.Collectors;

public interface SellerResponseMapper {

    static List<SellerResponseDTO> fromEntitiesToListDTO(List<Seller> seller) {
        return seller.stream().map(SellerResponseMapper::fromEntityToDTO).collect(Collectors.toList());
    }

    static SellerResponseDTO fromEntityToDTO(Seller seller) {
        return new SellerResponseDTO(seller.getId(), seller.getName());
    }

}
