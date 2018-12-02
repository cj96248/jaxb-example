package com.example.demo.lesson16;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.net.URL;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.stream.StreamSource;

import org.junit.Ignore;
import org.junit.Test;
import org.w3c.dom.Document;

public class GenerateBean {
	
	@Test
	@Ignore
	public void test1() throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Employee.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Employee employee = (Employee)unmarshaller.unmarshal(new File("./src/test/resources/lesson16.xml"));
		System.out.println(employee);//Employee [id=111, name=Test]
	}
	
	@Test
	@Ignore
	public void test11() throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Employee.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Employee employee = (Employee)unmarshaller.unmarshal(GenerateBean.class.getResourceAsStream("/lesson16.xml"));
		System.out.println(employee);//Employee [id=111, name=Test]
	}
	
	@Test
	@Ignore
	public void test2() throws JAXBException, IOException {
		JAXBContext context = JAXBContext.newInstance(Employee.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		InputStream is = new FileInputStream("./src/test/resources/lesson16.xml");
		Employee employee = (Employee)unmarshaller.unmarshal(is);
		System.out.println(employee);//Employee [id=111, name=Test]
	}
	@Test
	@Ignore
	public void test3() throws JAXBException, IOException {
		JAXBContext context = JAXBContext.newInstance(Note.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		URL url = new URL("http://www.w3school.com.cn/example/xmle/note.xml");
		Note note = (Note)unmarshaller.unmarshal(url);
		System.out.println(note);//Note [to=George, from=John, heading=Reminder, body=Don't forget the meeting!]
	}
	@Test
	@Ignore
	public void test4() throws JAXBException, IOException {
		JAXBContext context = JAXBContext.newInstance(Employee.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		String xmlStr = "<Employee><id>1504</id><name>Test</name></Employee>";
		Employee employee = (Employee)unmarshaller.unmarshal(new StreamSource(new StringReader(xmlStr)));
		System.out.println(employee);//Employee [id=1504, name=Test]
	}
	
	@Test
	@Ignore
	public void test5() throws Exception {
		JAXBContext context = JAXBContext.newInstance(Employee.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		//创建 Document
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document document = db.parse(new File("./src/test/resources/lesson16.xml"));
		Employee employee = (Employee)unmarshaller.unmarshal(document);
		System.out.println(employee);//Employee [id=111, name=Test]
	}
	
	@Test
	public void test6() throws Exception {
		JAXBContext context = JAXBContext.newInstance(Employee.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		//创建 Document
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document document = db.parse(new File("./src/test/resources/lesson16.xml"));
		JAXBElement<Employee> ele = unmarshaller.unmarshal(document, Employee.class);
		System.out.println(ele.getValue());//Employee [id=111, name=Test]
	}
	
	@Test
	public void test7() throws JAXBException {
		Employee employee = JAXB.unmarshal(new File("./src/test/resources/lesson16.xml"), Employee.class);
		System.out.println(employee);//Employee [id=111, name=Test]
	}
	
}
