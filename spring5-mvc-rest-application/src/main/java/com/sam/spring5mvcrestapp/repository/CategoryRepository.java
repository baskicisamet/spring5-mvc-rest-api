package com.sam.spring5mvcrestapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sam.spring5mvcrestapp.domain.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	Category findByName(String name);

}
