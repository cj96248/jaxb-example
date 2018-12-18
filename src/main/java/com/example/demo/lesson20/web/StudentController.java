package com.example.demo.lesson20.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.lesson20.entity.Student;
import com.example.demo.lesson20.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping(value="/id1")
	public Student findById(String id) {
		return studentService.findById(id);
	}
	
	@GetMapping(value="/id2", produces=MediaType.APPLICATION_XML_VALUE)
	public Student findById2(String id) {
		return studentService.findById(id);
	}
	
	@GetMapping(value="/list1")
	public List<Student> findAll(){
		return studentService.findAll();
	}
	
	@GetMapping(value="/list2", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Student> findAll2(){
		
		return studentService.findAll();
	}
}
