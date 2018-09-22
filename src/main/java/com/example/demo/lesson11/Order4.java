package com.example.demo.lesson11;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Order")
@XmlAccessorType(XmlAccessType.FIELD)
public class Order4 {

	private String id;
	private Double price;
	@XmlElementWrapper(name = "Products")
	@XmlAnyElement
	private List<Object> product;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public List<Object> getProduct() {
		return product;
	}
	public void setProduct(List<Object> product) {
		this.product = product;
	}
}
