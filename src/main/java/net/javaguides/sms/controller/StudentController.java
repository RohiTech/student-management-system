package net.javaguides.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import net.javaguides.sms.entity.Student;
import net.javaguides.sms.service.StudentService;

@Controller
public class StudentController {
	
	private StudentService studentService;
	
	public StudentController() {
		
	}

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	// handler method to handle list students and return mode and view
	@GetMapping("/students")
	//public String listStudents(@RequestBody Model model) {
	public String listStudents(@RequestBody Student student) {
		//model.addAttribute("students", studentService.getAllStudents());
		//return "students";
		System.out.println("object: " + student.getFirstName()+"="+student.getEmail()+" = "+student.getLastName());
        //studentService.saveStudent(student);
        return "redirect:/students";
	}
}
