package com.bnl.application.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.bnl.application.dto.InstitutionUserCredentialDTO;
import com.bnl.application.dto.InstitutionUserCredentialPrimaryKey;

public interface InstitutionUserCredentialDAO extends CrudRepository<InstitutionUserCredentialDTO, InstitutionUserCredentialPrimaryKey > {
	
	@Query(value="SELECT * FROM INSTITUTION_USER_CREDENTIAL WHERE INSTITUTION_USER_NAME = :searchTerm", nativeQuery = true)
	public InstitutionUserCredentialDTO findByInstitutionUserName(@Param("searchTerm") String userName);

}
