package com.bnl.application.dto;

//import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "teacher_dtls")
//@Component
public class TeachersDetailsDTO {

    @EmbeddedId
    private TeacherPrimaryKey teacherPrimaryKey;
    
    @Column(name = "Personal_Id")
    private int personalID;
    
    @Column(name = "Teacher_Type")
    private String teacherType;
    
    @Column(name = "Status")
    private int status;

    @Column(name = "Last_Update_Id")
    private String lastUpdateID;

    @Column(name = "Last_Update_Timestamp")
    private String lastUpdateTimeStamp;

    public TeacherPrimaryKey getTeacherPrimaryKey() {
		return teacherPrimaryKey;
	}

	public void setTeacherPrimaryKey(TeacherPrimaryKey teacherPrimaryKey) {
		this.teacherPrimaryKey = teacherPrimaryKey;
	}

	public int getStatus() {
		return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getLastUpdateID() {
        return lastUpdateID;
    }

    public int getPersonalID() {
		return personalID;
	}

	public void setPersonalID(int personalID) {
		this.personalID = personalID;
	}

	public String getTeacherType() {
		return teacherType;
	}

	public void setTeacherType(String teacherType) {
		this.teacherType = teacherType;
	}

	public void setLastUpdateID(String lastUpdateID) {
        this.lastUpdateID = lastUpdateID;
    }

    public String getLastUpdateTimeStamp() {
        return lastUpdateTimeStamp;
    }

    public void setLastUpdateTimeStamp(String lastUpdateTimeStamp) {
        this.lastUpdateTimeStamp = lastUpdateTimeStamp;
    }
}
