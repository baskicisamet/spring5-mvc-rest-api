package com.sam.spring5mvcrestapp.controller.v1;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sam.spring5mvcrestapp.api.v1.model.CategoryDTO;
import com.sam.spring5mvcrestapp.api.v1.model.CategoryListDTO;
import com.sam.spring5mvcrestapp.service.CategoryService;

@Controller
@RequestMapping("api/v1/categories/")
public class CategoryController {
	
	private final CategoryService categoryService;

	public CategoryController(CategoryService categoryService) {
		this.categoryService = categoryService;
	}
	
	@GetMapping
	public ResponseEntity<CategoryListDTO> getAllCategories(){
		
		System.out.println("DEBUG INFO :::::::::::::::::::::::: request catched");
		System.out.println("DEBUG INFO :::::::::::::::::::::::: categori list size : " + categoryService.getAllCategories().size());
		System.out.println("DEBUG INFO :::::::::::::::::::::::: categori size inside listDTO : " + new CategoryListDTO(categoryService.getAllCategories()).getCategories().size() );
		
		return new ResponseEntity<CategoryListDTO>(new CategoryListDTO(categoryService.getAllCategories()), HttpStatus.OK);
		
	}
	
	
	@GetMapping("{name}")
	public ResponseEntity<CategoryDTO> getCategoryByName(@PathVariable String name){
		return new ResponseEntity<CategoryDTO>(categoryService.getCategoryByName(name),HttpStatus.OK);
	}
	
	

}
