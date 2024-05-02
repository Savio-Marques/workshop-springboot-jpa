package com.projectwebservices.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectwebservices.project.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
