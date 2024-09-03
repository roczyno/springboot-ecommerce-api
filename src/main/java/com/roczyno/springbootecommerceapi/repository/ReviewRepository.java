package com.roczyno.springbootecommerceapi.repository;

import com.roczyno.springbootecommerceapi.entity.Product;
import com.roczyno.springbootecommerceapi.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review,Long> {
	List<Review> findByProduct(Product product);
}
