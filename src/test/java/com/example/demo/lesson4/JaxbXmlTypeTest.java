package com.example.demo.lesson4;

import javax.xml.bind.JAXB;

import org.junit.Test;

public class JaxbXmlTypeTest {

	@Test
	public void test_common() throws Exception {
		Grade grade = new Grade("1001", "二年级", 1);
		JAXB.marshal(grade, System.out);
//		<grade>
//		    <id>1001</id>
//		    <名称>二年级</名称>
//		    <ranking>1</ranking>
//	    </grade>
	}
	@Test
	public void test_name() throws Exception {
		Grade grade = new Grade("1002", null, 2);
		JAXB.marshal(grade, System.out);
//		<grade>
//		    <id>1002</id>
//		    <名称 xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:nil="true"/>
//		    <ranking>2</ranking>
//	    </grade>
	}
	

}
