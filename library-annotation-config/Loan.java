package com.example.library;

import org.springframework.stereotype.Component;

@Component
public class Loan {
	 public void issueBook() {
	        System.out.println("Book has been issued to member.");
	    }

	    public void returnBook() {
	        System.out.println("Book returned to library.");
	    }
	
	
}
