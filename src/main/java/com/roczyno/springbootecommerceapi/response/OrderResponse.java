package com.roczyno.springbootecommerceapi.response;

import com.roczyno.springbootecommerceapi.entity.Address;
import com.roczyno.springbootecommerceapi.entity.OrderItem;
import com.roczyno.springbootecommerceapi.entity.User;

import java.time.LocalDateTime;
import java.util.List;

public record OrderResponse(
		Long id,
		User user,
		List<OrderItem> orderItems,
		LocalDateTime orderDate,
		LocalDateTime deliveryDate,
		Address shippingAddress,
		double totalPrice,
		Integer totalDiscountedPrice,
		Integer discount,
		String orderStatus,
		int totalItems,
		LocalDateTime createdAt
) {
}
