package com.bnl.application.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

//import com.hiber.pojo.GeneratedValue;

@Embeddable
public class InstituteUserCredentialMasterPrimaryKey implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "INSTITUTION_ID")
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int institutionId;
	
	@Column(name = "INSTITUTION_USER_ID")
	private int institutionUserId;
	
	/*@Column(name = "INSTITUTION_USER_NAME")
	private String institutionUserName;*/

	@Column(name = "INSTITUTION_USER_ROLE")
	private String userRole;

	public int getInstitutionId() {
		return institutionId;
	}

	public void setInstitutionId(int institutionId) {
		this.institutionId = institutionId;
	}

	public int getInstitutionUserId() {
		return institutionUserId;
	}

	public void setInstitutionUserId(int institutionUserId) {
		this.institutionUserId = institutionUserId;
	}

	
/*	public String getInstitutionUserName() {
		return institutionUserName;
	}

	public void setInstitutionUserName(String institutionUserName) {
		this.institutionUserName = institutionUserName;
	}*/
	
	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	
	public String toString()
	{
		return (institutionId + " " + institutionUserId + " " + userRole);
	}
	
}
