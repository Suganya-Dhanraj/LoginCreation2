package com.example.LoginCreation2;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class EmpRepository {
   public List<Employee> employee =new ArrayList<Employee>();

   public List<Employee> getAll(){
      return employee;

   }
   public String add(Employee emp) {
      employee.add(emp);
      return "Successfully Added";

   }
}
