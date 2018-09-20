package com.example.demo.lesson10;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder = {"code", "name", "age", "desc"})
public class Seven {

	private String code;
	private String name;
	private String desc;
	private int age;
	private double slary;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSlary() {
		return slary;
	}
	@XmlTransient
	public void setSlary(double slary) {
		this.slary = slary;
	}
	
}
