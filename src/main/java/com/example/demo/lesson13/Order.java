package com.example.demo.lesson13;

import javax.xml.bind.annotation.XmlRootElement;

import com.example.demo.lesson11.Product;

@XmlRootElement
public class Order {
	private String id;
	private Product product;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
}
