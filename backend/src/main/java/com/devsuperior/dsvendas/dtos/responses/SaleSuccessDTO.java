package com.devsuperior.dsvendas.dtos.responses;

import com.devsuperior.dsvendas.repositories.entities.Seller;

import java.io.Serializable;

public class SaleSuccessDTO implements Serializable{

    private static final long serialVersionUID = 1L;

    private String sellerName;

    private Long visited;

    private Long details;

    public SaleSuccessDTO(Seller seller, Long visited, Long details) {
        this.sellerName = seller.getName();
        this.visited = visited;
        this.details = details;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Long getVisited() {
        return visited;
    }

    public void setVisited(Long visited) {
        this.visited = visited;
    }

    public Long getDetails() {
        return details;
    }

    public void setDetails(Long details) {
        this.details = details;
    }
}