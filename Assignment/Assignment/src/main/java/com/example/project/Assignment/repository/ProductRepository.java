package com.example.project.Assignment.repository;



import com.example.project.Assignment.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

