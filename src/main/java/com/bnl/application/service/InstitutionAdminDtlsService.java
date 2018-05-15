package com.bnl.application.service;

import com.bnl.application.common.to.InstitutionAdminDtlsTO;

public interface InstitutionAdminDtlsService {
	
	public Boolean saveInstitutionAdminDtls(InstitutionAdminDtlsTO institutionAdminDtlsTO);
	public String getAllInstitutionAdminDtls();
	public String getInstitutionAdminDtlsByinstitutionAdminUsername(String institutionAdminUsername);

}
