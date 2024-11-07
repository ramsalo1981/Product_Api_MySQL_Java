package com.ramisal.myproductsrestapi.repo;

import com.ramisal.myproductsrestapi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
