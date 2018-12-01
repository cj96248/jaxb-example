package com.example.demo.lesson15;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class ManAdapter extends XmlAdapter<AbstractMan, Human>{

	@Override
	public Human unmarshal(AbstractMan v) throws Exception {
		return v;
	}

	@Override
	public AbstractMan marshal(Human v) throws Exception {
		return (AbstractMan) v;
	}

}
