package com.example.demo.lesson15;

public class WaterMelon implements Fruit{
	
	public WaterMelon() {
	}
	public WaterMelon(String color) {
		this.color = color;
	}
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
