package com.example.demo.lesson15;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlJavaTypeAdapter(MyAdapter.class)
public interface Fruit {

}
