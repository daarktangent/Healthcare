package com.healthcare.healtcare.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="Patient")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer patientId;
    private String PatientName;
    private Integer age;
    private String gender;
    private String report;
    private String referingDoctor;
    private  String address;
    private Integer testid;

}
