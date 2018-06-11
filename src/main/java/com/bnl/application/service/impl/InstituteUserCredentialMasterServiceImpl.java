package com.bnl.application.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bnl.application.common.to.GuardianDtlsTO;
import com.bnl.application.common.to.UserCredentialTO;
import com.bnl.application.dao.InstitutionUserCredentialMasterDAO;
import com.bnl.application.dto.InstituteUserCredentialMasterPrimaryKey;
import com.bnl.application.dto.InstitutionUserCredentialDTO;
import com.bnl.application.dto.InstitutionUserCredentialMasterDTO;
import com.bnl.application.service.GuardianService;
import com.bnl.application.service.InstituteUserCredentialMasterService;
import com.bnl.application.service.StudentService;
import com.bnl.application.service.TeacherService;

@Service
public class InstituteUserCredentialMasterServiceImpl implements InstituteUserCredentialMasterService{
	
	@Autowired 
	TeacherService teacherServiceImpl;
	
	@Autowired 
	StudentService studentServiceImpl;
	
	@Autowired 
	GuardianService guardianServiceImpl; 
	
	@Autowired
	InstitutionUserCredentialMasterDAO institutionUserCredentialMasterDAO;

	@Override
	public Boolean saveInstitueUserCredentialMaster(UserCredentialTO userCredentialTO,
			InstitutionUserCredentialDTO institutionUserCredentialDTO) 
	{
		InstituteUserCredentialMasterPrimaryKey instituteUserCredentialMasterPrimaryKey = setPrimaryKey(userCredentialTO,institutionUserCredentialDTO);
        
		InstitutionUserCredentialMasterDTO institutionUserCredentialMasterDTO = setOtherFields(userCredentialTO,institutionUserCredentialDTO,instituteUserCredentialMasterPrimaryKey);
		institutionUserCredentialMasterDTO.setInstituteUserCredentialMasterPrimaryKey(instituteUserCredentialMasterPrimaryKey);
		
		if (userCredentialTO.getRole().equalsIgnoreCase("T1"))
			teacherServiceImpl.saveTeacherData(userCredentialTO, institutionUserCredentialMasterDTO);
		else if(userCredentialTO.getRole().equalsIgnoreCase("S1"))
			studentServiceImpl.saveStudentData(userCredentialTO, institutionUserCredentialMasterDTO);
        
		institutionUserCredentialMasterDAO.save(institutionUserCredentialMasterDTO);
		return true;
	}
	
	@Override
	public Boolean saveInstitueUserCredentialMasterGuardian(GuardianDtlsTO guardianDtlsTO, UserCredentialTO userCredentialTO,
			InstitutionUserCredentialDTO institutionUserCredentialDTO, int studentId) 
	{
		InstituteUserCredentialMasterPrimaryKey instituteUserCredentialMasterPrimaryKey = 
										setPrimaryKeyGuardian(userCredentialTO,institutionUserCredentialDTO);
        
		System.out.println("******* Kaushik InstituteUserCredentialMasterPrimaryKey **** " + instituteUserCredentialMasterPrimaryKey);
		InstitutionUserCredentialMasterDTO institutionUserCredentialMasterDTO = setOtherFieldsGuardian(userCredentialTO,
														institutionUserCredentialDTO,instituteUserCredentialMasterPrimaryKey);
		institutionUserCredentialMasterDTO.setInstituteUserCredentialMasterPrimaryKey(instituteUserCredentialMasterPrimaryKey);
		
		guardianServiceImpl.saveGuardianData(guardianDtlsTO,userCredentialTO, institutionUserCredentialMasterDTO, studentId);
        
		institutionUserCredentialMasterDAO.save(institutionUserCredentialMasterDTO);
		return true;
	}
	
