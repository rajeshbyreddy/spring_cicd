package com.springboot.github_cicd.controllers;

import com.springboot.github_cicd.model.Employee;
import com.springboot.github_cicd.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;


    @GetMapping("/allEmployees")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    @GetMapping("/emp/page")
    public Page<Employee> findByPage(@RequestParam(defaultValue = "0") int page) {
        return employeeService.getEmployees(page);
    }
}
