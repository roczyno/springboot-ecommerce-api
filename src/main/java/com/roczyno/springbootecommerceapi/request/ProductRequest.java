package com.roczyno.springbootecommerceapi.request;

import com.roczyno.springbootecommerceapi.entity.Category;
import com.roczyno.springbootecommerceapi.entity.Size;


import java.util.Set;

public record ProductRequest(
		String title,
		String description,
		int price,
		int discountPrice,
		int discountPricePercent,
		int quantity,
		String brand,
		String color,
		Set<Size> sizes,
		String imageUrl,
		Category category
) {
}
