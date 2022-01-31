package com.spring.spring_boot_rest_app.service;

import com.spring.spring_boot_rest_app.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);

}
