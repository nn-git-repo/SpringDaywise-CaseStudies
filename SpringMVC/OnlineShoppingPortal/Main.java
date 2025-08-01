package com.example.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.service.OrderService;

public class Main {

	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		 OrderService orderService = context.getBean(OrderService.class);


	        orderService.addToCart("Laptop");
	        orderService.placeOrder("ORD123");
	        try {
	            orderService.placeOrder("INVALID_ID");
	        } catch (Exception e) {
	            // Exception is logged by @AfterThrowing advice
	        }
	        orderService.cancelOrder("ORD123");

	}

}
