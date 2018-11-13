package com.example.demo.lesson12;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;

import org.junit.Ignore;
import org.junit.Test;

public class GenerateXML {
	
	@Test
	@Ignore
	public void test1() throws JAXBException {
		Fruit fruit = new Fruit();
		fruit.setColor("red");
		
		JAXB.marshal(fruit, System.out);
	}

	@Test
	@Ignore
	public void test2() throws JAXBException {
		Fruit fruit = new Fruit();
		fruit.setColor("red");
		
		JAXBElement<Fruit> element = new JAXBElement<Fruit>(new QName("新鲜水果"), Fruit.class, fruit);
		
		JAXB.marshal(element, System.out);
	}
	
	@Test
	@Ignore
	public void test2_2() throws JAXBException {
		GreenFruit fruit = new GreenFruit();
		fruit.setColor("Green");
		
		JAXBElement<GreenFruit> element = new JAXBElement<GreenFruit>(new QName("绿色水果"), GreenFruit.class, fruit);
		JAXB.marshal(element, System.out);
	}
	
	@Test
	@Ignore
	public void test3() throws JAXBException {
		GreenFruit fruit = new GreenFruit();
		fruit.setColor("Green");
		
		JAXBElement<GreenFruit> element = new JAXBElement<GreenFruit>(new QName("绿色水果"), GreenFruit.class, fruit);
		JAXB.marshal(element, System.out);
	}
	@Test
	@Ignore
	public void test4() throws JAXBException {
		Fruit fruit = new Fruit();
		fruit.setColor("red");
		
		JAXBElement<Fruit> element = new JAXBElement<Fruit>(new QName("生鲜水果"), Fruit.class, fruit);
		Food food = new Food();
		food.setName("Some foods");
		food.setElement(element);
		
		JAXBContext context = JAXBContext.newInstance(Fruit.class,Food.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		marshaller.marshal(food, System.out);
	}
	
	@Test
	@Ignore
	public void test5() throws JAXBException {
		Pomelo pomelo = new Pomelo();
		pomelo.setName("柚子");
		pomelo.setColor("Orange");
		
		Product product = new Product();
		product.setFruit(pomelo);
		product.setId("1205");
		
		JAXBContext context = JAXBContext.newInstance(Product.class,Pomelo.class,Fruit.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		marshaller.marshal(product, System.out);
	}
	
	@Test
	@Ignore
	public void test5_2() throws JAXBException {
		Watermelon watermelon = new Watermelon();
		watermelon.setShape("椭圆形");
		watermelon.setColor("Green");
		
		Product product = new Product();
		product.setFruit(watermelon);
		product.setId("1205");
		
		JAXBContext context = JAXBContext.newInstance(Product.class,Watermelon.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		marshaller.marshal(product, System.out);
	}
	
	@Test
	public void test5_3() throws JAXBException {
		Watermelon watermelon = new Watermelon();
		watermelon.setShape("椭圆形");
		watermelon.setColor("Green");
		
		Product product = new Product();
		product.setFruit(watermelon);
		product.setId("1205");
		
		JAXB.marshal(product, System.out);
	}
	
}
