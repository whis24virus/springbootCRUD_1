package com.keshav.crudexample.repository;

import com.keshav.crudexample.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

//this is our repository


// connecting database using application.propreties

public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findByName(String name);
}
