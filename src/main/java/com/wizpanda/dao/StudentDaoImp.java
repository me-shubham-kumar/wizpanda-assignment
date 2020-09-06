package com.wizpanda.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wizpanda.bean.Student;

@Repository
public class StudentDaoImp implements StudentDao{
	
	@Autowired
	SessionFactory sf;

	@Override
	public Student loginStudent(String email) {
		System.out.println("Email "+email);
		Session session = sf.openSession();
		Student student = (Student)session.get(Student.class, email);
		return student;
	}

	@Override
	public List<Student> getAllStudents() {
		Session session = sf.openSession();
		return session.createQuery("from Student").list();
	}

	@Override
	public Student registerStudent(Student student) {
		Session session = sf.openSession();
		session.getTransaction().begin();
			session.save(student);
		session.getTransaction().commit();
		return student;
	}
	
	
}
