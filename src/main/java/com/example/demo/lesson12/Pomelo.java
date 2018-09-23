package com.example.demo.lesson12;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Pomelo extends Fruit{

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
