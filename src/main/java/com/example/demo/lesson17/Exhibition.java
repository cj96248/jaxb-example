package com.example.demo.lesson17;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Exhibition {

	@XmlElement(name = "NAME")
	String name;
	@XmlElement(name = "ARTIST")
	List<String> artist;
	@XmlElement(name = "FROM")
	String from;
	@XmlElement(name = "TO")
	String to;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getArtist() {
		return artist;
	}
	public void setArtist(List<String> artist) {
		this.artist = artist;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	@Override
	public String toString() {
		return "Exhibition [name=" + name + ", artist=" + artist + ", from=" + from + ", to=" + to + "]";
	}
	
}
