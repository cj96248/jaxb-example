package com.example.demo.lesson7;

import javax.xml.bind.JAXBContext;

import org.junit.Test;

public class JaxbInstance {
	@Test
	public void simpleClass() throws Exception {
		JAXBContext instance = JAXBContext.newInstance(Student.class);
		System.out.println(instance);
	}
	@Test
	public void multiClass() throws Exception {
		JAXBContext instance = JAXBContext.newInstance(Student.class, Teacher.class);
		System.out.println(instance);
	}

	@Test
	public void simplePackage() throws Exception {
		JAXBContext instance = JAXBContext.newInstance("com.example.bean");
		System.out.println(instance);
	}
	@Test
	public void multiPackage() throws Exception {
		JAXBContext instance = JAXBContext.newInstance("com.example.bean:com.example.pojo");
		System.out.println(instance);
	}
	
}
