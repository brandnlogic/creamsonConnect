package com.bnl.application.common.to;

import java.util.List;

public class UserCredentialTO {
	
	/*
	 * Generic fields which will be appplicable to all types of USERS
	 */
	private String userName;
	private String password;
	private String userTaxId;
	private String userUniqueId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String dateofBirth;
	private String gender;
	private String primaryContactNumber;
	private String secondaryContctNumber;
	private String emailId;
	private String streetAddress;
	private String city;
	private String state;
	private String pinCode;
    private int institutionId;
	private String institutionName;
	private String role;
	private String userEnrollDate;
	private String userEndDate;
	private String lastUpdateId;
	
	/* 
	 * This block is for teacher specific request.These fields will be populated only if the user type getting enrolled is TEACHER
	 */
	private String teacherType;
	private String subject;
	
	/*
	 * Only if the teacher is a class teacher the next two fields will be populated.
	 */
	private String classTeacherFlag;
	private String classTeacherClass;
	private String classTeacherSection;
	
	//**************** Teacher specific fields end  *****************************************
	
	/*
	 * Student Specific field starts. These fields will be populated only if the user type getting enrolled is STUDENT
	 */
	
	private String studentType;
	private int userIdTeacher;
	private String institutionClass;
	private String section;
	private String studentRollNum;
	private String classStartDate;
	private String classEndDate;
	private List<GuardianDtlsTO> guardianDtlsTO;
	
	//******************  Student Specific Fields End **************************************
	
	
	public String getUserName() {
		return userName;
	}
	public String getStudentType() {
		return studentType;
	}
	public void setStudentType(String studentType) {
		this.studentType = studentType;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	
	public String getUserTaxId() {
		return userTaxId;
	}
	public void setUserTaxId(String userTaxId) {
		this.userTaxId = userTaxId;
	}
	public String getUserUniqueId() {
		return userUniqueId;
	}
	public void setUserUniqueId(String userUniqueId) {
		this.userUniqueId = userUniqueId;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDateofBirth() {
		return dateofBirth;
	}
	public void setDateofBirth(String dateofBirth) {
		this.dateofBirth = dateofBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPrimaryContactNumber() {
		return primaryContactNumber;
	}
	public void setPrimaryContactNumber(String primaryContactNumber) {
		this.primaryContactNumber = primaryContactNumber;
	}
	public String getSecondaryContctNumber() {
		return secondaryContctNumber;
	}
	public void setSecondaryContctNumber(String secondaryContctNumber) {
		this.secondaryContctNumber = secondaryContctNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	
	public int getInstitutionId() {
		return institutionId;
	}
	public void setInstitutionId(int institutionId) {
		this.institutionId = institutionId;
	}
	public String getInstitutionName() {
		return institutionName;
	}
	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getLastUpdateId() {
		return lastUpdateId;
	}
	
	public String getUserEnrollDate() {
		return userEnrollDate;
	}
	public void setUserEnrollDate(String userEnrollDate) {
		this.userEnrollDate = userEnrollDate;
	}
	public String getUserEndDate() {
		return userEndDate;
	}
	public void setUserEndDate(String userEndDate) {
		this.userEndDate = userEndDate;
	}
	public void setLastUpdateId(String lastUpdateId) {
		this.lastUpdateId = lastUpdateId;
	}
	public String getTeacherType() {
		return teacherType;
	}
	public void setTeacherType(String teacherType) {
		this.teacherType = teacherType;
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
	public String getClassTeacherClass() {
		return classTeacherClass;
	}
	public void setClassTeacherClass(String classTeacherClass) {
		this.classTeacherClass = classTeacherClass;
	}
	public String getClassTeacherSection() {
		return classTeacherSection;
	}
	public void setClassTeacherSection(String classTeacherSection) {
		this.classTeacherSection = classTeacherSection;
	}
	public String getInstitutionClass() {
		return institutionClass;
	}
	public void setInstitutionClass(String institutionClass) {
		this.institutionClass = institutionClass;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
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
	public List<GuardianDtlsTO> getGuardianDtlsTO() {
		return guardianDtlsTO;
	}
	public void setGuardianDtlsTO(List<GuardianDtlsTO> guardianDtlsTO) {
		this.guardianDtlsTO = guardianDtlsTO;
	}
	public String getStudentRollNum() {
		return studentRollNum;
	}
	public void setStudentRollNum(String studentRollNum) {
		this.studentRollNum = studentRollNum;
	}
	public int getuserIdTeacher() {
		return userIdTeacher;
	}
	public void setInstitutionIdTeacher(int userIdTeacher) {
		this.userIdTeacher = userIdTeacher;
	}
	
}
