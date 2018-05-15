package com.bnl.application.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/*
 * Created By : Kaushik Ghosh
 * Date       : 05/07/2018
 * Description: This class maps to the primary key of the table Creamson_Institution_Admin_Dtls. Since we have composite primary key we are using the 
 * @Embedded annotation .
 */

@Embeddable
public class InstitutionAdminDtlsPrimaryKey implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "Institution_Admin_Id")
	private int institutionAdminId;
	
	@Column(name = "Institution_Id")
	private int institutionId;
	
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
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	} 

}
