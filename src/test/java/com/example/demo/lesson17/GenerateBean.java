package com.example.demo.lesson17;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.junit.Ignore;
import org.junit.Test;

public class GenerateBean {

	@Test
	@Ignore
	public void test1() throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Employe.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		String xmlStr = "<Employe><id>1504</id><name>Test</name></Employe>";
		Employe employe = (Employe)unmarshaller.unmarshal(new StringReader(xmlStr));
		System.out.println(employe);//Employee [id=1504, name=Test]
	}
	
	@Test
	@Ignore
	public void test2() throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Employee.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		String xmlStr = "<employee id='17'>\r\n" + 
				"    <department>\r\n" + 
				"        <id>101</id>\r\n" + 
				"        <name>IT</name>\r\n" + 
				"    </department>\r\n" + 
				"    <FirstName>Lokesh</FirstName>\r\n" + 
				"    <id>1</id>\r\n" + 
				"    <lastName>Gupta</lastName>\r\n" + 
				"</employee>";
		Employee employee = (Employee)unmarshaller.unmarshal(new StringReader(xmlStr));
		System.out.println(employee);//Employee [id=17, firstName=Lokesh, lastName=Gupta, department=Department [id=101, name=IT]]
	}
	
	@Test
	public void test3() throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Museums.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		String xmlStr = "<MUSEUMS>\r\n" + 
				" <MUSEUM children_allowed=\"false\">\r\n" + 
				"   <MUSEUM_NAME>Reina Sofia Museum</MUSEUM_NAME>\r\n" + 
				"   <CITY>Madrid</CITY>\r\n" + 
				"   <PERMANENT_EXHIBITION>\r\n" + 
				"      <NAME>Permanent Exhibition - Reina Sofia Museum</NAME>\r\n" + 
				"      <ARTIST>Picasso</ARTIST>\r\n" + 
				"      <ARTIST>Dali</ARTIST>\r\n" + 
				"      <ARTIST>Miro</ARTIST>\r\n" + 
				"      <FROM>1900-01-01</FROM>\r\n" + 
				"      <TO>2014-12-31</TO>\r\n" + 
				"   </PERMANENT_EXHIBITION>\r\n" + 
				" </MUSEUM>\r\n" + 
				" <MUSEUM>\r\n" + 
				"   <MUSEUM_NAME>Louvre Museum</MUSEUM_NAME>\r\n" + 
				"   <CITY>Paris</CITY>\r\n" + 
				"   <PERMANENT_EXHIBITION>\r\n" + 
				"      <NAME>Permanent Exhibition - Louvre Museum</NAME>\r\n" + 
				"      <ARTIST>Leonardo da Vinci</ARTIST>\r\n" + 
				"      <ARTIST>Caravaggio</ARTIST>\r\n" + 
				"      <ARTIST>Delacroix</ARTIST>\r\n" + 
				"   </PERMANENT_EXHIBITION>\r\n" + 
				" </MUSEUM>\r\n" + 
				" <TOTAL>2</TOTAL>\r\n" + 
				"</MUSEUMS>";
		Museums museums = (Museums)unmarshaller.unmarshal(new StringReader(xmlStr));
		System.out.println(museums);
		//Museums [museums=[Museum [name=Reina Sofia Museum, childrenAllowed=false, city=Madrid, special=Exhibition [name=Permanent Exhibition - Reina Sofia Museum, artist=[Picasso, Dali, Miro], from=1900-01-01, to=2014-12-31]], Museum [name=Louvre Museum, childrenAllowed=null, city=Paris, special=Exhibition [name=Permanent Exhibition - Louvre Museum, artist=[Leonardo da Vinci, Caravaggio, Delacroix], from=null, to=null]]], total=2]
	}
	
}
