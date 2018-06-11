package com.bnl.application.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bnl.application.common.to.GuardianDtlsTO;
import com.bnl.application.common.to.UserCredentialTO;
import com.bnl.application.dao.GuardianDetailsDAO;
import com.bnl.application.dto.GuardianDetailsDTO;
import com.bnl.application.dto.GuardianPrimaryKey;
import com.bnl.application.dto.InstitutionUserCredentialMasterDTO;
import com.bnl.application.service.GuardianService;

@Service
public class GuardianServiceImpl implements GuardianService {

	@Autowired
	GuardianDetailsDAO guardianDetailsDAO;
	
	@Override
	public Boolean saveGuardianData(GuardianDtlsTO guardianDtlsTO, UserCredentialTO userCredentialTO, InstitutionUserCredentialMasterDTO institutionUserCredentialMasterDTO, 
			int studentId) {
		
		// Setting the Primary-Key.
		GuardianPrimaryKey guardianPrimaryKey = setPrimaryKeys(userCredentialTO,institutionUserCredentialMasterDTO,studentId);
		
		System.out.println("***** kaushik *** guardian primary key - " + guardianPrimaryKey);
		// Setting up other fields.
		GuardianDetailsDTO guardianDetailsDTO = initializeFieldMapping(guardianDtlsTO,guardianPrimaryKey,institutionUserCredentialMasterDTO);
		guardianDetailsDAO.save(guardianDetailsDTO);
		
		return true;
	}
	
	/*
	 * Setting up the primary key fields for the Guardian Table
	 */
	public GuardianPrimaryKey setPrimaryKeys(UserCredentialTO userCredentialTO,
			InstitutionUserCredentialMasterDTO institutionUserCredentialMasterDTO, int studentId)
	{
		GuardianPrimaryKey guardianPrimaryKey = new GuardianPrimaryKey();
		
		guardianPrimaryKey.setInstitutionId(userCredentialTO.getInstitutionId());
		guardianPrimaryKey.setInstitutionUserIdGuardian(institutionUserCredentialMasterDTO.getInstituteUserCredentialMasterPrimaryKey().getInstitutionUserId());
		guardianPrimaryKey.setInstitutionUserIdStudent(studentId);
		
		return guardianPrimaryKey;
	}
	
	/*
     * Setting up the Other fields of the Guardian table
     */
    
    public GuardianDetailsDTO initializeFieldMapping(GuardianDtlsTO guardianDtlsTO, GuardianPrimaryKey guardianPrimaryKey,
    		InstitutionUserCredentialMasterDTO institutionUserCredentialMasterDTO)
    {
    	GuardianDetailsDTO guardianDetailsDTO = new GuardianDetailsDTO();
    	guardianDetailsDTO.setGuardianPrimaryKey(guardianPrimaryKey);
    	guardianDetailsDTO.setGuardianType(guardianDtlsTO.getgGuardianType());
    	guardianDetailsDTO.setRelationship(guardianDtlsTO.getgGuardianRelationship());
    	guardianDetailsDTO.setLastUpdateId(institutionUserCredentialMasterDTO.getLastUpdateId());
    	guardianDetailsDTO.setLastUpdateTimestamp(institutionUserCredentialMasterDTO.getLastUpdateTimestamp());
    	
    	return guardianDetailsDTO;
    }

}


