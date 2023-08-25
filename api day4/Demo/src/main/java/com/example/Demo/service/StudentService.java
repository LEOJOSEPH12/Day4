package com.example.Demo.service;




import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;




import com.example.Demo.model.StudentEntity;

import com.example.Demo.repository.StudentRepo;




@Service

public class StudentService {

	@Autowired

	StudentRepo sr;

	

	public StudentEntity saveinfo(StudentEntity s) {

		return sr.save(s);

	}

	public List<StudentEntity> showinfo(){

		return sr.findAll();

	}




	

}

