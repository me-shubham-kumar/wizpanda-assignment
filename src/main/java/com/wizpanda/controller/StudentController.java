package com.wizpanda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wizpanda.bean.Student;
import com.wizpanda.service.StudentService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@RequestMapping(value = "student/create",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE,
			method = RequestMethod.POST)
	public Student createProfile(@RequestBody Student student){
		Student newStudent = studentService.register(student);
		System.out.println(newStudent);
		return newStudent;
	}
	
	@RequestMapping(value = "login",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE,
			method = RequestMethod.POST)
	public Student loginStudent(@RequestBody Student student){
		System.out.println(student);
		return studentService.login(student);
		
	}
	
	@RequestMapping(value = "students",
			produces = MediaType.APPLICATION_JSON_VALUE,
			method = RequestMethod.GET)
	public List<Student> getAllStudents(){
		return studentService.getAllStudent();
	}
	
	@RequestMapping(value="sayHello")
	public String sayHello() {
		return "Hello Hello";
	}
	

}
