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
		Session session = sf.openSession();
		Student student = (Student)session.get(Student.class, email);
		return student;
	}

	@Override
	public List<Student> getAllStudents() {
		Session session = sf.openSession();
		Query query = session.createSQLQuery("select * from student");
		List<Student> students = query.list();
		return students;
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
