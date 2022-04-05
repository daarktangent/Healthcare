package com.healthcare.healtcare.service;

import com.healthcare.healtcare.model.Employee;
import com.healthcare.healtcare.model.Sample;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SampleService {
   Sample addSample(Sample sample);

    void deleteSample(long parseLong);

    List<Sample> getSampleRequest();

    Sample getSample(Integer sampleId);

    Sample updateSample(Sample sample);
}
