package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
	  public void addToCart(String product) {
	        System.out.println("Product added to cart: " + product);
	    }

	    public void placeOrder(String orderId) {
	        if (orderId.equals("INVALID_ID")) {
	            throw new RuntimeException("OrderNotFoundException");
	        }
	        System.out.println("Order placed successfully: " + orderId);
	    }

	    public void cancelOrder(String orderId) {
	        System.out.println("Order cancelled: " + orderId);
	    }
}
