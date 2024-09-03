package com.roczyno.springbootecommerceapi.repository;

import com.roczyno.springbootecommerceapi.entity.Product;
import com.roczyno.springbootecommerceapi.entity.Review;
import com.roczyno.springbootecommerceapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ReviewRepository extends JpaRepository<Review,Long> {
	List<Review> findByProduct(Product product);

	Optional<Review> findByUserAndProduct(User user, Product product);
}
