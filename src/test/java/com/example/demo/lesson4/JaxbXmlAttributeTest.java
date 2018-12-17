package com.example.demo.lesson4;

import javax.xml.bind.JAXB;

import org.junit.Test;

public class JaxbXmlAttributeTest {

	@Test
	public void test_common() throws Exception {
		Desk desk = new Desk("004", "Tom");
		JAXB.marshal(desk, System.out);
//		<desk id="004">
//	    	<owner>Tom</owner>
//	    </desk>
	}
	

}
