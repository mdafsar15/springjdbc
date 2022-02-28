package com.genx.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.genx.springjdbc.dao.StudentDao;
import com.genx.springjdbc.entity.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("mysql.........");

		ApplicationContext context = new ClassPathXmlApplicationContext("com/genx/springjdbc/config.xml");

		StudentDao dao = context.getBean("studentDao", StudentDao.class);

		Student s = new Student();

		s.setId(1);
		s.setSname("Aryan");
		s.setCity("Delhi");

		int r = dao.insert(s);

		System.out.println("data inserted successfully " + r);

	}
}




