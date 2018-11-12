package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRespository extends CrudRepository<Employee,Long> {
}
