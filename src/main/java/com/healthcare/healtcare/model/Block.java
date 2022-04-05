package com.healthcare.healtcare.model;


import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Block")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Block {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer bId;// sampleid:sequence start from 1
    private String observation;//observation
    private String specimenType;
    private String reportedBy;
    private String report;


    @Temporal(TemporalType.DATE)
    @Column(name = "creation_date_block",updatable = false)
    private Date creationDateBlock = new Date(System.currentTimeMillis());
    @Temporal(TemporalType.DATE)
    private Date lastUpdate=new Date(System.currentTimeMillis());



}
