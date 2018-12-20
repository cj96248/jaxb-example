package com.example.demo.lesson4;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Desk {

	private String id;
	private String owner;
	
	public Desk() {
		super();
	}
	public Desk(String id, String owner) {
		super();
		this.id = id;
		this.owner = owner;
	}
	public String getId() {
		return id;
	}
	@XmlAttribute
	public void setId(String id) {
		this.id = id;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	@Override
	public String toString() {
		return "Desk [id=" + id + ", owner=" + owner + "]";
	}
	
}
