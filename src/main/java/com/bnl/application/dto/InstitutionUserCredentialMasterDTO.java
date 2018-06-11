package com.bnl.application.dto;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity(name = "INSTITUTION_USER_CREDENTIAL_MASTER")
public class InstitutionUserCredentialMasterDTO {
	
	@EmbeddedId
	private InstituteUserCredentialMasterPrimaryKey instituteUserCredentialMasterPrimaryKey;
	
	@Column(name = "INSTITUTION_USER_STATUS")
	private String userStatus;
	
	@Column(name = "INSTITUTION_NAME")
	private String institutionName;
	
	@Column(name = "USER_ENROLL_DATE")
	private String userEnrollDate;
	
	@Column(name = "USER_END_DATE")
	private String userEndDate;
	
	@Column(name = "LAST_UPDT_ID")
	private String lastUpdateId;
	
	@Column(name = "LAST_UPDT_TS")
	private String lastUpdateTimestamp;
	
	/*@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name="institutionUserId", referencedColumnName = "INSTITUTION_USER_ID"),
		@JoinColumn(name="institutionUserName",referencedColumnName = "INSTITUTION_USER_NAME")
	})
	private InstitutionUserCredentialDTO institutionUserCredential;*/

	/*public InstitutionUserCredentialDTO getInstitutionUserCredential() {
		return institutionUserCredential;
	}

	public void setInstitutionUserCredential(InstitutionUserCredentialDTO institutionUserCredential) {
		this.institutionUserCredential = institutionUserCredential;
	}*/

	public InstituteUserCredentialMasterPrimaryKey getInstituteUserCredentialMasterPrimaryKey() {
		return instituteUserCredentialMasterPrimaryKey;
	}

	public void setInstituteUserCredentialMasterPrimaryKey(
			InstituteUserCredentialMasterPrimaryKey instituteUserCredentialMasterPrimaryKey) {
		this.instituteUserCredentialMasterPrimaryKey = instituteUserCredentialMasterPrimaryKey;
	}

	public String getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	public String getInstitutionName() {
		return institutionName;
	}

	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}

	public String getUserEnrollDate() {
		return userEnrollDate;
	}

	public void setUserEnrollDate(String userEnrollDate) {
		this.userEnrollDate = userEnrollDate;
	}

	public String getUserEndDate() {
		return userEndDate;
	}

	public void setUserEndDate(String userEndDate) {
		this.userEndDate = userEndDate;
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
