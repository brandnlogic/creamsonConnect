package com.bnl.application.common.to;

import java.util.Date;

public class TeacherTO {

    private int institutionId ;
    private int teacherId;
    private String instituteUserId;
    private int personalID ;
    private String teacherType ;
    private int  status ;
    private String lastUpdateID ;
    private String lastUpdateTimestamp ;
    
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
