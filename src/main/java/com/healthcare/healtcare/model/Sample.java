package com.healthcare.healtcare.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Sample")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Sample {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer sampleId;//patientId:sequence starting from 1
    private Integer testId;
    private String processingStatus;
    private  String specimen;
    private String biospyType;
    private String fixative;
    private String test1Remarks;
    private String test2Remarks;
    @Temporal(TemporalType.DATE)
    @Column(name = "reportDate",updatable = false)
    private Date reportDate = new Date(System.currentTimeMillis());

    @ManyToOne
    @JoinColumn(name = "patient_id",nullable =false)
    private Patient patient;

}
