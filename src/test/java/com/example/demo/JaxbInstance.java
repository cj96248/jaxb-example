package com.example.demo;

import javax.xml.bind.JAXBContext;

import com.example.bean.Teacher;

public class JaxbInstance {
	
	public void simpleClass() throws Exception {
		JAXBContext instance = JAXBContext.newInstance(Student.class);
		System.out.println(instance);
	}
	
	public void multiClass() throws Exception {
		JAXBContext instance = JAXBContext.newInstance(Student.class, Teacher.class);
		System.out.println(instance);
	}

	public void simplePackage() throws Exception {
		JAXBContext instance = JAXBContext.newInstance("com.example.bean");
		System.out.println(instance);
	}
	
	public void multiPackage() throws Exception {
		JAXBContext instance = JAXBContext.newInstance("com.example.bean:com.example.pojo");
		System.out.println(instance);
	}
}
