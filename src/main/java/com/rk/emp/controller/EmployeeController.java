package com.rk.emp.controller;

import com.rk.emp.model.Employee;
import com.rk.emp.service.EmployeeService;
import com.rk.emp.service.impl.EmployeeImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/emp/v1")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public String welcomeMessage(){
        return "Welcome to Employee Management Application..!";
    }

    @GetMapping("/all")
    public ResponseEntity<List<Employee>> fetchEmployees(){
         List<Employee> listOfEmployees =  employeeService.findEmployees();

         return new ResponseEntity<>(listOfEmployees, HttpStatus.OK);
    }

    @GetMapping("/empid/{id}")
    public ResponseEntity<Employee> findByEmpId(@PathVariable("id") Integer id){
           Employee employee = employeeService.findByEmpId(id);

           return new ResponseEntity<Employee>(employee,HttpStatus.OK);
    }
}
