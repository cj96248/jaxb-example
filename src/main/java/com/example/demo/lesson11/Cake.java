package com.example.demo.lesson11;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Cake")
public class Cake {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
