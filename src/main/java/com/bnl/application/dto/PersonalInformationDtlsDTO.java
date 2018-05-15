package com.bnl.application.dto;

/*
 * Created By : Kaushik Ghosh
 * Date       : 05/07/2018
 * Description: This is the Entity class of the Personal_Information_Dtls table. Note that since the table consist of the composite Primary key we have
 * the @EmbeddedID field.
 */

import javax.persistence.*;
//import java.util.Date;

@Entity(name = "Personal_Information_Dtls")

public class PersonalInformationDtlsDTO {
	
	@EmbeddedId
	private PersonalInformationDtlsPrimaryKey personalInformationDtlsPrimaryKey;
	
	@Column(name = "First_Name")
	private String firstName;
	   
	@Column(name = "Middle_Name")
	private String middleName;
	    
	@Column(name = "Last_Name")
	private String lastName;

	@Column(name = "Date_of_Birth")
	private String dateOfBirth;

	@Column(name = "Gender")
	private String gender;
	
	@Column(name = "Contact_Number")
	private String contactNumber;

	@Column(name = "Email_Id")
	private String emailId;

	@Column(name = "Street_Address")
	private String streetAddress;
	
	@Column(name = "State")
	private String state;
	
	@Column(name = "City")
	private String city;

	@Column(name = "Pincode")
	private String pincode;

	@Column(name = "Last_Update_Id")
	private String lastUpdateID;

	@Column(name = "Last_Update_Timestamp")
	private String lastUpdateTimeStamp;
	

	public PersonalInformationDtlsPrimaryKey getPersonalInformationDtlsPrimaryKey() {
		return personalInformationDtlsPrimaryKey;
	}

	public void setPersonalInformationDtlsPrimaryKey(PersonalInformationDtlsPrimaryKey personalInformationDtlsPrimaryKey) {
		this.personalInformationDtlsPrimaryKey = personalInformationDtlsPrimaryKey;
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

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
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

	public String getLastUpdateID() {
		return lastUpdateID;
	}

	public void setLastUpdateID(String lastUpdateID) {
		this.lastUpdateID = lastUpdateID;
	}

	public String getLastUpdateTimeStamp() {
		return lastUpdateTimeStamp;
	}

	public void setLastUpdateTimeStamp(String lastUpdateTimeStamp) {
		this.lastUpdateTimeStamp = lastUpdateTimeStamp;
	}
}
