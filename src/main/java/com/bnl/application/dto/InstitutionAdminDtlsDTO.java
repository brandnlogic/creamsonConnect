package com.bnl.application.dto;

/*
 * Created By : Kaushik Ghosh
 * Date       : 05/07/2018
 * Description: This is the Entity class of the Creamson_Institution_Admin_Dtls table. Note that since the table consist of the composite Primary key we 
 * have the @EmbeddedID field.
 */

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity(name = "Creamson_Institution_Admin_Dtls")
public class InstitutionAdminDtlsDTO {
	
	@EmbeddedId
	InstitutionAdminDtlsPrimaryKey institutionAdminDtlsPrimaryKey;
	
	@Column(name = "Institution_Admin_Username")
	private String institutionAdminUsername;
	
	@Column(name = "Institution_Admin_Password")
	private String institutionAdminPassword;
	
	@Column(name = "Institution_Admin_Role")
	private String instituionAdminRole;
	
	@Column(name = "Institution_Admin_Status")
	private int instituionAdminStatus;
	
	@Column(name = "Last_Update_Id")
	private String lastUpdateId;
	
	@Column(name = "Last_Update_Timestamp")
	private String lastUpdteTimestamp;

	public InstitutionAdminDtlsPrimaryKey getInstitutionAdminDtlsPrimaryKey() {
		return institutionAdminDtlsPrimaryKey;
	}

	public void setInstitutionAdminDtlsPrimaryKey(InstitutionAdminDtlsPrimaryKey institutionAdminDtlsPrimaryKey) {
		this.institutionAdminDtlsPrimaryKey = institutionAdminDtlsPrimaryKey;
	}

	public String getInstitutionAdminUsername() {
		return institutionAdminUsername;
	}

	public void setInstitutionAdminUsername(String institutionAdminUsername) {
		this.institutionAdminUsername = institutionAdminUsername;
	}

	public String getInstitutionAdminPassword() {
		return institutionAdminPassword;
	}

	public void setInstitutionAdminPassword(String institutionAdminPassword) {
		this.institutionAdminPassword = institutionAdminPassword;
	}

	public String getInstituionAdminRole() {
		return instituionAdminRole;
	}

	public void setInstituionAdminRole(String instituionAdminRole) {
		this.instituionAdminRole = instituionAdminRole;
	}

	public int getInstituionAdminStatus() {
		return instituionAdminStatus;
	}

	public void setInstituionAdminStatus(int instituionAdminStatus) {
		this.instituionAdminStatus = instituionAdminStatus;
	}

	public String getLastUpdateId() {
		return lastUpdateId;
	}

	public void setLastUpdateId(String lastUpdateId) {
		this.lastUpdateId = lastUpdateId;
	}

	public String getLastUpdteTimestamp() {
		return lastUpdteTimestamp;
	}

	public void setLastUpdteTimestamp(String lastUpdteTimestamp) {
		this.lastUpdteTimestamp = lastUpdteTimestamp;
	}
}
