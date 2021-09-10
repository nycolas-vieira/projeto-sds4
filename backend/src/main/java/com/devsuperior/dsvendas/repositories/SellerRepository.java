package com.devsuperior.dsvendas.repositories;

import com.devsuperior.dsvendas.repositories.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerRepository extends JpaRepository<Long, Seller> {
}
