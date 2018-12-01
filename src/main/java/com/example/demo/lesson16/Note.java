package com.example.demo.lesson15;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Note {

	private String to;
	private String from;
	private String heading;
	private String body;
	@Override
	public String toString() {
		return "Note [to=" + to + ", from=" + from + ", heading=" + heading + ", body=" + body + "]";
	}
}
