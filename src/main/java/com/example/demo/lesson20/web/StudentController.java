package com.example.demo.lesson20.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.lesson20.entity.Student;
import com.example.demo.lesson20.entity.Students;
import com.example.demo.lesson20.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping(value="/id")
	public Student findById(String id) {
		return studentService.findById(id);
	}

	@GetMapping(value="/id/xml", produces=MediaType.APPLICATION_XML_VALUE)
	public Student findById2(String id) {
		return studentService.findById(id);
	}
	
	@GetMapping(value="/id/jackson/xml", produces=MediaType.APPLICATION_XML_VALUE)
	public Student findById3(String id) {
		return studentService.findById(id);
	}
	
	@GetMapping(value="/id2", produces=MediaType.APPLICATION_JSON_VALUE)
	public Student findById4(String id) {
		return studentService.findById(id);
	}
	
	
	@GetMapping(value="/list")
	public List<Student> findAll(){
		return studentService.findAll();
	}
	
	@GetMapping(value="/list/xml", produces=MediaType.APPLICATION_XML_VALUE)
	public List<Student> findAll2(){
		return studentService.findAll();
	}
	
	@GetMapping(value="/students/xml", produces=MediaType.APPLICATION_XML_VALUE)
	public Students findAll3(){
		Students students = new Students();
		students.setStudent(studentService.findAll());
		return students;
	}
	
	@GetMapping(value="/list/jackson/xml", produces=MediaType.APPLICATION_XML_VALUE)
	public List<Student> findAll4(){
		return studentService.findAll();
	}
	

}
