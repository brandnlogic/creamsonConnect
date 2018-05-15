package com.bnl.application.common.to;

/*
 * Created By : Kaushik Ghosh
 * Date       : 05/07/2018
 * Description: This is a POJO class having the similar structure as that of the Creamson_Institution_Admin_Dtls table.
 */

public class InstitutionAdminDtlsTO {
	
	private int institutionAdminId;
	private int institutionId;
	private String institutionAdminUsername;
	private String institutionAdminPassword;
	private String instituionAdminRole;
	private int instituionAdminStatus;
	private String lastUpdateId;
	//private String lastUpdteTimestamp;
	
	public int getInstitutionAdminId() {
		return institutionAdminId;
	}
	public void setInstitutionAdminId(int institutionAdminId) {
		this.institutionAdminId = institutionAdminId;
	}
	public int getInstitutionId() {
		return institutionId;
	}
	public void setInstitutionId(int institutionId) {
		this.institutionId = institutionId;
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
/*	public String getLastUpdteTimestamp() {
		return lastUpdteTimestamp;
	}
	public void setLastUpdteTimestamp(String lastUpdteTimestamp) {
		this.lastUpdteTimestamp = lastUpdteTimestamp;
	}*/
}
