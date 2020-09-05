package com.wizpanda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wizpanda.bean.Student;
import com.wizpanda.dao.StudentDao;

@Service
public class StudentService {
	
	@Autowired
	StudentDao studentDao;
	
	public Student register(Student student) {
		return studentDao.registerStudent(student);
		
	}
	
	public Student login(Student student) {
		return studentDao.loginStudent(student.getEmail());
	}
	
	public List<Student> getAllStudent(){
		return studentDao.getAllStudents();
	}
	
}
