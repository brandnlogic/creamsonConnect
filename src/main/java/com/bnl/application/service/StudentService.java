package com.bnl.application.service;

import com.bnl.application.common.to.UserCredentialTO;
import com.bnl.application.dto.InstitutionUserCredentialMasterDTO;

public interface StudentService {
	
	public Boolean saveStudentData(UserCredentialTO userCredentialTO, InstitutionUserCredentialMasterDTO institutionUserCredentialMasterDTO);

}
