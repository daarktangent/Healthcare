package com.healthcare.healtcare.service;

import com.healthcare.healtcare.model.Patient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PatientService {
    public List<Patient> getTestRequest();
    public Patient getPatient(Integer l);
}