	// Populate the Primary Key For User
	public InstituteUserCredentialMasterPrimaryKey setPrimaryKey(UserCredentialTO userCredentialTO,
			InstitutionUserCredentialDTO institutionUserCredentialDTO) 
	{
		InstituteUserCredentialMasterPrimaryKey instituteUserCredentialMasterPrimaryKey = new InstituteUserCredentialMasterPrimaryKey();
		instituteUserCredentialMasterPrimaryKey.setInstitutionId(userCredentialTO.getInstitutionId());
        instituteUserCredentialMasterPrimaryKey.setInstitutionUserId(institutionUserCredentialDTO.
        											getInstitutionUserCredentialPrimaryKey().getInstitutionUserId());
        instituteUserCredentialMasterPrimaryKey.setUserRole(userCredentialTO.getRole());
        
        return instituteUserCredentialMasterPrimaryKey;
		
	}
	
	// Populate the Primary Key For Guardian
	public InstituteUserCredentialMasterPrimaryKey setPrimaryKeyGuardian(UserCredentialTO userCredentialTO,
				InstitutionUserCredentialDTO institutionUserCredentialDTO) 
	{
		InstituteUserCredentialMasterPrimaryKey instituteUserCredentialMasterPrimaryKey = new InstituteUserCredentialMasterPrimaryKey();
		instituteUserCredentialMasterPrimaryKey.setInstitutionId(userCredentialTO.getInstitutionId());
	    instituteUserCredentialMasterPrimaryKey.setInstitutionUserId(institutionUserCredentialDTO.
	    												getInstitutionUserCredentialPrimaryKey().getInstitutionUserId());
	    instituteUserCredentialMasterPrimaryKey.setUserRole("G1");
	        
	    return instituteUserCredentialMasterPrimaryKey;
			
	}
	
	// Populate the other fields for User
	public InstitutionUserCredentialMasterDTO setOtherFields(UserCredentialTO userCredentialTO,
			InstitutionUserCredentialDTO institutionUserCredentialDTO, 
			InstituteUserCredentialMasterPrimaryKey instituteUserCredentialMasterPrimaryKey)
	{
		InstitutionUserCredentialMasterDTO institutionUserCredentialMaster = new InstitutionUserCredentialMasterDTO();
		//institutionUserCredentialMaster.setInstituteUserCredentialMasterPrimaryKey(instituteUserCredentialMasterPrimaryKey);
        institutionUserCredentialMaster.setInstitutionName(userCredentialTO.getInstitutionName());
        institutionUserCredentialMaster.setUserStatus("A");
        institutionUserCredentialMaster.setUserEnrollDate(userCredentialTO.getUserEnrollDate());
        institutionUserCredentialMaster.setUserEndDate(userCredentialTO.getUserEndDate());
        institutionUserCredentialMaster.setLastUpdateId(userCredentialTO.getLastUpdateId());
        institutionUserCredentialMaster.setLastUpdateTimestamp(institutionUserCredentialDTO.getLastUpdateTimestamp());
		
        return institutionUserCredentialMaster;
		
	}
	
	// Populate the other fields for Guardian
	public InstitutionUserCredentialMasterDTO setOtherFieldsGuardian(UserCredentialTO userCredentialTO,
			InstitutionUserCredentialDTO institutionUserCredentialDTO, 
			InstituteUserCredentialMasterPrimaryKey instituteUserCredentialMasterPrimaryKey)
	{
		InstitutionUserCredentialMasterDTO institutionUserCredentialMaster = new InstitutionUserCredentialMasterDTO();
        
	//	institutionUserCredentialMaster.setInstituteUserCredentialMasterPrimaryKey(instituteUserCredentialMasterPrimaryKey);
        institutionUserCredentialMaster.setInstitutionName(userCredentialTO.getInstitutionName());
        institutionUserCredentialMaster.setUserStatus("A");
        institutionUserCredentialMaster.setUserEnrollDate(userCredentialTO.getUserEnrollDate());
        institutionUserCredentialMaster.setUserEndDate(userCredentialTO.getUserEndDate());
        institutionUserCredentialMaster.setLastUpdateId(userCredentialTO.getLastUpdateId());
        institutionUserCredentialMaster.setLastUpdateTimestamp(institutionUserCredentialDTO.getLastUpdateTimestamp());
		
        return institutionUserCredentialMaster;
		
	}

}
