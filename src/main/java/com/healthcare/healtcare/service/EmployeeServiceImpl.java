package com.healthcare.healtcare.service;

import com.healthcare.healtcare.dao.EmployeeDao;
import com.healthcare.healtcare.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements  EmployeeService{

    @Autowired
    private  EmployeeDao employeeDao;
    //getting all employee
    @Override
    public List<Employee> getEmployeeRequest() {
        return employeeDao.findAll();
    }
    //Adding an employee
    @Override
    public Employee addEmployee(Employee employee) {

        employeeDao.save(employee);
        return employee;
    }
    // for updating employee information
    @Override
    public Employee updateEmployee(Employee employee) {
        employeeDao.save(employee);
        return employee;
    }

    //deleting an employee
    @Override
    public void deleteEmployee(long employeeId) {
        Employee one = employeeDao.getOne((int) employeeId);
        employeeDao.delete(one);

    }

    //searching an employee
    @Override
    public Employee getEmployee(Integer employeeId) {
        Employee one= employeeDao.getByemployeeId(employeeId);
        return one;

    }
}
