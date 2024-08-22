package com.roczyno.springbootecommerceapi.service;



import com.roczyno.springbootecommerceapi.entity.Product;
import com.roczyno.springbootecommerceapi.request.ProductRequest;
import com.roczyno.springbootecommerceapi.response.ProductResponse;
import org.springframework.security.core.Authentication;

import java.util.List;

public interface ProjectService {
	ProductResponse createProduct(ProductRequest req);
	String deleteProduct(Long productId, Authentication connectedUser);
	ProductResponse updateProduct(Long productId, ProductRequest req,Authentication connectedUser);
	ProductResponse findProductById(Long productId);
	List<ProductResponse> findProductByCategory(String category);
	List<Product> getAllProducts(String category, List<String> color, List<String> sizes, Integer minPrice,
								 Integer maxPrice, Integer minDiscount, String stock);
}
