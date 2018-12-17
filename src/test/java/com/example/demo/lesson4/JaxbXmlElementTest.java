package com.example.demo.lesson4;

import javax.xml.bind.JAXB;

import org.junit.Test;

public class JaxbXmlElementTest {

	@Test
	public void test_common() throws Exception {
		TeacherA teacherA = new TeacherA("001", "Tom", 22);
		JAXB.marshal(teacherA, System.out);
//		<teacherA>
//		    <id>001</id>
//		    <age>22</age>
//		    <name>Tom</name>
//		</teacherA>
	}
	

}
