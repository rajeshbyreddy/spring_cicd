package com.springboot.github_cicd.repository;

import com.springboot.github_cicd.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    
}
