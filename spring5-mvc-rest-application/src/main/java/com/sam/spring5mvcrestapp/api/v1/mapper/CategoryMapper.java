package com.sam.spring5mvcrestapp.api.v1.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.sam.spring5mvcrestapp.api.v1.model.CategoryDTO;
import com.sam.spring5mvcrestapp.domain.Category;

@Mapper
public interface CategoryMapper {
	
	CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);
	
	CategoryDTO categoryToCategoryDTO(Category category);

}
