package com.example.demo.lesson4;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Student", namespace="http://www.w3cschool.org/jaxb2")
public class StudentC {

	private String id;
	
	private String name;
	
	private Integer age;
	
	public StudentC() {
	}
	public StudentC(String id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "StudentA [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}
