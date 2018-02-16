package com.sam.spring5mvcrestapp.service;

import java.util.List;

import com.sam.spring5mvcrestapp.api.v1.model.CategoryDTO;

public interface CategoryService {
	
	List<CategoryDTO> getAllCategories();
	
	CategoryDTO getCategoryByName(String name);
	

}
