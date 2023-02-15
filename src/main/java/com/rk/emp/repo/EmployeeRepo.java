package com.rk.emp.repo;

import com.rk.emp.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface EmployeeRepo extends MongoRepository<Employee,String> {

    @Query("{'emp_id': ?0}")
    Employee findByEmpId(Integer id);
}
