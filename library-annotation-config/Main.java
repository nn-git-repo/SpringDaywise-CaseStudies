package com.example.library;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan("com.example.library")
public class Main {

	public static void main(String[] args) {
		  AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
	        LibraryService service = context.getBean(LibraryService.class);
	        service.manageLibrary();

	}

}
