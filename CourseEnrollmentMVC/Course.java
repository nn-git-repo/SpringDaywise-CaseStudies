package com.example.enrollment.model;

public class Course {
	  private String code;
	    private String name;

	    
	    
	    public Course() {
			
		}
	    
	    
		public Course(String code, String name) {
		
			this.code = code;
			this.name = name;
		}


		// Getters and Setters
	    public String getCode() { return code; }
	    public void setCode(String code) { this.code = code; }

	    public String getName() { return name; }
	    public void setName(String name) { this.name = name; }
}
