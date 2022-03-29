package com.healthcare.healtcare.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Patient")
public class Patient {
    @Id
    private Integer patientId;
    private String PatientName;
    private Integer age;
    private String gender;
    private String report;
    private String referingDoctor;
    private  String address;
    private Integer testid;

    public Patient(){}

    public Patient(Integer patientId, String patientName, Integer age, String gender, String report, String referingDoctor, String address, Integer testid) {
        this.patientId = patientId;
        PatientName = patientName;
        this.age = age;
        this.gender = gender;
        this.report = report;
        this.referingDoctor = referingDoctor;
        this.address = address;
        this.testid = testid;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return PatientName;
    }

    public void setPatientName(String patientName) {
        PatientName = patientName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public String getReferingDoctor() {
        return referingDoctor;
    }

    public void setReferingDoctor(String referingDoctor) {
        this.referingDoctor = referingDoctor;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getTestid() {
        return testid;
    }

    public void setTestid(Integer testid) {
        this.testid = testid;
    }
}
