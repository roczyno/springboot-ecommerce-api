package com.roczyno.springbootecommerceapi.repository;

import com.roczyno.springbootecommerceapi.entity.Order;
import com.roczyno.springbootecommerceapi.entity.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Long> {
	@Query("select o from Order o where o.user=:user and(o.orderStatus='PLACED' or o.orderStatus='CONFIRMED')")
	List<Order> findUserOrders(@Param("user") User user);
}
