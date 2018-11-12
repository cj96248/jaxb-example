package com.example.demo.lesson14;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class MapAdapter extends XmlAdapter<XmlMap[], Map<String, String>>{

	@Override
	public Map<String, String> unmarshal(XmlMap[] v) throws Exception {
		Map<String, String> map = new HashMap<>();
		for(int i=0;i<v.length;i++) {
			XmlMap pairs = v[i];
			map.put(pairs.first, pairs.second);
		}
		return map;
	}

	@Override
	public XmlMap[] marshal(Map<String, String> v) throws Exception {
		XmlMap[] xmlMap = new XmlMap[v.size()];
		int index = 0;
		for(Map.Entry<String, String> entry: v.entrySet()) {
			XmlMap xm = new XmlMap();
			xm.first = entry.getKey();
			xm.second = entry.getValue();
			xmlMap[index++] = xm;
		}
		return xmlMap;
	}

}
