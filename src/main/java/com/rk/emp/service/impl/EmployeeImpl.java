package com.rk.emp.service.impl;

import com.rk.emp.model.Employee;
import com.rk.emp.repo.EmployeeRepo;
import com.rk.emp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeImpl implements EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;
    @Override
    public List<Employee> findEmployees() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee findByEmpId(Integer id) {
        return employeeRepo.findByEmpId(id);
    }
}
