package com.example.demo.lesson13;

import java.util.Arrays;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBException;

import org.junit.Test;

public class GenerateXML {
	
	@Test 
	public void test1() throws JAXBException {
		Product product = new Product();
		product.setId("1301");
		product.setItem(Arrays.asList("ItemA","ItemB","ItemC"));
		
		JAXB.marshal(product, System.out);
	}
	
	@Test
	public void test2() throws JAXBException {
		Product2 product = new Product2();
		product.setId("1302");
		product.setItem(Arrays.asList("ItemA","ItemB","ItemC"));
		
		JAXB.marshal(product, System.out);
	}
	@Test
	public void test3() throws JAXBException {
		Product3 product = new Product3();
		product.setId("1303");
		product.setItem(Arrays.asList(new Item("13031","ItemA"),new Item("13032","ItemB"),new Item("13033","ItemC")));
		
		JAXB.marshal(product, System.out);
	}
	@Test
	public void test4() throws JAXBException {
		Product4 product = new Product4();
		product.setId("1304");
		product.setItem(Arrays.asList("ItemA","ItemB","ItemC"));
		
		JAXB.marshal(product, System.out);
	}
}
