package com.roczyno.springbootecommerceapi.service;

import com.roczyno.springbootecommerceapi.response.OrderResponse;
import org.springframework.security.core.Authentication;

import java.util.List;

public interface OrderService {
	OrderResponse createOrder (Authentication user);
	OrderResponse findOrderById (Long orderId);
	List<OrderResponse> userOrderHistory(Integer userId);
    OrderResponse updateOrderStatus(Long orderId,String status);
	List<OrderResponse> getAllOrders();
	String deleteOrder(Long orderId);
}
