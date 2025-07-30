package com.example.hospital;

public class Appointment {

	private String doctor;
    private String date;

    public void bookAppointment() {
        System.out.println("Appointment booked with Dr. " + doctor + " on " + date);
    }

    public void cancelAppointment() {
        System.out.println("Appointment with Dr. " + doctor + " on " + date + " is cancelled.");
    }

    // Setters
    public void setDoctor(String doctor) { this.doctor = doctor; }
    public void setDate(String date) { this.date = date; }
	
	
}
