package com.healthcare.healtcare.service;

import com.healthcare.healtcare.model.Employee;
import com.healthcare.healtcare.model.Patient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PatientService {

    public Patient getPatient(Integer l);

    List<Patient> getPatientRequest();

    Patient addPatient(Patient patient);
}
