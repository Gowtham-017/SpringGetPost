package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Employee1;





@Repository
public interface EmployRepo extends JpaRepository<Employee1,Integer>{

}
