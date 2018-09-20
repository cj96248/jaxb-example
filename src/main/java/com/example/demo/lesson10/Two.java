package com.example.demo.lesson10;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Second")
public class Two {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Two [name=" + name + "]";
	}
	
}
