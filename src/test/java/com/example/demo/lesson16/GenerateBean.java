package com.example.demo.lesson15;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.net.URI;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

import org.junit.Ignore;
import org.junit.Test;

public class SerilalizerSimple {
	
	@Test
	@Ignore
	public void test1() throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Employee.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Employee employee = (Employee)unmarshaller.unmarshal(new File("./src/test/resources/lesson15.xml"));
		System.out.println(employee);//Employee [id=111, name=Test]
	}
	
	@Test
	@Ignore
	public void test11() throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Employee.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Employee employee = (Employee)unmarshaller.unmarshal(SerilalizerSimple.class.getResourceAsStream("/lesson15.xml"));
		System.out.println(employee);//Employee [id=111, name=Test]
	}
	
	@Test
	public void test2() throws JAXBException, IOException {
		JAXBContext context = JAXBContext.newInstance(Employee.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		InputStream is = new FileInputStream("./src/test/resources/lesson15.xml");
		Employee employee = (Employee)unmarshaller.unmarshal(is);
		System.out.println(employee);//Employee [id=111, name=Test]
	}
	@Test
	public void test3() throws JAXBException, IOException {
		JAXBContext context = JAXBContext.newInstance(Note.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		URL url = new URL("http://www.w3school.com.cn/example/xmle/note.xml");
		System.out.println(url);
		Note note = (Note)unmarshaller.unmarshal(url);
		System.out.println(note);//Note [to=null, from=null, heading=null, body=null]
	}
	@Test
	public void test4() throws JAXBException, IOException {
		JAXBContext context = JAXBContext.newInstance(Employee.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		String xmlStr = "<Employee><id>1504</id><name>Test</name></Employee>";
		Employee employee = (Employee)unmarshaller.unmarshal(new StreamSource(new StringReader(xmlStr)));
		System.out.println(employee);//Employee [id=1504, name=Test]
	}
	
	@Test
	public void test2X() throws JAXBException {
		String xmlStr = "<Employee><id>111</id><name>Test</name></Employee>";
		JAXBContext context = JAXBContext.newInstance(Note.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Employee employee = (Employee)unmarshaller.unmarshal(System.in);
		System.out.println(employee);//Employee [id=111, name=Test]
	}
	
	
}
