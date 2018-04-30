package com.bnl.application.common.to;

import java.util.Date;

public class TeacherTO {

    private int instituteID ;
    private int teachersID;
    private String instituteUserID;
    private int personalID ;
    private String teacherType ;
    private int  status ;
    private String lastUpdateID ;
    private String lastUpdateTimestamp ;

    public int getInstituteID() {
        return instituteID;
    }

    public void setInstituteID(int instituteID) {
        this.instituteID = instituteID;
    }

    public int getTeachersID() {
        return teachersID;
    }

    public void setTeachersID(int teachersID) {
        this.teachersID = teachersID;
    }

    public String getInstituteUserID() {
        return instituteUserID;
    }

    public void setInstituteUserID(String instituteUserID) {
        this.instituteUserID = instituteUserID;
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

	public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getLastUpdateID() {
        return lastUpdateID;
    }

    public void setLastUpdateID(String lastUpdateID) {
        this.lastUpdateID = lastUpdateID;
    }

    public String getLastUpdateTimestamp() {
        return lastUpdateTimestamp;
    }

    public void setLastUpdateTimestamp(String lastUpdateTimestamp) {
        this.lastUpdateTimestamp = lastUpdateTimestamp;
    }
}
