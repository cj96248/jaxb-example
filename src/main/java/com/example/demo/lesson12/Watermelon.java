package com.example.demo.lesson12;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Watermelon extends Fruit{

	private String shape;

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}
}
