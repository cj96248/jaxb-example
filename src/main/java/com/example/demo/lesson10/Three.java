package com.example.demo.lesson10;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Three {
	private String name;
	public String getName() {
		return name;
	}
	@XmlElement(name = "Naming")
	public void setName(String name) {
		this.name = name;
	}
}
