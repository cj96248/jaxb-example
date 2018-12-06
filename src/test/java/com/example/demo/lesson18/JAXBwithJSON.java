package com.example.demo.lesson18;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.eclipse.persistence.jaxb.MarshallerProperties;
import org.eclipse.persistence.jaxb.UnmarshallerProperties;
import org.junit.Ignore;
import org.junit.Test;

public class JAXBwithJSON {
	
	@Test
	public void objToJSON() throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Employee.class);
		Employee e = new Employee();
		e.setId("1801");
		e.setName("Dev");
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(MarshallerProperties.MEDIA_TYPE, "application/json");
		marshaller.marshal(e, System.out);
		//{"Employee":{"id":"1801","name":"Dev"}}
	}
	
	@Test
	public void objToJSON2() throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Employee.class);
		Employee e = new Employee();
		e.setId("1802");
		e.setName("Dev");
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.setProperty(MarshallerProperties.MEDIA_TYPE, "application/json");
		marshaller.marshal(e, System.out);
//		{
//		   "Employee" : {
//		      "id" : "1802",
//		      "name" : "Dev"
//		   }
//		}
	}
	
	@Test
	public void objToJSON3() throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Employee.class);
		Employee e = new Employee();
		e.setId("1803");
		e.setName("Dev");
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.setProperty(MarshallerProperties.MEDIA_TYPE, "application/json");
		marshaller.setProperty(MarshallerProperties.JSON_INCLUDE_ROOT, false);
		marshaller.marshal(e, System.out);
//		{
//			   "id" : "1803",
//			   "name" : "Dev"
//		}
	}
	
	@Test
	public void objToJSON4() throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Employee.class);
		Employee e = new Employee();
		e.setId("1803");
		e.setName("Dev");
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.setProperty(MarshallerProperties.MEDIA_TYPE, "application/json");
		marshaller.setProperty(MarshallerProperties.JSON_INCLUDE_ROOT, false);
		marshaller.marshal(e, System.out);
//		{
//			   "id" : "1803",
//			   "name" : "Dev"
//		}
	}
	
	@Test
	public void JSONtoObj() throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Employee.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		String json = "{\"Employee\":{\"id\":\"1801\",\"name\":\"Dev\"}}";
		unmarshaller.setProperty(UnmarshallerProperties.MEDIA_TYPE, "application/json");
		unmarshaller.setProperty(UnmarshallerProperties.JSON_INCLUDE_ROOT, true);
		Employee employe = (Employee)unmarshaller.unmarshal(new StringReader(json));
		System.out.println(employe);//Employee [id=1801, name=Dev]
	}
	
}
