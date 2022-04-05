package com.healthcare.healtcare.dao;

import com.healthcare.healtcare.model.Sample;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SampleDao extends JpaRepository<Sample,Integer> {
    Sample getBysampleId(Integer sampleId);
}
