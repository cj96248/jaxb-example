package com.example.demo.lesson13;

import javax.xml.bind.annotation.XmlValue;

public class Type {

	@XmlValue
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
