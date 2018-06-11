package com.bnl.application.dto;

/*
 * Created By : Kaushik Ghosh
 * Date       : 05/07/2018
 * Description: This is the Entity class of the Teacher_details table. Note that since the table consist of the composite Primary key we have
 * and @EmbeddedID field.
 */

import javax.persistence.*;
//import java.util.Date;

@Entity(name = "TEACHER_DTLS")
public class TeachersDetailsDTO {

    @EmbeddedId
    private TeacherPrimaryKey teacherPrimaryKey;
    
    @Column(name = "SUBJECT")
    private String subject;
    
    @Column(name = "CLASS_TEACHER_FLAG")
    private String classTeacherFlag;
    
    @Column(name = "CLASS")
    private String instituteClass;
    
    @Column(name = "SEC")
    private String instituteSec;
    
    @Column(name = "TEACHER_TYPE")
    private String teacherType;
   
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

    public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getClassTeacherFlag() {
		return classTeacherFlag;
	}

	public void setClassTeacherFlag(String classTeacherFlag) {
		this.classTeacherFlag = classTeacherFlag;
	}

	public String getInstituteClass() {
		return instituteClass;
	}

	public void setInstituteClass(String instituteClass) {
		this.instituteClass = instituteClass;
	}

	public String getInstituteSec() {
		return instituteSec;
	}

	public void setInstituteSec(String instituteSec) {
		this.instituteSec = instituteSec;
	}

	public String getLastUpdateID() {
        return lastUpdateID;
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
