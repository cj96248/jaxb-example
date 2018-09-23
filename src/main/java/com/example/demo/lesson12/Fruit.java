package com.example.demo.lesson12;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "水果")
public class Fruit {

	private String color;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
