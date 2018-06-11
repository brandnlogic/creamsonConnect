package com.bnl.application.service;

import com.bnl.application.common.to.GuardianDtlsTO;
import com.bnl.application.common.to.UserCredentialTO;
import com.bnl.application.dto.InstitutionUserCredentialMasterDTO;

public interface GuardianService {
	
	public Boolean saveGuardianData(GuardianDtlsTO guardianDtlsTO, UserCredentialTO userCredentialTO, InstitutionUserCredentialMasterDTO institutionUserCredentialMasterDTO, 
			int studentId);

}
