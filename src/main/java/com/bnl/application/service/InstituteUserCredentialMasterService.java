package com.bnl.application.service;

import com.bnl.application.common.to.GuardianDtlsTO;
import com.bnl.application.common.to.UserCredentialTO;
import com.bnl.application.dto.InstitutionUserCredentialDTO;

public interface InstituteUserCredentialMasterService {
	
	public Boolean saveInstitueUserCredentialMaster(UserCredentialTO userCredentialTO,InstitutionUserCredentialDTO institutionUserCredentialDTO);
	public Boolean saveInstitueUserCredentialMasterGuardian(GuardianDtlsTO guardianDtlsTO, UserCredentialTO userCredentialTO, InstitutionUserCredentialDTO institutionUserCredentialDTO, int studentId);
}
