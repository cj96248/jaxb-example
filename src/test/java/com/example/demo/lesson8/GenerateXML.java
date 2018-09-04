package com.example.demo.lesson8;

import javax.xml.bind.JAXB;

import org.junit.Test;

public class GenerateXML {

	@Test
	public void test1() {
		JAXB.marshal(new One(), System.out);
	}
}
