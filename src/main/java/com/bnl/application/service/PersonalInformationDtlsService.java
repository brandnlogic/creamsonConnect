package com.bnl.application.service;
import com.bnl.application.common.to.PersonalInformationDtlsTO;

public interface PersonalInformationDtlsService {
	
    public Boolean savePersonalInformatioDtls(PersonalInformationDtlsTO personalInformatioDtlsTO);
    public Boolean editPersonalInformatioDtls(PersonalInformationDtlsTO personalInformatioDtlsTO);
	public Boolean deletePersonalInformatioDtls(PersonalInformationDtlsTO personalInformatioDtlsTO);
	public String getAllPersonalInformatioDtls();
}
