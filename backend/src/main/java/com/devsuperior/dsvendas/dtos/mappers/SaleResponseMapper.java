package com.devsuperior.dsvendas.dtos.mappers;

import com.devsuperior.dsvendas.dtos.responses.SaleResponseDTO;
import com.devsuperior.dsvendas.repositories.entities.Sale;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.stream.Collectors;

public interface SaleResponseMapper {

    static Page<SaleResponseDTO> fromEntitiesToPageDTO(Page<Sale> sales) {
        return sales.map(SaleResponseMapper::fromEntityToDTO);
    }

    static SaleResponseDTO fromEntityToDTO(Sale sale) {
        return new SaleResponseDTO(
                sale.getId(),
                sale.getVisited(),
                sale.getDeals(),
                sale.getAmount(),
                sale.getDate(),
                SellerResponseMapper.fromEntityToDTO(sale.getSeller()));
    }

}
