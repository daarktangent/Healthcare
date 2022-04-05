package com.healthcare.healtcare.service;

import com.healthcare.healtcare.dao.PatientDao;
import com.healthcare.healtcare.dao.SampleDao;
import com.healthcare.healtcare.model.Block;
import com.healthcare.healtcare.model.Employee;
import com.healthcare.healtcare.model.Patient;
import com.healthcare.healtcare.model.Sample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SampleServiceImpl implements  SampleService{

    @Autowired
    private SampleDao sampleDao;

    @Autowired
    private PatientDao patientDao;

    @Override
    public Sample addSample(Sample sample) {
        Patient patient = patientDao.findBypatientId(sample.getPatient().getPatientId());
        sample.setPatient(patient);
        sampleDao.save(sample);
        return sample;
    }

    //deleting a sample
    @Override
    public void deleteSample(long sampleId) {
        Sample one = sampleDao.getOne((int) sampleId);
        sampleDao.delete(one);
    }

    //getting all sample
    @Override
    public List<Sample> getSampleRequest() {
        return sampleDao.findAll();
    }
 //getting sample by id
    @Override
    public Sample getSample(Integer sampleId) {
        Sample one= sampleDao.getBysampleId(sampleId);
        return one;
    }
 //updating sample
    @Override
    public Sample updateSample(Sample sample) {
        sampleDao.save(sample);
        return sample;
    }
}
