package com.bnl.application.dao;

import org.springframework.data.repository.CrudRepository;
import com.bnl.application.dto.InstituteUserCredentialMasterPrimaryKey;
import com.bnl.application.dto.InstitutionUserCredentialMasterDTO;

public interface InstitutionUserCredentialMasterDAO extends CrudRepository<InstitutionUserCredentialMasterDTO, 
																		InstituteUserCredentialMasterPrimaryKey > {
	
	/*@Query(value="SELECT * FROM INSTITUTION_USER_CREDENTIAL_MASTER WHERE INSTITUTION_ID = :searchTerm1 "
			+ "AND INSTITUTION_USER_ID = :searchTerm2 AND INSTITUTION_USER_ROLE = :searchTerm3", nativeQuery = true)
	public InstitutionUserCredentialDTO findByInstitutionUserName(@Param("searchTerm1") int institutionId, 
			@Param("searchTerm2") int institutionUserId, @Param("searchTerm3") String institutionUserRole);*/


}
