package com.bnl.application.dto;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity(name = "STUDENT_DTLS")
public class StudentDetailsDTO {
	
	@EmbeddedId
	private StudentPrimaryKey studentPrimaryKey;
	
	@Column(name = "INSTITUTION_USER_ID_TEACHER")
	private int userIdTeacher;
	
	@Column(name = "STUDENT_TYPE")
	private String studentType;
	
	@Column(name = "CLASS")
	private String studentClass;
	
	@Column(name = "SECTION")
	private String studentSec;
	
	@Column(name = "STUDENT_ROLL_NUM")
	private String studentRollNum;
	
	@Column(name = "CLASS_START_DATE")
	private String classStartDate;
	
	@Column(name = "CLASS_END_DATE")
	private String classEndDate;
	
	@Column(name = "LAST_UPDATE_ID")
	private String lastUpdateId;
	
	@Column(name = "LAST_UPDATE_TIMESTAMP")
	private String lastUpdateTimestamp;
	
	public StudentPrimaryKey getStudentPrimaryKey() {
		return studentPrimaryKey;
	}
	public void setStudentPrimaryKey(StudentPrimaryKey studentPrimaryKey) {
		this.studentPrimaryKey = studentPrimaryKey;
	}
	public int getIntstitutionIdTeacher() {
		return userIdTeacher;
	}
	public void setIntstitutionIdTeacher(int userIdTeacher) {
		this.userIdTeacher = userIdTeacher;
	}
	public String getStudentType() {
		return studentType;
	}
	public void setStudentType(String studentType) {
		this.studentType = studentType;
	}
	public String getStudentClass() {
		return studentClass;
	}
	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}
	public String getStudentSec() {
		return studentSec;
	}
	public void setStudentSec(String studentSec) {
		this.studentSec = studentSec;
	}
	public String getStudentRollNum() {
		return studentRollNum;
	}
	public void setStudentRollNum(String studentRollNum) {
		this.studentRollNum = studentRollNum;
	}
	public String getClassStartDate() {
		return classStartDate;
	}
	public void setClassStartDate(String classStartDate) {
		this.classStartDate = classStartDate;
	}
	public String getClassEndDate() {
		return classEndDate;
	}
	public void setClassEndDate(String classEndDate) {
		this.classEndDate = classEndDate;
	}
	public String getLastUpdateId() {
		return lastUpdateId;
	}
	public void setLastUpdateId(String lastUpdateId) {
		this.lastUpdateId = lastUpdateId;
	}
	public String getLastUpdateTimestamp() {
		return lastUpdateTimestamp;
	}
	public void setLastUpdateTimestamp(String lastUpdateTimestamp) {
		this.lastUpdateTimestamp = lastUpdateTimestamp;
	}

}
