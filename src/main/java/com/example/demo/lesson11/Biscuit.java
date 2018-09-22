package com.example.demo.lesson11;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Biscuit")
public class Biscuit {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
