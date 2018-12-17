package com.example.demo.lesson4;

import javax.xml.bind.JAXB;

import org.junit.Test;

public class JaxbXmlTransientTest {

	@Test
	public void test_common() throws Exception {
		Book book = new Book("1234005", "Java", 23.5);
		JAXB.marshal(book, System.out);
//		<book>
//		    <name>Java</name>
//		    <price>23.5</price>
//	    </book>
	}
	

}
