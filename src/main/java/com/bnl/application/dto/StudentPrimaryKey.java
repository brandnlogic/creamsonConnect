package com.bnl.application.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class StudentPrimaryKey implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "INSTITUTION_ID")
	private int institutionId;
	
	@Column(name = "INSTITUTION_USER_ID_STUDENT")
	private int institutionUserIdStudent;

	public int getInstitutionId() {
		return institutionId;
	}

	public void setInstitutionId(int institutionId) {
		this.institutionId = institutionId;
	}

	public int getInstitutionUserIdStudent() {
		return institutionUserIdStudent;
	}

	public void setInstitutionUserIdStudent(int institutionUserIdStudent) {
		this.institutionUserIdStudent = institutionUserIdStudent;
	}
	
}
