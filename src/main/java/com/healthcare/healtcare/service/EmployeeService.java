package com.healthcare.healtcare.service;

import com.healthcare.healtcare.model.Employee;
import com.healthcare.healtcare.model.Patient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    List<Employee> getEmployeeRequest();

   Employee addEmployee(Employee employee);

    Employee updateEmployee(Employee employee);

    void deleteEmployee(long employeeId);

    Employee getEmployee(Integer parseLong);
}
