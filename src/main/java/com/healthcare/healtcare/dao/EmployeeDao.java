package com.healthcare.healtcare.dao;

import com.healthcare.healtcare.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<Employee,Integer> {
    Employee getByemployeeId(Integer employeeId);
}
