package com.example.demo.lesson20.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.lesson20.entity.Student;

@Service
public class StudentService {

	static Map<String, Student> students = new HashMap<>();
	
	static {
		students.put("11", new Student("11", "Tom", 23));
		students.put("12", new Student("12", "Jerry", 25));
		students.put("13", new Student("13", "David", 32));
		students.put("14", new Student("14", "Jack", 41));
	}
	
	public Student findById(String id) {
		return students.get(id);
	}

	public List<Student> findAll() {
		return new ArrayList<Student>(students.values());
	}

}
