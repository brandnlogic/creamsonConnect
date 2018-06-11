package com.bnl.application.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class GuardianPrimaryKey implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "Institution_Id")
	private int institutionId;
	
	@Column(name = "INSTITUTION_USER_ID_GUARDIAN")
	private int institutionUserIdGuardian;
	
	@Column(name = "INSTITUTION_USER_ID_STUDENT")
	private int institutionUserIdStudent;

	public int getInstitutionId() {
		return institutionId;
	}

	public void setInstitutionId(int institutionId) {
		this.institutionId = institutionId;
	}

	public int getInstitutionUserIdGuardian() {
		return institutionUserIdGuardian;
	}

	public void setInstitutionUserIdGuardian(int institutionUserIdGuardian) {
		this.institutionUserIdGuardian = institutionUserIdGuardian;
	}

	public int getInstitutionUserIdStudent() {
		return institutionUserIdStudent;
	}

	public void setInstitutionUserIdStudent(int institutionUserIdStudent) {
		this.institutionUserIdStudent = institutionUserIdStudent;
	}
	
	@Override
	public String toString()
	{
		return (institutionId + " " + institutionUserIdGuardian +  " " + institutionUserIdStudent);
	}
}
