package com.bnl.dto;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity(name = "TEACHER_DTLS")
@Component
public class TeachersDetailsDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "INSTITUTION_ID")
    private Integer institutionId;
    @Id
    @Column(name = "TEACHER_ID")
    private Integer teacherId;
    @Id
    @Column(name = "INSTITUTE_USER_ID")
    private String instituteUserId;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "MIDDLE_NAME")
    private String middleName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "DATE_OF_BIRTH")
    private Date dob;

    @Column(name = "GENDER")
    private String gender;

    @Column(name = "CONTACT_NUMBER")
    private String contactNumber;

    @Column(name = "EMAIL_ID")
    private String emailID;

    @Column(name = "STREET_ADDRESS")
    private String streetAddress;

    @Column(name = "STATE")
    private String state;

    @Column(name = "CITY")
    private String city;

    @Column(name = "PINCODE")
    private String pincode;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "LAST_UPDATE_ID")
    private String lastUpdateID;

    @Column(name = "LAST_UPDATE_TIMESTAMP")
    private Date lastUpdateTimeStamp;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getInstitutionId() {
        return institutionId;
    }

    public void setInstitutionId(Integer institutionId) {
        this.institutionId = institutionId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getInstituteUserId() {
        return instituteUserId;
    }

    public void setInstituteUserId(String instituteUserId) {
        this.instituteUserId = instituteUserId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLastUpdateID() {
        return lastUpdateID;
    }

    public void setLastUpdateID(String lastUpdateID) {
        this.lastUpdateID = lastUpdateID;
    }

    public Date getLastUpdateTimeStamp() {
        return lastUpdateTimeStamp;
    }

    public void setLastUpdateTimeStamp(Date lastUpdateTimeStamp) {
        this.lastUpdateTimeStamp = lastUpdateTimeStamp;
    }
}
