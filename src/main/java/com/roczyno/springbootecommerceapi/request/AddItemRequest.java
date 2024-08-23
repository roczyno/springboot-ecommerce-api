package com.roczyno.springbootecommerceapi.request;

public record AddItemRequest(
		 int size,
		 int quantity,
		 Integer price
) {
}
