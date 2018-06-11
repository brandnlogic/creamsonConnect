package com.bnl.application.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bnl.application.common.to.UserCredentialTO;
import com.bnl.application.dao.StudentDetailsDAO;
import com.bnl.application.dto.InstitutionUserCredentialMasterDTO;
import com.bnl.application.dto.StudentDetailsDTO;
import com.bnl.application.dto.StudentPrimaryKey;
import com.bnl.application.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentDetailsDAO studentDetailsDAO;

	@Override
	public Boolean saveStudentData(UserCredentialTO userCredentialTO,
			InstitutionUserCredentialMasterDTO institutionUserCredentialMasterDTO) 
	{
		// Setting up the primary key for the student table
		StudentPrimaryKey studentPrimaryKey = setPrimaryKeys(userCredentialTO,institutionUserCredentialMasterDTO);
		
		// Setting up other fields
		StudentDetailsDTO studentDetailsDTO = initializeFieldMapping(userCredentialTO,studentPrimaryKey,institutionUserCredentialMasterDTO);
		studentDetailsDAO.save(studentDetailsDTO);
		
		return null;
	}
	
	/*
     * Setting up the primary key for the Student table
     */
    public StudentPrimaryKey setPrimaryKeys(UserCredentialTO userCredentialTO,
    		InstitutionUserCredentialMasterDTO institutionUserCredentialMasterDTO)
    {
    //	GenerateRandomNum generate = new GenerateRandomNum();
    	StudentPrimaryKey studentPrimaryKey = new StudentPrimaryKey();
    	
    	studentPrimaryKey.setInstitutionId(institutionUserCredentialMasterDTO.getInstituteUserCredentialMasterPrimaryKey().getInstitutionId());
    	studentPrimaryKey.setInstitutionUserIdStudent(institutionUserCredentialMasterDTO.getInstituteUserCredentialMasterPrimaryKey().getInstitutionUserId());
        return studentPrimaryKey;
    }
    
    /*
     * Setting up the Other fields of the student_dtls table
     */
    
    public StudentDetailsDTO initializeFieldMapping(UserCredentialTO userCredentialTO, StudentPrimaryKey studentPrimaryKey,
    		InstitutionUserCredentialMasterDTO institutionUserCredentialMasterDTO)
    {
    	StudentDetailsDTO studentDetailsDTO =  new StudentDetailsDTO();
    	
    	studentDetailsDTO.setStudentPrimaryKey(studentPrimaryKey);
    	studentDetailsDTO.setIntstitutionIdTeacher(userCredentialTO.getuserIdTeacher());
    	studentDetailsDTO.setStudentType(userCredentialTO.getStudentType());
    	studentDetailsDTO.setStudentClass(userCredentialTO.getInstitutionClass());
    	studentDetailsDTO.setStudentSec(userCredentialTO.getSection());
    	studentDetailsDTO.setStudentRollNum(userCredentialTO.getStudentRollNum());
    	studentDetailsDTO.setClassStartDate(userCredentialTO.getClassStartDate());
    	studentDetailsDTO.setClassEndDate(userCredentialTO.getClassEndDate());
    	
        return studentDetailsDTO;
    }

}
