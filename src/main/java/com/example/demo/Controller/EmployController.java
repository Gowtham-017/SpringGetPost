package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Employee1;
import com.example.demo.Service.EmployService;



@RestController
public class EmployController {
	@Autowired
	EmployService s1;
	
	//get
	@GetMapping("/getemp")
	public List<Employee1> displayDetail(){
		return s1.getEmpDetail();
	}
	
	//post
	@PostMapping("/postemp")
	public String putDetail(@RequestBody Employee1 t) {
		s1.add(t);
		return "Added Employee details";
	}
	//put
	@PutMapping("/putemp")
	public Employee1 updateFam(@RequestBody Employee1 fl) {
		return s1.updateEmpDetail(fl);
	}
	//delete
	@DeleteMapping("/deleteemp")
	public  String deleteInfo(@RequestBody Employee1 w) {
		 s1.deleteEmpDetail(w);
		 return "Deleted the Employee Details";
	}
	

}
