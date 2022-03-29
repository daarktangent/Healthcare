package com.healthcare.healtcare.dao;

import com.healthcare.healtcare.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public  interface PatientDao  extends JpaRepository<Patient,Integer> {
    List<Patient> findByreport(String pending);


    Patient findBypatientId(Integer l);
}
