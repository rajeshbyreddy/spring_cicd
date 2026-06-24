package com.springboot.github_cicd.service;


import com.springboot.github_cicd.model.Employee;
import com.springboot.github_cicd.repository.EmployeeRepository;
import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    public List<Employee> findAll() {
        System.out.println("fetcing the data");
        return employeeRepository.findAll();
    }

    public Page<Employee> getEmployees(int page){
        return employeeRepository.findAll(PageRequest.of(page,5));
    }
}
