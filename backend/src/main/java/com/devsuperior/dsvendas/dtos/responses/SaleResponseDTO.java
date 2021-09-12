package com.devsuperior.dsvendas.dtos.responses;

import java.io.Serializable;
import java.time.LocalDate;

public class SaleResponseDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Integer visited;

    private Integer deals;

    private Double amount;

    private LocalDate date;

    private SellerResponseDTO seller;

    public SaleResponseDTO(Long id, Integer visited, Integer deals, Double amount, LocalDate date, SellerResponseDTO seller) {
        this.id = id;
        this.visited = visited;
        this.deals = deals;
        this.amount = amount;
        this.date = date;
        this.seller = seller;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getVisited() {
        return visited;
    }

    public void setVisited(Integer visited) {
        this.visited = visited;
    }

    public Integer getDeals() {
        return deals;
    }

    public void setDeals(Integer deals) {
        this.deals = deals;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public SellerResponseDTO getSeller() {
        return seller;
    }

    public void setSeller(SellerResponseDTO seller) {
        this.seller = seller;
    }
}
