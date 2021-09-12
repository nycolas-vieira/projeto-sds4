package com.devsuperior.dsvendas.services.implementations;

import com.devsuperior.dsvendas.dtos.mappers.SaleResponseMapper;
import com.devsuperior.dsvendas.dtos.responses.SaleResponseDTO;
import com.devsuperior.dsvendas.dtos.responses.SaleSuccessDTO;
import com.devsuperior.dsvendas.dtos.responses.SaleSumDTO;
import com.devsuperior.dsvendas.exceptions.NotFoundException;
import com.devsuperior.dsvendas.repositories.SaleRepository;
import com.devsuperior.dsvendas.repositories.SellerRepository;
import com.devsuperior.dsvendas.services.SaleService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SaleServiceImpl implements SaleService {

    private SaleRepository saleRepository;
    private SellerRepository sellerRepository;

    public SaleServiceImpl(SaleRepository saleRepository, SellerRepository sellerRepository) {
        this.saleRepository = saleRepository;
        this.sellerRepository = sellerRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public Page<SaleResponseDTO> findAll(Pageable pageable) {
        sellerRepository.findAll();

        var response = saleRepository.findAll(pageable);

        if (response.isEmpty()) {
            throw new NotFoundException("Sale list is empty");
        }

        return SaleResponseMapper.fromEntitiesToPageDTO(response);
    }

    @Override
    @Transactional(readOnly = true)
    public List<SaleSumDTO> amountBySeller() {
        return saleRepository.amountGroupedBySeller();
    }

    @Override
    @Transactional(readOnly = true)
    public List<SaleSuccessDTO> successBySeller() {
        return saleRepository.successGroupedBySeller();
    }
}
