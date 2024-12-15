package com.example.prouductsrestapi.repos;

import com.example.prouductsrestapi.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
