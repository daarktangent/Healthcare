package com.healthcare.healtcare.controller;


import com.healthcare.healtcare.model.Employee;
import com.healthcare.healtcare.model.Patient;
import com.healthcare.healtcare.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {
    @PostMapping("/test")
    public String test()
    {
        return "tets";
    }


    @Autowired
    private PatientService patientService;
    @GetMapping(path="/pendingrequest")
    public List<Patient> getTestRequest()
    {
        return this.patientService.getPatientRequest();
    }
    @GetMapping(path="/{patient_id}")
    public Patient  getPatient(@PathVariable String patient_id)
    {
        return this.patientService.getPatient(Integer.parseInt(patient_id));
    }
    @PostMapping( "/add")
    public Patient addPatient(@RequestBody Patient patient)
    {

        return this.patientService.addPatient(patient);
    }

}
