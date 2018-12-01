package com.example.demo.lesson15;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class MyAdapter extends XmlAdapter<WaterMelon, Fruit>{

	@Override
	public Fruit unmarshal(WaterMelon v) throws Exception {
		return v;
	}

	@Override
	public WaterMelon marshal(Fruit v) throws Exception {
		return (WaterMelon) v;
	}

}
