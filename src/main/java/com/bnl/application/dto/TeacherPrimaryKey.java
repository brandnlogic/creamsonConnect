package com.bnl.application.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TeacherPrimaryKey implements Serializable {
	
		
	private static final long serialVersionUID = 1L;
	@Column(name = "Institution_Id")
	private int institutionId;
	  
	@Column(name = "INSTITUTION_USER_ID_TEACHER")
	private int instituteUserIdTeacher;
	    

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    
	public int getInstitutionId() {
		return institutionId;
	}
	public void setInstitutionId(int institutionId) {
		this.institutionId = institutionId;
	}

	public int getInstituteUserIdTeacher() {
		return instituteUserIdTeacher;
	}

	public void setInstituteUserIdTeacher(int instituteUserIdTeacher) {
		this.instituteUserIdTeacher = instituteUserIdTeacher;
	}
	
}
