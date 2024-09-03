package com.roczyno.springbootecommerceapi.controller;

import com.roczyno.springbootecommerceapi.request.ReviewRequest;
import com.roczyno.springbootecommerceapi.service.ReviewService;
import com.roczyno.springbootecommerceapi.util.ResponseHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("review")
@RequiredArgsConstructor
public class ReviewController {
	private final ReviewService reviewService;

	@PostMapping
	public ResponseEntity<Object> createReview(@RequestBody ReviewRequest req, Authentication user){
		return ResponseHandler.successResponse(reviewService.createReview(req,user), HttpStatus.OK);
	}
	@GetMapping("/product/{productId}")
	public ResponseEntity<Object> getProductReviews(@PathVariable Long productId){
		return ResponseHandler.successResponse(reviewService.getProductReviews(productId),HttpStatus.OK);
	}
	@GetMapping("/{reviewId}")
	public ResponseEntity<Object> getReview(@PathVariable Long reviewId){
		return ResponseHandler.successResponse(reviewService.getReview(reviewId),HttpStatus.OK);
	}
	@DeleteMapping("/{reviewId}")
	public ResponseEntity<Object> deleteReview(@PathVariable Long reviewId,Authentication user){
		return ResponseHandler.successResponse(reviewService.deleteReview(reviewId,user),HttpStatus.OK);
	}
	@PutMapping("/{reviewId}")
	public ResponseEntity<Object> updateReview(@PathVariable Long reviewId,Authentication user,@RequestBody ReviewRequest req){
		return ResponseHandler.successResponse(reviewService.updateReview(reviewId,user,req),HttpStatus.OK);
	}

}
