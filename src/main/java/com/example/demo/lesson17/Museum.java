package com.example.demo.lesson17;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement( name = "MUSEUM" )
@XmlType( propOrder = { "name", "city", "special" } )
@XmlAccessorType(XmlAccessType.FIELD)
public class Museum {

	@XmlElement(name = "MUSEUM_NAME")
	String name;
	@XmlAttribute(name = "children_allowed", required=false)
	Boolean childrenAllowed;
	@XmlElement(name = "CITY")
	String city;
	@XmlElement(name = "PERMANENT_EXHIBITION")
	Exhibition special;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getChildrenAllowed() {
		return childrenAllowed;
	}
	public void setChildrenAllowed(Boolean childrenAllowed) {
		this.childrenAllowed = childrenAllowed;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Exhibition getSpecial() {
		return special;
	}
	public void setSpecial(Exhibition special) {
		this.special = special;
	}
	@Override
	public String toString() {
		return "Museum [name=" + name + ", childrenAllowed=" + childrenAllowed + ", city=" + city + ", special="
				+ special + "]";
	}
}
