package com.bnl.application.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TeacherPrimaryKey implements Serializable {
	
		
	private static final long serialVersionUID = 1L;
	@Column(name = "Institution_Id")
	private int institutionId;
	  
	@Column(name = "Teacher_Id")
	private int teacherId;
	  
	@Column(name = "Institute_User_Id")
	private String instituteUserId;
	    

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    
	public int getInstitutionId() {
		return institutionId;
	}
	public void setInstitutionId(int institutionId) {
		this.institutionId = institutionId;
	}
	public int getTeacherId() {
			return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public String getInstituteUserId() {
		return instituteUserId;
	}
	public void setInstituteUserId(String instituteUserId) {
		this.instituteUserId = instituteUserId;
	}
	
	
}
