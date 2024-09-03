package org.example.useremployee.controller;

import org.example.useremployee.model.Employee;
import org.example.useremployee.repositories.Employeerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeRestController {

    @Autowired
    Employeerepository employeerepository;

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return employeerepository.findAll();
    }

}
