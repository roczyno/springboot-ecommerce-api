package com.roczyno.springbootecommerceapi.service;

import com.roczyno.springbootecommerceapi.request.CategoryRequest;
import com.roczyno.springbootecommerceapi.response.CategoryResponse;

import java.util.List;

public interface CategoryService {
	CategoryResponse getCategory(Long id);
	List<CategoryResponse> getAllCategories();
	CategoryResponse addCategory(CategoryRequest category);
	CategoryResponse updateCategory(CategoryRequest category, Long id);
	String deleteCategory(Long id);
}
