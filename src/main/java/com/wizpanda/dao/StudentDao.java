package com.wizpanda.dao;

import java.util.List;

import com.wizpanda.bean.Student;

public interface StudentDao {
	
	public Student loginStudent(String email);
	public List<Student> getAllStudents();
	public Student registerStudent(Student student);
	
}
