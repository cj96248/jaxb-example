package com.example.demo.lesson13;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBException;

import org.junit.Test;

public class GenerateXML {
	
	@Test
	public void test1() throws JAXBException {
		Order order = new Order();
		
		JAXB.marshal(order, System.out);
	}
}
