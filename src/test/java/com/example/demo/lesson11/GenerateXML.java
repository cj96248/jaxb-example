package com.example.demo.lesson11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;

import org.junit.Ignore;
import org.junit.Test;

public class GenerateXML {

	@Test
	@Ignore
	public void test1() throws JAXBException {
		Product p = new Product();
		p.setId("1100");
		p.setName("Apple");
		
		Order order = new Order();
		order.setId("1101");
		order.setPrice(23.45); 
		order.setProduct(p);
		
		JAXBContext context = JAXBContext.newInstance(Order.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		marshaller.marshal(order, System.out);
	}
	
	@Test
	@Ignore
	public void test2() throws JAXBException {
		Product p1 = new Product();
		p1.setId("11021");
		p1.setName("Apple");
		
		Product p2 = new Product();
		p2.setId("11022");
		p2.setName("Banana");
		
		List<Product> list = Arrays.asList(p1,p2);
		
		Order2 order = new Order2();
		order.setId("1102");
		order.setPrice(45.67); 
		order.setProduct(list);
		
		JAXBContext context = JAXBContext.newInstance(Order2.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		marshaller.marshal(order, System.out);
	}
	
	@Test
	@Ignore
	public void test3() throws JAXBException {
		Product p1 = new Product();
		p1.setId("11031");
		p1.setName("Apple");
		
		Product p2 = new Product();
		p2.setId("11032");
		p2.setName("Banana");
		
		List<Product> list = Arrays.asList(p1,p2);
		
		Order3 order = new Order3();
		order.setId("1103");
		order.setPrice(45.67); 
		order.setProduct(list);
		
		JAXBContext context = JAXBContext.newInstance(Order3.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		marshaller.marshal(order, System.out);
	}
	
	@Test
	@Ignore
	public void test3_2() throws JAXBException {
		Product p1 = new Product();
		p1.setId("11041");
		
		Product p2 = new Product();
		p2.setId("11042");
		p2.setName("Grape");
		
		List<Product> list = Arrays.asList(p1,p2);
		
		Order3 order = new Order3();
		order.setId("1104");
		order.setProduct(list);
		
		JAXBContext context = JAXBContext.newInstance(Order3.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		marshaller.marshal(order, System.out);
	}
	
	@Test
	@Ignore
	public void test4() throws JAXBException {
		Cake cake = new Cake();
		cake.setName("Nobel");
		
		Biscuit biscuit = new Biscuit();
		biscuit.setName("PB");
		
		List<Object> list = Arrays.asList(cake,biscuit);
		
		Order4 order = new Order4();
		order.setId("1104");
		order.setProduct(list);
		
		JAXBContext context = JAXBContext.newInstance(Order4.class, Cake.class, Biscuit.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		marshaller.marshal(order, System.out);
	}
	
	@Test
	public void test5() throws JAXBException {
		Product p = new Product();
		p.setId("1100");
		p.setName("Apple");
		
		Map<QName, String> map = new HashMap<>();
		map.put(new QName("id"), "1105");
		map.put(new QName("classification"), "food");
		map.put(new QName("type"), "fruit");
		
		Order5 order = new Order5();
		order.setProduct(p);
		order.setProperties(map);
		
		JAXBContext context = JAXBContext.newInstance(Order5.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		marshaller.marshal(order, System.out);
	}
}
