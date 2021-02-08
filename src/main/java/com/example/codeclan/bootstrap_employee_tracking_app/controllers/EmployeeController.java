package com.example.codeclan.bootstrap_employee_tracking_app.controllers;

import com.example.codeclan.bootstrap_employee_tracking_app.models.Employee;
import com.example.codeclan.bootstrap_employee_tracking_app.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("/employees")
    public List<Employee> getEmployers() {
        return employeeRepository.findAll();
    }

}
