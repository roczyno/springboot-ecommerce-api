package com.roczyno.springbootecommerceapi.util;

import com.roczyno.springbootecommerceapi.entity.Product;
import com.roczyno.springbootecommerceapi.response.ProductResponse;
import org.springframework.stereotype.Service;

@Service
public class ProductMapper {
	public ProductResponse mapToProductResponse(Product saveProduct) {
		return new ProductResponse(
				saveProduct.getId(),
				saveProduct.getTitle(),
				saveProduct.getDescription(),
				saveProduct.getPrice(),
				saveProduct.getDiscountPrice(),
				saveProduct.getDiscountPricePercent(),
				saveProduct.getQuantity(),
				saveProduct.getBrand(),
				saveProduct.getColor(),
				saveProduct.getSizes(),
				saveProduct.getImageUrl(),
				saveProduct.getNumOfRatings(),
				saveProduct.getCategory(),
				saveProduct.getCreatedAt()
		);
	}
}
