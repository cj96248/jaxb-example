package com.example.demo.lesson8;

import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class GenerateXML {
	
	private static JAXBContext context;
	private static One one;
	
	@BeforeClass
	public static void init() throws JAXBException {
		// JAXBContext 是线程安全的 
		context = JAXBContext.newInstance(One.class);
		// 初始化全局的 Java bean
		one = new One();
		one.setName("Test one");
	}
	
	@Test
	@Ignore
	public void test() throws JAXBException {
		// 首先创建 JAXBContext
		JAXBContext jContext = JAXBContext.newInstance(One.class);
		// 初始化 Marshaller
		Marshaller marshaller = jContext.createMarshaller();
		// 创建简单的 Java bean
		One o = new One();
		o.setName("Test o");
		// 将结果输出到控制台
		marshaller.marshal(o, System.out);
	}

	@Test
	@Ignore
	public void test1() throws JAXBException {
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(one, System.out);
	}
	
	@Test
	@Ignore
	public void test2() throws JAXBException {
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-1");
		marshaller.marshal(one, System.out);
	}
	
	@Test
	@Ignore
	public void test3() throws JAXBException {
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd");
		marshaller.marshal(one, System.out);
	}
	
	@Test
	@Ignore
	public void test4() throws JAXBException {
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.setProperty(Marshaller.JAXB_NO_NAMESPACE_SCHEMA_LOCATION, "ehcache.xsd");
		marshaller.marshal(one, System.out);
	}
	
	@Test
	@Ignore
	public void test5_1() throws JAXBException {
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
		marshaller.marshal(one, System.out);
	}
	@Test
	public void test5_2() throws JAXBException {
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(one, new MyContentHandler());
	}
	@Test
	@Ignore
	public void test5_3() throws JAXBException {
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
		marshaller.marshal(one, new MyContentHandler());
	}
	
	
	@Test
	public void test66() throws Exception {
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
		FileOutputStream os = new FileOutputStream("file.xml");
		marshaller.marshal(one, os);
	}
}
