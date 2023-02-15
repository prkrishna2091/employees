package com.rk.emp.service;

import com.rk.emp.model.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> findEmployees();

    Employee findByEmpId(Integer id);
}
