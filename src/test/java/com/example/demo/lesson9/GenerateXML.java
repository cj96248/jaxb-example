package com.example.demo.lesson9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.util.JAXBResult;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import com.example.demo.lesson8.One;

/**
 * 将数据输出到不同目的地
 * 
 * @author Jiang, Chao
 *
 */
public class GenerateXML {

	private static JAXBContext context;
	private static One one;

	@BeforeClass
	public static void init() throws JAXBException {
		// JAXBContext 是线程安全的
		context = JAXBContext.newInstance(One.class);
		// 初始化全局的 Java bean
		one = new One();
		one.setName("Test one");
	}

	@Test
	@Ignore
	public void test1() throws JAXBException {
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(one, System.out);// 直接输出到控制台
	}

	@Test
	@Ignore
	public void test2() throws JAXBException {
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		StringWriter writer = new StringWriter();
		marshaller.marshal(one, writer);// 将结果赋值到Writer

		System.out.println(writer.toString());// 测试Writer中数据
	}

	@Test
	@Ignore
	public void test3() throws JAXBException, SAXException {
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		JAXBResult result = new JAXBResult(context);
		result.getHandler().startDocument();
		marshaller.marshal(one, result);// 将结果赋值到 Result
		result.getHandler().endDocument();

		System.out.println(result.getResult());// 测试result中数据
	}

	@Test
	@Ignore
	public void test4() throws JAXBException, SAXException, IOException {
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		File file = new File("D://test1.xml");// 将结果输出到文件
		marshaller.marshal(one, file);// 将自动创建test1.xml文件，并输出内容

		FileInputStream stream = new FileInputStream(new File("D://test1.xml"));// 测试File中数据
		System.out.println(stream.read());// 测试File中数据的字节数
	}

	@Test
	@Ignore
	public void test5() throws Exception {
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		FileOutputStream os = new FileOutputStream("file.xml");// 将结果输出到OutputStream
		marshaller.marshal(one, os);// 这是使用到 FileOutputStream
	}

	@Test
	public void test6() throws JAXBException {
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		DOMResult result = new DOMResult();
		marshaller.marshal(one, result);
		Node node = result.getNode();

		System.out.println(node.getLocalName());
	}

	@Test
	public void test7() throws Exception {
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		//创建 Document
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document document = db.newDocument();
		
		marshaller.marshal(one, document);
		
		TransformerFactory tf = TransformerFactory.newInstance();
        Transformer t = tf.newTransformer();
        DOMSource source = new DOMSource(document);
        StreamResult result = new StreamResult(System.out);
        t.transform(source, result);
	}

}
