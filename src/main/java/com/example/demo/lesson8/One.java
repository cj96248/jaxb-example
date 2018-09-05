package com.example.demo.lesson8;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class One {

	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "One [ name=" + name + "]";
	}
}
