package com.rk.emp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "employees")
public class Employee {

    @Id
    private String id;

    @Field(name = "emp_id")
    private Integer empId;
    @Field(name="first_name")
    private String firstName;
    @Field(name="last_name")
    private String lastName;
    @Field(name="email")
    private String email;
    @Field(name="department")
    private String department;
    @Field(name = "age")
    private Integer age;
    @Field(name = "salary")
    private Long salary;
    @Field(name = "gender")
    private Character gender;

}
