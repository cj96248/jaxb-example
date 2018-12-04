package com.example.demo.lesson17;

import java.io.Serializable;

import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name= "Employe")
@XmlAccessorType(XmlAccessType.FIELD)
public class Employe implements Serializable{

	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	void beforeUnmarshal(Unmarshaller unmarshaller, Object parent) {
		System.out.println("调用Unmarshaller之前");
	}
	void afterUnmarshal(Unmarshaller unmarshaller, Object parent) {
		System.out.println("调用Unmarshaller之后");
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
}
