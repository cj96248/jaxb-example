package com.example.demo.lesson12;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

	@XmlElementDecl(name = "ref1")
	public JAXBElement<Fruit> customElement(Fruit fruit){
		return null;
	}
}
