package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Employee1;
import com.example.demo.Repository.EmployRepo;


@Service
public class EmployService {
	@Autowired
	EmployRepo f;
	
	//add
	public String add(Employee1 g) {
		f.save(g);
		return "Added";
	}
	
	//get
	public List<Employee1> getEmpDetail(){
		return f.findAll();
	}
	
	//update
	public Employee1 updateEmpDetail(Employee1 v) {
		return f.saveAndFlush(v);
	}
	
	//delete
	public void deleteEmpDetail(Employee1 v1) {
		f.delete(v1);
	}

}
