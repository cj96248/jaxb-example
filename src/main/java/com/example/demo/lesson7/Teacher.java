package com.example.demo.lesson7;

import java.beans.Transient;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Teacher {

	private String name;

	public String getName() {
		return name;
	}
	@Transient
	public void setName(String name) {
		this.name = name;
	}
	
}
