/*package com.bnl.application.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity(name = "INSTITUTION_USER_CREDENTIAL_MASTER")
public class InstitutionUserCredentialMaster {
	
	@EmbeddedId
	private InstituteUserCredentialMasterPrimaryKey instituteUserCredentialMasterPrimaryKey;
	
	@Column(name = "INSTITUTION_USER_STATUS")
	private String userStatus;
	
	@Column(name = "INSTITUTION_NAME")
	private String institutionName;

	@Column(name = "LAST_UPDT_ID")
	private String lastUpdateId;
	
	@Column(name = "LAST_UPDT_TS")
	private String lastUpdateTimestamp;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name="institutionUserId", referencedColumnName = "INSTITUTION_USER_ID"),
		@JoinColumn(name="institutionUserName",referencedColumnName = "INSTITUTION_USER_NAME")
	})
	private InstitutionUserCredential institutionUserCredential;

	public InstitutionUserCredential getInstitutionUserCredential() {
		return institutionUserCredential;
	}

	public void setInstitutionUserCredential(InstitutionUserCredential institutionUserCredential) {
		this.institutionUserCredential = institutionUserCredential;
	}

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