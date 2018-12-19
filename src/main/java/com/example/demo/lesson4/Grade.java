package com.example.demo.lesson4;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Grade {
	private String id;

	private String name;

	private int ranking;

	public Grade() {
		super();
	}

	public Grade(String id, String name, int ranking) {
		super();
		this.id = id;
		this.name = name;
		this.ranking = ranking;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	@XmlElement(name = "名称", defaultValue = "一年级", nillable = true, required = true)
	public void setName(String name) {
		this.name = name;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	@Override
	public String toString() {
		return "Grade [id=" + id + ", name=" + name + ", ranking=" + ranking + "]";
	}

}
