package com.sam.spring5mvcrestapp.controller.v1;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sam.spring5mvcrestapp.api.v1.model.CategoryDTO;
import com.sam.spring5mvcrestapp.api.v1.model.CategoryListDTO;
import com.sam.spring5mvcrestapp.service.CategoryService;

@RestController
@RequestMapping(CategoryController.BASE_URL)
public class CategoryController {
	
	private final CategoryService categoryService;
	
	 public static final String BASE_URL = "/api/v1/categories";

	public CategoryController(CategoryService categoryService) {
		this.categoryService = categoryService;
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public CategoryListDTO getAllCategories(){
		
		return new CategoryListDTO(categoryService.getAllCategories());
		
	}
	
	
	@GetMapping("{name}")
	@ResponseStatus(HttpStatus.OK)
	public CategoryDTO getCategoryByName(@PathVariable String name){
		return categoryService.getCategoryByName(name);
	}
	
	

}
