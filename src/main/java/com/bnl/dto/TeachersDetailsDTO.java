package com.bnl.dto;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity(name = "teacher_dtls")
@Component
public class TeachersDetailsDTO implements Serializable {

    @EmbeddedId
    private TeacherPrimaryKey teacherPrimaryKey;
    
    @Column(name = "Personal_Id")
    private int personalID;
    
    @Column(name = "Teacher_Type")
    private String teacherType;
    
    @Column(name = "STATUS")
    private int status;

    @Column(name = "LAST_UPDATE_ID")
    private String lastUpdateID;

    @Column(name = "LAST_UPDATE_TIMESTAMP")
    private Date lastUpdateTimeStamp;

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

    public Date getLastUpdateTimeStamp() {
        return lastUpdateTimeStamp;
    }

    public void setLastUpdateTimeStamp(Date lastUpdateTimeStamp) {
        this.lastUpdateTimeStamp = lastUpdateTimeStamp;
    }
}
