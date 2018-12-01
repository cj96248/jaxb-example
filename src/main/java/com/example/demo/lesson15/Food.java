package com.example.demo.lesson15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Food {

	public Fruit fruit1;
	public Fruit fruit2;
	public Fruit getFruit1() {
		return fruit1;
	}
	public void setFruit1(Fruit fruit1) {
		this.fruit1 = fruit1;
	}
	public Fruit getFruit2() {
		return fruit2;
	}
	public void setFruit2(Fruit fruit2) {
		this.fruit2 = fruit2;
	}
	
}
