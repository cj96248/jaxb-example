package com.example.demo.lesson12;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Food {

	private String name;
	@XmlElementRef(name="ref1")
	private JAXBElement<Fruit> element;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	@XmlElementRef(name="ref1")
	public JAXBElement<Fruit> getElement() {
		return element;
	}
	public void setElement(JAXBElement<Fruit> element) {
		this.element = element;
	}
	
}
