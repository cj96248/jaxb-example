package com.example.demo.lesson8;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class One {

	private Integer id;
	private String name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "One [id=" + id + ", name=" + name + "]";
	}
}
