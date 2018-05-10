package com.bnl.application.common.to;

/*
 * Created By : Kaushik Ghosh
 * Date       : 05/07/2018
 * Description: This is a POJO class having the similar structure as that of the PersonalInformationDtls table.
 */

public class PersonalInformationDtlsTO {
	
	private int institutionId;
	private String institutionUserType;
	private String personalId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String dateOfBirth;
	private String gender;
	private String contactNumber;
	private String emailId;
	private String streetAddress;
	private String state;
	private String city;
	private String pincode;
	private String lastUpdateID;
	private String lastUpdateTimeStamp;
	
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
	public int getInstitutionId() {
		return institutionId;
	}
	public void setInstitutionId(int institutionId) {
		this.institutionId = institutionId;
	}
	public String getInstitutionUserType() {
		return institutionUserType;
	}
	public void setInstitutionUserType(String institutionUserType) {
		this.institutionUserType = institutionUserType;
	}
	public String getPersonalId() {
		return personalId;
	}
	public void setPersonalId(String personalId) {
		this.personalId = personalId;
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
