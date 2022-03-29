package com.healthcare.healtcare.controller;


import com.healthcare.healtcare.model.Patient;
import com.healthcare.healtcare.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
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
        return this.patientService.getTestRequest();
    }
    @GetMapping(path="/patient/{patient_id}")
    public Patient  getPatient(@PathVariable String patient_id)
    {
        return this.patientService.getPatient(Integer.parseInt(patient_id));
    }

}
