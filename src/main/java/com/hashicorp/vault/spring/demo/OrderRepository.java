package com.hashicorp.vault.spring.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface OrderRepository extends JpaRepository<com.hashicorp.vault.spring.demo.Order, Long> {
    List<com.hashicorp.vault.spring.demo.Order> findByCustomerName(String customerName);
    List<com.hashicorp.vault.spring.demo.Order> findByProductName(String productName);
}