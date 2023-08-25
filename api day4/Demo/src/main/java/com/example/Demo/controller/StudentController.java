package com.example.Demo.controller;




import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;




import com.example.Demo.model.StudentEntity;

import com.example.Demo.service.StudentService;




@RestController

public class StudentController {

	@Autowired

	StudentService ser;

	

	@PostMapping("add")

	public StudentEntity add(@RequestBody StudentEntity s) {

		return ser.saveinfo(s);

	}

	

	@GetMapping("show")

	public List<StudentEntity> show(){

		return ser.showinfo();

		

	}

}

