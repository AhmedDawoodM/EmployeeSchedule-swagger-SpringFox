package com.example.employeeswaggerdemo.repository;

import com.example.employeeswaggerdemo.domain.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {
}
