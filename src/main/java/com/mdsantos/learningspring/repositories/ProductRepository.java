package com.mdsantos.learningspring.repositories;

import com.mdsantos.learningspring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
