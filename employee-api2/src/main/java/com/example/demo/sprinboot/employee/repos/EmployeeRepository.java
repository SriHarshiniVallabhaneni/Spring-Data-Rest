package com.example.demo.sprinboot.employee.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.sprinboot.employee.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
