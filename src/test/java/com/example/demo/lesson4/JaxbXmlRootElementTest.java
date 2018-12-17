package com.example.demo.lesson4;

import javax.xml.bind.JAXB;

import org.junit.Test;

public class JaxbXmlRootElementTest {

	@Test
	public void test_common() throws Exception {
		StudentA stu = new StudentA("001", "Tom", 22);
		JAXB.marshal(stu, System.out);
//		<studentA>
//		    <age>22</age>
//		    <id>001</id>
//		    <name>Tom</name>
//	    </studentA>
	}
	
	@Test
	public void test_name() throws Exception {
		StudentB stu = new StudentB("002", "Tom", 22);
		JAXB.marshal(stu, System.out);
//		<MyStudent>
//		    <age>22</age>
//		    <id>002</id>
//		    <name>Tom</name>
//		</MyStudent>
	}
	@Test
	public void test_namespace() throws Exception {
		StudentC stu = new StudentC("003", "Tom", 22);
		JAXB.marshal(stu, System.out);
//		<ns2:Student xmlns:ns2="http://www.w3cschool.org/jaxb2">
//		    <age>22</age>
//		    <id>003</id>
//		    <name>Tom</name>
//		 </ns2:Student>
	}
}
