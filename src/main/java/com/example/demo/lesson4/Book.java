package com.example.demo.lesson4;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
public class Book {
	@XmlTransient
	private String isbn;
	private String name;
	private double price;

	public Book() {
		super();
	}

	public Book(String isbn, String name, double price) {
		super();
		this.isbn = isbn;
		this.name = name;
		this.price = price;
	}

	public String getIsbn() {
		return isbn;
	}
	@XmlTransient
	@XmlElement
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", name=" + name + ", price=" + price + "]";
	}

}
