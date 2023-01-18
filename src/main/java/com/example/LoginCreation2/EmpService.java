package com.example.LoginCreation2;

import java.util.List;

public class EmpService {

    EmpRepository empRepository;

    public List<Employee>getAll(){
        return empRepository.getAll();

    }
//   public String add(Employee emp){
//      return  empRepository.add(emp);
//    }
}
