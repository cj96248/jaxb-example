package com.example.demo.lesson10;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.junit.Ignore;
import org.junit.Test;

import com.example.demo.lesson10.Two;

public class GenerateXML {

	@Test
	@Ignore
	public void test() throws JAXBException {
		// 首先创建 JAXBContext
		JAXBContext context = JAXBContext.newInstance(Two.class);
		// 初始化 Marshaller
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		// 创建简单的 Java bean
		Two o = new Two();
		o.setName("Test two");
		// 将结果输出到控制台
		marshaller.marshal(o, System.out);
	}
	
	@Test
	@Ignore
	public void test3() throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Three.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		Three t = new Three();
		t.setName("Test three");
		marshaller.marshal(t, System.out);
	}
	
	@Test
	@Ignore
	public void test4() throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Four.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		Four f = new Four();
		f.setId("1004");
		f.setName("Test 4");
		marshaller.marshal(f, System.out);
	}
	
	@Test
	@Ignore
	public void test5() throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Five.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		Four four = new Four();
		four.setName("This is 4");
		
		Five five = new Five();
		five.setName("Test 5");
		five.setFour(four);
		
		marshaller.marshal(five, System.out);
	}
	
	@Test
	@Ignore
	public void test6() throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Six.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		Six six = new Six("1006", "Test6", "Some descrptions");
		
		marshaller.marshal(six, System.out);
	}
	
	@Test
	@Ignore
	public void test7() throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Seven.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		Seven s = new Seven();
		s.setCode("1007");
		s.setName("Test name");
		s.setAge(22);
		s.setDesc("The desc");
		s.setSlary(21.45);
		
		marshaller.marshal(s, System.out);
	}
	
	@Test
	@Ignore
	public void test8() throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Eight.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		Eight e = new Eight();
		e.setCode("1007");
		e.setName("Test name");
		
		marshaller.marshal(e, System.out);
	}
	
	@Test
	public void test9() throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Nine.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		Nine n = new Nine();
		n.setCode("1009");
		n.setName("Test case");
		n.setAge(22);
		n.setDesc("The desc");
		n.setSlary(29.99);
		
		marshaller.marshal(n, System.out);
	}
	
}
