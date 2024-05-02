package com.projectwebservices.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectwebservices.project.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
