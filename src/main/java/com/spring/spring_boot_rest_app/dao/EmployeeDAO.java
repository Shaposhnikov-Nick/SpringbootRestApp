package com.spring.spring_boot_rest_app.dao;

import com.spring.spring_boot_rest_app.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> getAllEmployees();

    //    void saveEmployee(Employee employee);
//
//    Employee getEmployee(int id);
//
//    void deleteEmployee(int id);

}
