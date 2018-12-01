package com.example.demo.lesson15;

import java.util.Arrays;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.junit.Ignore;
import org.junit.Test;

public class GenerateXML {
	@Test
	@Ignore
	public void test1() throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Zoo.class,Dog.class,Cat.class);
		Zoo zoo = new Zoo();
		zoo.setAnimals(Arrays.asList(new Dog(), new Cat()));
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(zoo, System.out);
	}
	
	@Test
	@Ignore
	public void test1_1() throws JAXBException {
		Zoo zoo = new Zoo();
		zoo.setAnimals(Arrays.asList(new Dog(), new Cat()));
		
		JAXB.marshal(zoo, System.out);
	}
	
	@Test
	@Ignore
	public void test2() throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Food.class,WaterMelon.class);
		Food food = new Food();
		food.setFruit1(new WaterMelon("Green"));
		food.setFruit2(new WaterMelon("Red"));
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(food, System.out);
	}
	
	@Test
	@Ignore
	public void test3() throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Worker.class,Man.class,Woman.class);
		Worker worker = new Worker();
		Man man = new Man();
		man.name = "Zhangsan";
		worker.employe = man;
		Woman woman = new Woman();
		woman.age = 24;
		worker.employee = woman;
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(worker, System.out);
	}
	@Test
	public void test3_2() throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Worker.class,Man.class,Woman.class);
		Worker worker = new Worker();
		Man man = new Man();
		man.name = "Zhangsan";
		worker.employe = man;
		Woman woman = new Woman();
		woman.age = 24;
		worker.employee = woman;
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(worker, System.out);
	}
}
