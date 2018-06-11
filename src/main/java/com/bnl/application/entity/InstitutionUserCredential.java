/*package com.bnl.application.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name = "INSTITUTION_USER_CREDENTIAL")
public class InstitutionUserCredential {
	
	@EmbeddedId
	private InstitutionUserCredentialPrimaryKey institutionUserCredentialPrimaryKey;
	
	@Column(name = "INSTITUTION_USER_PASSWORD")
	private String instituteUserPassword;

	@Column(name = "USER_TAX_ID")
	private String userTaxId;
	
	@Column(name = "USER_UNIQUE_ID")
	private String userUniqueId;
	
	@Column(name = "FIRST_NAME")
	private String firstname;
	
	@Column(name = "MIDDLE_NAME")
	private String middleName;
	
	@Column(name = "LAST_NAME")
	private String lastName;
	
	@Column(name = "DATE_OF_BIRTH")
	private String dateOfBirth;
	
	@Column(name = "GENDER")
	private String gender;
	
	@Column(name = "PRIMARY_CONTACT_NUMBER")
	private String primaryContactNumber;
	
	@Column(name = "SECONDARY_CONTACT_NUMBER")
	private String secondaryContactNumber;
	
	@Column(name = "EMAIL_ID")
	private String emailid;
	
	@Column(name = "STREET_ADDRESS")
	private String streetAddress;
	
	@Column(name = "STATE")
	private String state;
	
	@Column(name = "CITY")
	private String city;
	
	@Column(name = "PINCODE")
	private String pincode;
	
	@Column(name = "IMAGE_URL")
	private String imageUrl;
	
	@Column(name = "LAST_UPDATE_ID")
	private String lastUpdateId;
	
	@Column(name = "LAST_UPDATE_TIMESTAMP")
	private String lastUpdateTimestamp;
	
	@OneToMany(mappedBy="institutionUserCredential", cascade = CascadeType.ALL)
	private List<InstitutionUserCredentialMaster> institutionUserCredentialMaster; 
	
	public List<InstitutionUserCredentialMaster> getInstitutionUserCredentialMaster() {
		return institutionUserCredentialMaster;
	}
	public void setInstitutionUserCredentialMaster(List<InstitutionUserCredentialMaster> institutionUserCredentialMaster) {
		this.institutionUserCredentialMaster = institutionUserCredentialMaster;
	}
	
	public InstitutionUserCredentialPrimaryKey getInstitutionUserCredentialPrimaryKey() {
		return institutionUserCredentialPrimaryKey;
	}
	public void setInstitutionUserCredentialPrimaryKey(
			InstitutionUserCredentialPrimaryKey institutionUserCredentialPrimaryKey) {
		this.institutionUserCredentialPrimaryKey = institutionUserCredentialPrimaryKey;
	}
	
	public String getInstituteUserPassword() {
		return instituteUserPassword;
	}
	public void setInstituteUserPassword(String instituteUserPassword) {
		this.instituteUserPassword = instituteUserPassword;
	}
	
	public String getUserTaxId() {
		return userTaxId;
	}
	public void setUserTaxId(String userTaxId) {
		this.userTaxId = userTaxId;
	}
	public String getUserUniqueId() {
		return userUniqueId;
	}
	public void setUserUniqueId(String userUniqueId) {
		this.userUniqueId = userUniqueId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
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
	public String getPrimaryContactNumber() {
		return primaryContactNumber;
	}
	public void setPrimaryContactNumber(String primaryContactNumber) {
		this.primaryContactNumber = primaryContactNumber;
	}
	public String getSecondaryContactNumber() {
		return secondaryContactNumber;
	}
	public void setSecondaryContactNumber(String secondaryContactNumber) {
		this.secondaryContactNumber = secondaryContactNumber;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
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
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getLastUpdateId() {
		return lastUpdateId;
	}
	public void setLastUpdateId(String lastUpdateId) {
		this.lastUpdateId = lastUpdateId;
	}
	public String getLastUpdateTimestamp() {
		return lastUpdateTimestamp;
	}
	public void setLastUpdateTimestamp(String lastUpdateTimestamp) {
		this.lastUpdateTimestamp = lastUpdateTimestamp;
	}

}
*/