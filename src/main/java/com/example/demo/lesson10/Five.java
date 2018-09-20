package com.example.demo.lesson10;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Five {
	
	private String name;
	private Four four;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Four getFour() {
		return four;
	}
	public void setFour(Four four) {
		this.four = four;
	}
}
