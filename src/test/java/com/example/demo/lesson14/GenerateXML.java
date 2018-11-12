package com.example.demo.lesson14;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBException;

import org.junit.Test;

public class GenerateXML {
	
	@Test
	public void test1() throws JAXBException {
		Map<String, String> map = new HashMap<>();
		map.put("衣服", "大衣");
		map.put("裤子", "西裤");
		Product product = new Product();
		product.setId("1401");
		product.setItem(map);
		
		JAXB.marshal(product, System.out);
	}
	
	@Test 
	public void test2() throws JAXBException {
		Map<String, String> map = new HashMap<>();
		map.put("衣服", "大衣");
		map.put("裤子", "西裤");
		Product2 product = new Product2();
		product.setId("1402");
		product.setCategory(map);
		
		JAXB.marshal(product, System.out);
	}
}
