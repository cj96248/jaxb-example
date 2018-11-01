package com.example.demo.lesson13;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Product2 {

	@XmlAttribute
	private String id;
	
	@XmlElementWrapper(name = "Items")
	private List<String> item;
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<String> getItem() {
		return item;
	}

	public void setItem(List<String> item) {
		this.item = item;
	}
	
	
}
