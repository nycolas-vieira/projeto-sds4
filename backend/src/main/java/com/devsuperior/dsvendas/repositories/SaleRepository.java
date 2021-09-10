package com.devsuperior.dsvendas.repositories;

import com.devsuperior.dsvendas.repositories.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepository extends JpaRepository<Long, Sale> {
}