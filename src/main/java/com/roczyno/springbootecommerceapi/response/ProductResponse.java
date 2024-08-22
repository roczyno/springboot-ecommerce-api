package com.roczyno.springbootecommerceapi.response;

import com.roczyno.springbootecommerceapi.entity.Category;
import com.roczyno.springbootecommerceapi.entity.Size;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public record ProductResponse(
		Long id,
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
		int numOfRatings,
		Category category,
		LocalDateTime createdAt
) {
}
