package com.example.demo.lesson16;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Note {

	private String to;
	private String from;
	private String heading;
	private String body;
	
	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getHeading() {
		return heading;
	}

	public void setHeading(String heading) {
		this.heading = heading;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Note [to=" + to + ", from=" + from + ", heading=" + heading + ", body=" + body + "]";
	}
}
