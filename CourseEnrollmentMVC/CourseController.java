package com.example.enrollment.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.enrollment.model.Course;
import com.example.enrollment.model.Student;

@Controller
public class CourseController {

	
	  @RequestMapping("/courses")
	    public String showCourses(Model model) {
	        List<Course> courses = new ArrayList<>();
	        courses.add(new Course("C101", "Java Basics"));
	        courses.add(new Course("C102", "Spring MVC"));
	        courses.add(new Course("C103", "Advanced Java"));
	        model.addAttribute("courses", courses);
	        return "courses";
	    }

	    @RequestMapping("/enroll")
	    public String enrollForm(Model model) {
	        model.addAttribute("student", new Student());
	        return "enroll";
	    }

	    @PostMapping("/submitEnrollment")
	    public String submitEnrollment(@ModelAttribute("student") Student student, Model model) {
	        model.addAttribute("student", student);
	        return "success";
	    }
}
