package com.demo2.angular.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo2.angular.model.Employee;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Long>{

}
