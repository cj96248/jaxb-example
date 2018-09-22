package com.example.demo.lesson11;

import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "Order")
@XmlAccessorType(XmlAccessType.FIELD)
public class Order5 {

	@XmlAnyAttribute
	private Map<QName, String> properties;
	
	private Product product;

	public Map<QName, String> getProperties() {
		return properties;
	}

	public void setProperties(Map<QName, String> properties) {
		this.properties = properties;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
}
