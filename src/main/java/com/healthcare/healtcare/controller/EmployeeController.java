package com.healthcare.healtcare.controller;

import com.healthcare.healtcare.model.Employee;
import com.healthcare.healtcare.model.Patient;
import com.healthcare.healtcare.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    //getting information of all employees
    @GetMapping(path="/getall")
    public List<Employee> getEmployeeRequest()
    {
        return this.employeeService.getEmployeeRequest();
    }
    //searching an employee using employeeid
    @GetMapping("/{employeeId}")
    public Employee  getEmployee(@PathVariable Integer employeeId)
    {
        return this.employeeService.getEmployee(employeeId);
    }



    //Adding employee
    @PostMapping( "/add")
    public Employee addCourse(@RequestBody Employee employee)
    {

        return this.employeeService.addEmployee(employee);
    }
    //updating employee record
    @PutMapping("/update")
    public Employee updateEmployee(@RequestBody Employee employee)
    {
        return this.employeeService.updateEmployee(employee);
    }
    //Deleting an employee record
    @DeleteMapping("/delete/{employeeId}")
    public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable String employeeId)
    {
        try{
            this.employeeService.deleteEmployee(Long.parseLong(employeeId));
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
