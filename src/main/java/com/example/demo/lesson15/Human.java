package com.example.demo.lesson15;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

//@XmlJavaTypeAdapter(AnyTypeAdapter.class)
@XmlJavaTypeAdapter(ManAdapter.class)
public interface Human {

}
