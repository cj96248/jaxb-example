package com.example.demo.lesson9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.util.JAXBResult;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.XMLFilterImpl;

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
	public void test2() throws JAXBException, SAXException {
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		File file = new File("D://test1.xml");// 将结果输出到文件
		marshaller.marshal(one, file);// 将自动创建test1.xml文件，并输出内容

		// 测试File中数据
		try (FileInputStream stream = new FileInputStream(new File("D://test1.xml"));){
			System.out.println(stream.read());// 测试File中数据的字节数
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@Test
	@Ignore
	public void test2_2() throws Exception {
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		FileOutputStream os = new FileOutputStream("file.xml");// 将结果输出到OutputStream
		marshaller.marshal(one, os);// 这是使用到 FileOutputStream
	}

	@Test
	@Ignore
	public void test3() throws JAXBException {
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		StringWriter writer = new StringWriter();
		marshaller.marshal(one, writer);// 将结果赋值到Writer

		System.out.println(writer.toString());// 测试Writer中数据
	}

	@Test
	@Ignore
	public void test4() throws JAXBException, SAXException, TransformerException {
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		JAXBResult result = new JAXBResult(context);
		// 需要手动添加 start/endDocument
		result.getHandler().startDocument();
		marshaller.marshal(one, result);// 将结果赋值到 Result
		result.getHandler().endDocument();

		System.out.println(result.getResult());// 测试result中数据 -> One [ name=Test one]
	}
	@Test
	@Ignore
	public void test4_2() throws JAXBException {
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		DOMResult result = new DOMResult();
		marshaller.marshal(one, result);
		Node node = result.getNode();

		System.out.println(node.getLocalName());
	}
	
	@Test
	@Ignore
	public void test5() throws JAXBException, SAXException, TransformerException {
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		ContentHandler handler = new XMLFilterImpl();
		handler.startDocument();
		marshaller.marshal(one, handler);
		handler.endDocument();
	}

	@Test
	@Ignore
	public void test6() throws Exception {
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		//创建 Document
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document document = db.newDocument();
		
		marshaller.marshal(one, document);
		
		// 创建 TransformerFactory
		TransformerFactory tf = TransformerFactory.newInstance();
        Transformer t = tf.newTransformer();
        DOMSource source = new DOMSource(document);
        StreamResult result = new StreamResult(System.out); //测试输出
        t.transform(source, result);
	}
	
	@Test
	@Ignore
	public void test7() throws JAXBException, XMLStreamException {
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		XMLOutputFactory factory = XMLOutputFactory.newInstance();
		StringWriter sw = new StringWriter();
		XMLStreamWriter writer = factory.createXMLStreamWriter(sw);
		marshaller.marshal(one, writer);
/*		writer.writeStartDocument("UTF-8", "1.0");
		writer.writeStartElement("one");
		writer.writeStartElement("name");
		writer.writeCharacters("Test one");
		writer.writeEndElement();
		writer.writeEndElement();
		writer.flush();
		sw.flush();*/
		
		System.out.println(sw.toString()); //测试输出
	}
	
	@Test
	public void test8() throws JAXBException, XMLStreamException {
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		XMLOutputFactory factory = XMLOutputFactory.newInstance();
		StringWriter sw = new StringWriter();
		XMLEventWriter writer = factory.createXMLEventWriter(sw);
		marshaller.marshal(one, writer);
		
		System.out.println(sw.toString());//测试输出
	}

}
