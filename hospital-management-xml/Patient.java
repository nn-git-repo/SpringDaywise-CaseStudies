package com.example.hospital;

public class Patient {
	 private String name;
	    private int age;
	    private String gender;

	    public void registerPatient() {
	        System.out.println("Patient registered: " + name + ", Age: " + age + ", Gender: " + gender);
	    }

	    public void getPatientDetails() {
	        System.out.println("Patient Details: " + name + ", Age: " + age + ", Gender: " + gender);
	    }

	    // Setters
	    public void setName(String name) { this.name = name; }
	    public void setAge(int age) { this.age = age; }
	    public void setGender(String gender) { this.gender = gender; }
	}
	
	

