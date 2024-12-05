package com.ghostappi.backend.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.ghostappi.backend.service.CategoryService;
import com.ghostappi.backend.dto.CategoryDTO;
import com.ghostappi.backend.model.Category;

@Controller
public class CategoryController {

        @Autowired
        private CategoryService categoryService;
        @Autowired
        private ModelMapper modelMapper;

        @QueryMapping
        public List<Category> getAllCategories() {
                return categoryService.getAll();
        }

        @MutationMapping
        public Category addCategory(@Argument(value = "category") CategoryDTO categoryInput) {
                return categoryService.addCategory(convertToEntity(categoryInput));
        }

        public Category convertToEntity(CategoryDTO categoryInput) {
                return modelMapper.map(categoryInput, Category.class);
        }
}
