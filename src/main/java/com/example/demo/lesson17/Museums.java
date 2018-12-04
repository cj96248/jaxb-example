package com.example.demo.lesson17;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MUSEUMS")
@XmlAccessorType(XmlAccessType.FIELD)
public class Museums {
	
	@XmlElement(name = "MUSEUM")
	List<Museum> museums;

	@XmlElement(name = "TOTAL")
	String total;

	@Override
	public String toString() {
		return "Museums [museums=" + museums + ", total=" + total + "]";
	}

	public List<Museum> getMuseums() {
		return museums;
	}

	public void setMuseums(List<Museum> museums) {
		this.museums = museums;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}
	
}