package com.roczyno.springbootecommerceapi.service;

import com.roczyno.springbootecommerceapi.request.ReviewRequest;
import com.roczyno.springbootecommerceapi.response.ReviewResponse;
import org.springframework.security.core.Authentication;

import java.util.List;

public interface ReviewService {
	ReviewResponse createReview(ReviewRequest req, Authentication connected);
	List<ReviewResponse> getProductReviews(Long productId);
	String deleteReview(Long id,Authentication connectedUser);
	ReviewResponse updateReview(Long id,Authentication connectedUser,ReviewRequest req);
	ReviewResponse getReview(Long id);
}
