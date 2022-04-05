package com.healthcare.healtcare.service;

import com.healthcare.healtcare.dao.PatientDao;
import com.healthcare.healtcare.model.Employee;
import com.healthcare.healtcare.model.Patient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl  implements PatientService{
    private PatientDao patientDao;


    public PatientServiceImpl(PatientDao patientDao) {
        this.patientDao = patientDao;
    }
    @Override
    public List<Patient> getPatientRequest() {
        return patientDao.findByreport("pending");
    }

    @Override
    public Patient addPatient(Patient patient) {
        patientDao.save(patient);
        return patient;
    }

    @Override
    public Patient getPatient(Integer l) {
        Patient x=patientDao.findBypatientId(l);
        return x;
    }



}
