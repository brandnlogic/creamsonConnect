package com.bnl.application.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;


/*
 * Created By : Kaushik Ghosh
 * Date       : 05/07/2018
 * Description: This class maps to the primary key of the table Personal_Information_Dtls. Since we have composite primary key we are using the 
 * @Embedded annotation .
 */

@Embeddable
public class PersonalInformationDtlsPrimaryKey implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Column(name = "Institution_Id")
	private int institutionId;
	  
	@Column(name = "Institution_User_Type")
	private int institutionUserType;
	  
	@Column(name = "Personal_Id")
	private String personalId;

	public int getInstitutionId() {
		return institutionId;
	}

	public void setInstitutionId(int institutionId) {
		this.institutionId = institutionId;
	}

	public int getInstitueUserType() {
		return institutionUserType;
	}

	public void setInstitueUserType(int institutionUserType) {
		this.institutionUserType = institutionUserType;
	}

	public String getPersonalId() {
		return personalId;
	}

	public void setPersonalId(String personalId) {
		this.personalId = personalId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}    

}
