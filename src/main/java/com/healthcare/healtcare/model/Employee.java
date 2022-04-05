package com.healthcare.healtcare.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name="Employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer employeeId;
    private String fullName;
    @Column(unique = true)
    private String phonenumber;

    @Column(unique = true)
    private String email;
    private String address;
    private String password;
    @Temporal(TemporalType.DATE)
    @Column(name = "creation_date",updatable = false)
    private Date creationDate = new Date(System.currentTimeMillis());
    @Temporal(TemporalType.DATE)
    private Date lastUpdate=new Date(System.currentTimeMillis());


    public Employee(Integer employeeId, String fullName, String phonenumber, String email, String address, String password, Date creationDate, Date lastUpdate) {
        this.employeeId = employeeId;
        this.fullName = fullName;
        this.phonenumber = phonenumber;
        this.email = email;
        this.address = address;
        this.password = password;
        this.creationDate = creationDate;
        this.lastUpdate = lastUpdate;
    }

    public Employee() {

    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
