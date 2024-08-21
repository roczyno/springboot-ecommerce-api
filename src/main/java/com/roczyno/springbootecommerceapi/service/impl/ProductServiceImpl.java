package com.roczyno.springbootecommerceapi.service.impl;

import com.roczyno.springbootecommerceapi.entity.Product;
import com.roczyno.springbootecommerceapi.entity.User;
import com.roczyno.springbootecommerceapi.exception.ProductException;
import com.roczyno.springbootecommerceapi.repository.ProjectRepository;
import com.roczyno.springbootecommerceapi.request.ProductRequest;
import com.roczyno.springbootecommerceapi.response.ProductResponse;
import com.roczyno.springbootecommerceapi.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProjectService {
	private final ProjectRepository projectRepository;
	@Override
	public ProductResponse createProduct(ProductRequest req, Authentication connectedUser) {
		User user=(User) connectedUser.getPrincipal();
		if(!user.getRoles().toString().equals("ADMIN")){
			throw new ProductException("Only admins can add product");
		}
		return null;
	}

	@Override
	public String deleteProduct(Long productId, Authentication connectedUser) {
		return "";
	}

	@Override
	public ProductResponse updateProduct(Long productId, ProductRequest req, Authentication connectedUser) {
		return null;
	}

	@Override
	public ProductResponse findProductById(Long productId) {
		return null;
	}

	@Override
	public List<ProductResponse> findProductByCategory(String category) {
		return List.of();
	}

	@Override
	public List<Product> getAllProducts(String category, List<String> color, List<String> sizes, Integer minPrice, Integer maxPrice, Integer minDiscount, String stock) {
		return List.of();
	}
}
