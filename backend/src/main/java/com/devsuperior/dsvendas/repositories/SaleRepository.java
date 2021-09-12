package com.devsuperior.dsvendas.repositories;

import com.devsuperior.dsvendas.dtos.responses.SaleSuccessDTO;
import com.devsuperior.dsvendas.dtos.responses.SaleSumDTO;
import com.devsuperior.dsvendas.repositories.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query("SELECT new com.devsuperior.dsvendas.dtos.responses.SaleSumDTO(obj.seller, SUM(obj.amount))"
            + " FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSumDTO> amountGroupedBySeller();

    @Query("SELECT new com.devsuperior.dsvendas.dtos.responses.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals))"
            + " FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSuccessDTO> successGroupedBySeller();
}
