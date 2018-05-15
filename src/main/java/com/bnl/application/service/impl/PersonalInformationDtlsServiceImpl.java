package com.bnl.application.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bnl.application.common.to.PersonalInformationDtlsTO;
import com.bnl.application.dao.PersonalInformationDtlsDAO;
import com.bnl.application.dto.PersonalInformationDtlsDTO;
import com.bnl.application.dto.PersonalInformationDtlsPrimaryKey;
import com.bnl.application.service.PersonalInformationDtlsService;

@Service
public class PersonalInformationDtlsServiceImpl implements PersonalInformationDtlsService {
	
	@Autowired
	PersonalInformationDtlsDAO personalInformationDtlsDAO;
	
	@Override
	public Boolean savePersonalInformatioDtls(PersonalInformationDtlsTO personalInformationDtlsTO) {
		
		personalInformationDtlsDAO.save(populatePersonalDtlsDTO(personalInformationDtlsTO));
		return true;
	}

	@Override
	public Boolean editPersonalInformatioDtls(PersonalInformationDtlsTO personalInformationDtlsTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deletePersonalInformatioDtls(PersonalInformationDtlsTO personalInformationDtlsTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAllPersonalInformatioDtls() {
		// TODO Auto-generated method stub
		return null;
	}
	
	//	populate the personalInformatioDtls table
	
	public PersonalInformationDtlsDTO populatePersonalDtlsDTO(PersonalInformationDtlsTO personalInformationDtlsTO)
	{
		PersonalInformationDtlsDTO personalInformationDtlsDTO = new PersonalInformationDtlsDTO();
		
		personalInformationDtlsDTO.setPersonalInformationDtlsPrimaryKey(populatePersonalInformationDtlsPrimaryKey(personalInformationDtlsTO));
		personalInformationDtlsDTO.setFirstName(personalInformationDtlsTO.getFirstName());
		personalInformationDtlsDTO.setMiddleName(personalInformationDtlsTO.getMiddleName());
		personalInformationDtlsDTO.setLastName(personalInformationDtlsTO.getLastName());
		personalInformationDtlsDTO.setDateOfBirth(personalInformationDtlsTO.getDateOfBirth());
		personalInformationDtlsDTO.setGender(personalInformationDtlsTO.getGender());
		personalInformationDtlsDTO.setContactNumber(personalInformationDtlsTO.getContactNumber());
		personalInformationDtlsDTO.setEmailId(personalInformationDtlsTO.getEmailId());
		personalInformationDtlsDTO.setStreetAddress(personalInformationDtlsTO.getStreetAddress());
		personalInformationDtlsDTO.setState(personalInformationDtlsTO.getState());
		personalInformationDtlsDTO.setCity(personalInformationDtlsTO.getCity());
		personalInformationDtlsDTO.setPincode(personalInformationDtlsTO.getPincode());
		personalInformationDtlsDTO.setLastUpdateID(personalInformationDtlsTO.getLastUpdateID());
		personalInformationDtlsDTO.setLastUpdateTimeStamp(personalInformationDtlsTO.getLastUpdateTimeStamp());
		
		return personalInformationDtlsDTO;
	}
	
	public PersonalInformationDtlsPrimaryKey populatePersonalInformationDtlsPrimaryKey(PersonalInformationDtlsTO personalInformationDtlsTO)
	{
		PersonalInformationDtlsPrimaryKey personalInformationDtlsPrimaryKey = new PersonalInformationDtlsPrimaryKey();
		
		personalInformationDtlsPrimaryKey.setInstitutionId(personalInformationDtlsTO.getInstitutionId());
		personalInformationDtlsPrimaryKey.setInstitueUserType(personalInformationDtlsTO.getInstitutionUserType());
		personalInformationDtlsPrimaryKey.setPersonalId(personalInformationDtlsTO.getPersonalId());
		
		return personalInformationDtlsPrimaryKey;
	}

}
