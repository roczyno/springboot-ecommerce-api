package com.roczyno.springbootecommerceapi.service.impl;

import com.roczyno.springbootecommerceapi.entity.Category;
import com.roczyno.springbootecommerceapi.entity.Product;
import com.roczyno.springbootecommerceapi.entity.User;
import com.roczyno.springbootecommerceapi.exception.ProductException;
import com.roczyno.springbootecommerceapi.repository.ProductRepository;
import com.roczyno.springbootecommerceapi.request.ProductRequest;
import com.roczyno.springbootecommerceapi.response.ProductResponse;
import com.roczyno.springbootecommerceapi.service.CategoryService;
import com.roczyno.springbootecommerceapi.service.ProjectService;
import com.roczyno.springbootecommerceapi.util.CategoryMapper;
import com.roczyno.springbootecommerceapi.util.ProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProjectService {
	private final CategoryService categoryService;
	private final CategoryMapper categoryMapper;
	private final ProductRepository productRepository;
	private final ProductMapper productMapper;


	@Override
	public ProductResponse createProduct(ProductRequest req) {
		Product product=Product.builder()
				.title(req.title())
				.description(req.description())
				.price(req.price())
				.discountPrice(req.discountPrice())
				.discountPricePercent(req.discountPricePercent())
				.quantity(req.quantity())
				.brand(req.brand())
				.color(req.color())
				.sizes(req.sizes())
				.imageUrl(req.imageUrl())
				.build();

		Category category=categoryMapper.toMapToCategory(categoryService.getCategory(req.category().getId()));
		Product saveProduct;
		if(category==null){
			Category newCategory=Category.builder()
					.name(req.category().getName())
					.build();
			product.setCategory(newCategory);
			saveProduct=productRepository.save(product);
			return productMapper.mapToProductResponse(saveProduct);
		}
		product.setCategory(category);
		saveProduct=productRepository.save(product);
		return productMapper.mapToProductResponse(saveProduct);
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
