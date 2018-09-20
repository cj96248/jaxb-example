package com.example.demo.lesson10;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Six")
public class Six {

	private String code;
	private String name;
	private String desc;
	
	public Six() {}
	
	public Six(String code, String name, String desc) {
		super();
		this.code = code;
		this.name = name;
		this.desc = desc;
	}

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
	
}
