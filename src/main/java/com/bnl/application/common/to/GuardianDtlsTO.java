package com.bnl.application.common.to;

public class GuardianDtlsTO {
	
	private String gTaxId;
	private String gUniqueUserId;
	private String gFirstName;
	private String gMiddleName;
	private String gLastName;
	private String gDob;
	private String gGender;
	private String gPrimaryContact;
	private String gSecondaryContact;
	private String gEmailId;
	private String gStreetAdd;
	private String gCity;
	private String gState;
	private String gPincode;
	private String gGuardianType;
	private String gGuardianRelationship;
	
	
	public String getgGuardianRelationship() {
		return gGuardianRelationship;
	}
	public void setgGuardianRelationship(String gGuardianRelationship) {
		this.gGuardianRelationship = gGuardianRelationship;
	}
	public String getgGuardianType() {
		return gGuardianType;
	}
	public void setgGuardianType(String gGuardianType) {
		this.gGuardianType = gGuardianType;
	}
	public String getgTaxId() {
		return gTaxId;
	}
	public void setgTaxId(String gTaxId) {
		this.gTaxId = gTaxId;
	}
	public String getgUniqueUserId() {
		return gUniqueUserId;
	}
	public void setgUniqueUserId(String gUniqueUserId) {
		this.gUniqueUserId = gUniqueUserId;
	}
	public String getgFirstName() {
		return gFirstName;
	}
	public void setgFirstName(String gFirstName) {
		this.gFirstName = gFirstName;
	}
	public String getgMiddleName() {
		return gMiddleName;
	}
	public void setgMiddleName(String gMiddleName) {
		this.gMiddleName = gMiddleName;
	}
	public String getgLastName() {
		return gLastName;
	}
	public void setgLastName(String gLastName) {
		this.gLastName = gLastName;
	}
	public String getgDob() {
		return gDob;
	}
	public void setgDob(String gDob) {
		this.gDob = gDob;
	}
	public String getgGender() {
		return gGender;
	}
	public void setgGender(String gGender) {
		this.gGender = gGender;
	}
	public String getgPrimaryContact() {
		return gPrimaryContact;
	}
	public void setgPrimaryContact(String gPrimaryContact) {
		this.gPrimaryContact = gPrimaryContact;
	}
	public String getgSecondaryContact() {
		return gSecondaryContact;
	}
	public void setgSecondaryContact(String gSecondaryContact) {
		this.gSecondaryContact = gSecondaryContact;
	}
	public String getgEmailId() {
		return gEmailId;
	}
	public void setgEmailId(String gEmailId) {
		this.gEmailId = gEmailId;
	}
	public String getgStreetAdd() {
		return gStreetAdd;
	}
	public void setgStreetAdd(String gStreetAdd) {
		this.gStreetAdd = gStreetAdd;
	}
	public String getgCity() {
		return gCity;
	}
	public void setgCity(String gCity) {
		this.gCity = gCity;
	}
	public String getgState() {
		return gState;
	}
	public void setgState(String gState) {
		this.gState = gState;
	}
	public String getgPincode() {
		return gPincode;
	}
	public void setgPincode(String gPincode) {
		this.gPincode = gPincode;
	}
	
	@Override
	public String toString()
	{
		 return( gFirstName + gLastName);
	}

}
