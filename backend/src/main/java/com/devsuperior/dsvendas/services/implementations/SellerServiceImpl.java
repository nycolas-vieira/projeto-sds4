package com.devsuperior.dsvendas.services.implementations;

import com.devsuperior.dsvendas.dtos.mappers.SellerResponseMapper;
import com.devsuperior.dsvendas.dtos.responses.SellerResponseDTO;
import com.devsuperior.dsvendas.exceptions.NotFoundException;
import com.devsuperior.dsvendas.repositories.SellerRepository;
import com.devsuperior.dsvendas.services.SellerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellerServiceImpl implements SellerService {

    private SellerRepository repository;

    public SellerServiceImpl(SellerRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<SellerResponseDTO> findAll() {
        var response = repository.findAll();

        if (response.isEmpty()) {
            throw new NotFoundException("Seller list is empty");
        }

        return SellerResponseMapper.fromEntitiesToListDTO(response);
    }
}
