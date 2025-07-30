package com.example.hospital;

public class Billing {

	 private double amount;

	    public void generateBill() {
	        System.out.println("Bill generated: ₹" + amount);
	    }

	    public void sendBill() {
	        System.out.println("Bill of ₹" + amount + " sent to patient's email.");
	    }

	    // Setter
	    public void setAmount(double amount) { this.amount = amount; }
}
