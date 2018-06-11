package com.bnl.application.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bnl.application.common.to.GuardianDtlsTO;
import com.bnl.application.common.to.UserCredentialTO;
import com.bnl.application.common.util.GenerateRandomNum;
import com.bnl.application.dao.InstitutionUserCredentialDAO;
import com.bnl.application.dao.InstitutionUserCredentialMasterDAO;
import com.bnl.application.dto.InstituteUserCredentialMasterPrimaryKey;
import com.bnl.application.dto.InstitutionUserCredentialDTO;
import com.bnl.application.dto.InstitutionUserCredentialPrimaryKey;
import com.bnl.application.service.InstituteUserCredentialMasterService;
import com.bnl.application.service.UserCredentialService;

/*
 * This is the implementation class which will serve the different type of requests 
 */

@Service
public class UserCredentialServiceImpl implements UserCredentialService {
	
	private int studentId;
	
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	@Autowired
	InstitutionUserCredentialDAO userCredentialDAO = null;
	
	@Autowired
	InstituteUserCredentialMasterService instituteUserCredentialMasterServiceImpl;
	
	InstitutionUserCredentialDTO institutionUserCredentialDTO;
	
	@Autowired
	InstitutionUserCredentialMasterDAO institutionUserCredentialMasterDAO;
	
	@Override
	@Transactional
	public int saveUserCredentialDtls(UserCredentialTO userCredentialTO) 
	{
		System.out.println(" ****** kaushik ****** before checking institute_user_dtl table ");
		if((institutionUserCredentialDTO = userCredentialDAO.findByInstitutionUserName(userCredentialTO.getUserName().toLowerCase())) != null)
		{
			InstituteUserCredentialMasterPrimaryKey instituteUserCredentialMasterPrimaryKey = new InstituteUserCredentialMasterPrimaryKey();
			instituteUserCredentialMasterPrimaryKey.setInstitutionId(userCredentialTO.getInstitutionId());
			instituteUserCredentialMasterPrimaryKey.setInstitutionUserId(institutionUserCredentialDTO.getInstitutionUserCredentialPrimaryKey().getInstitutionUserId());
			instituteUserCredentialMasterPrimaryKey.setUserRole(userCredentialTO.getRole());
			
			System.out.println(" ****** kaushik ****** institute_user_dtl table checked ");
			/*
			 * Search the Master Table to find out if there is any entry for this particular user of this particular institution in this 
			 * particular role. If it is there then return -1 menaing that duplicate entry or else if there is no entry that would mean that
			 * the role is different. So just entry one more column in the User-Credential Master table.
			 */
			if(institutionUserCredentialMasterDAO.existsById(instituteUserCredentialMasterPrimaryKey))
			{
				System.out.println(" ****** kaushik ****** institute_user_dtl_master table exist ");
				return -1;
			}
			else
			{
				System.out.println(" ****** kaushik ****** institute_user_dtl_master table doesnt exist ");
				instituteUserCredentialMasterServiceImpl.saveInstitueUserCredentialMaster(userCredentialTO, institutionUserCredentialDTO);
				return 0;
			}
			
		}
		System.out.println(" ****** kaushik ****** institute_user_dtl table checked and nothing found ");
	    InstitutionUserCredentialPrimaryKey instituteUserCredentialPrimaryKey = setPrimaryKeys(userCredentialTO);
	    
	    if(userCredentialTO.getRole().equalsIgnoreCase("S1"))
	       	studentId = instituteUserCredentialPrimaryKey.getInstitutionUserId();
	    
		institutionUserCredentialDTO = initializeFieldMapping(userCredentialTO,instituteUserCredentialPrimaryKey);
		
		instituteUserCredentialMasterServiceImpl.saveInstitueUserCredentialMaster(userCredentialTO, institutionUserCredentialDTO);
		
		userCredentialDAO.save(institutionUserCredentialDTO);
		
		System.out.println(" ****** kaushik ****** user was inserted successfully in the table ");
		
		if(userCredentialTO == null)
			System.out.println(" ****** kaushik ****** the userCredentialTO is now empty");
		
		if(userCredentialTO.getRole().equalsIgnoreCase("S1"))
		{
			System.out.println(" ****** kaushik ****** dealing with the guardian dtls");
			for (GuardianDtlsTO guardianDtlsTO : userCredentialTO.getGuardianDtlsTO())
			{
				System.out.println("******** kaushik the guardian detls - " + guardianDtlsTO );
				instituteUserCredentialPrimaryKey = setPrimaryKeysGuardianEntry(guardianDtlsTO);
				institutionUserCredentialDTO = initializeFieldMappingGuardianEntry(guardianDtlsTO,userCredentialTO,
																					instituteUserCredentialPrimaryKey);
				instituteUserCredentialMasterServiceImpl.saveInstitueUserCredentialMasterGuardian(guardianDtlsTO,userCredentialTO,
																							institutionUserCredentialDTO,studentId);
				userCredentialDAO.save(institutionUserCredentialDTO);
			}
		}
		
		return 0;
	}
	
    /*
     * Setting up the primary key for the InstitutionUserCredential Table
     */
	
    public InstitutionUserCredentialPrimaryKey setPrimaryKeys(UserCredentialTO userCredentialTO)
    {
    	GenerateRandomNum generate = new GenerateRandomNum();
    	
    	InstitutionUserCredentialPrimaryKey institutionUserCredentialPrimaryKey = new InstitutionUserCredentialPrimaryKey();
    	int institutionUserIdTemp = generate.randomNumberGenerator();
    	institutionUserCredentialPrimaryKey.setInstitutionUserId(institutionUserIdTemp);
    	// the user name in database will always be stored in lower-case
    	institutionUserCredentialPrimaryKey.setInstitutionUserName(userCredentialTO.getUserName().toLowerCase());
        
        return institutionUserCredentialPrimaryKey;
    }
    
    /*
     * Setting up the primary key for the InstitutionUserCredential Table for Guardian Entry
     */
    
    public InstitutionUserCredentialPrimaryKey setPrimaryKeysGuardianEntry(GuardianDtlsTO guardianDtlsTO)
    {
    	GenerateRandomNum generate = new GenerateRandomNum();
    	
    	InstitutionUserCredentialPrimaryKey institutionUserCredentialPrimaryKey = new InstitutionUserCredentialPrimaryKey();
    	int institutionUserIdTemp = generate.randomNumberGenerator();
    	institutionUserCredentialPrimaryKey.setInstitutionUserId(institutionUserIdTemp);
    	
    	// the user name in database will always be stored in lower-case and for guardian it will be a default with first name 
    	// and random user concatenated
    	
    	String guardianTempUserName = guardianDtlsTO.getgFirstName() + Integer.toString(institutionUserIdTemp);
    	institutionUserCredentialPrimaryKey.setInstitutionUserName(guardianTempUserName.toLowerCase());
        
        return institutionUserCredentialPrimaryKey;
    }
    
 
    
    /*
     * Setting up other fields for InstitutionUserCredential table.
     */
    
    public InstitutionUserCredentialDTO initializeFieldMapping(UserCredentialTO userCredentialTO, 
    		InstitutionUserCredentialPrimaryKey instituteUserCredentialPrimaryKey)
    {
    	InstitutionUserCredentialDTO institutionUserCredential =  new InstitutionUserCredentialDTO();
          
    	institutionUserCredential.setInstitutionUserCredentialPrimaryKey(instituteUserCredentialPrimaryKey);
    	institutionUserCredential.setInstituteUserPassword(userCredentialTO.getPassword());
    	
    	if(userCredentialTO.getUserTaxId() == null)
    		institutionUserCredential.setUserTaxId("DEFAULT");
    	else if(userCredentialTO.getUserTaxId().isEmpty())
    			institutionUserCredential.setUserTaxId("DEFAULT");
    		else
    			institutionUserCredential.setUserTaxId(userCredentialTO.getUserTaxId());
    	
    	if(userCredentialTO.getUserUniqueId() == null)
    		institutionUserCredential.setUserUniqueId("DEFAULT");
    	else if(userCredentialTO.getUserUniqueId().isEmpty())
    			institutionUserCredential.setUserUniqueId("DEFAULT");
    		else
    			institutionUserCredential.setUserUniqueId(userCredentialTO.getUserUniqueId());
    	
    	institutionUserCredential.setFirstname(userCredentialTO.getFirstName());
    	institutionUserCredential.setMiddleName(userCredentialTO.getMiddleName());
    	institutionUserCredential.setLastName(userCredentialTO.getLastName());
    	institutionUserCredential.setDateOfBirth(userCredentialTO.getDateofBirth());
    	institutionUserCredential.setGender(userCredentialTO.getGender());
    	institutionUserCredential.setPrimaryContactNumber(userCredentialTO.getPrimaryContactNumber());
    	institutionUserCredential.setSecondaryContactNumber(userCredentialTO.getSecondaryContctNumber());
    	institutionUserCredential.setEmailid(userCredentialTO.getEmailId());
    	institutionUserCredential.setStreetAddress(userCredentialTO.getStreetAddress());
    	institutionUserCredential.setCity(userCredentialTO.getCity());
    	institutionUserCredential.setState(userCredentialTO.getState());
    	institutionUserCredential.setPincode(userCredentialTO.getPinCode());
    	institutionUserCredential.setImageUrl("http:\\faulty_image:kaushik");
    	institutionUserCredential.setLastUpdateId(userCredentialTO.getLastUpdateId());
    	
    	
        java.util.Date dt = new java.util.Date();
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime = sdf.format(dt);
        institutionUserCredential.setLastUpdateTimestamp(currentTime); 
        
        return institutionUserCredential;
    }
    
    /*
     * Setting up other fields for InstitutionUserCredential table for Guardian Entry.
     */
    
    public InstitutionUserCredentialDTO initializeFieldMappingGuardianEntry(GuardianDtlsTO guardianDtlsTO, UserCredentialTO userCredentialTO,
    		InstitutionUserCredentialPrimaryKey instituteUserCredentialPrimaryKey)
    {
    	InstitutionUserCredentialDTO institutionUserCredential =  new InstitutionUserCredentialDTO();
          
    	institutionUserCredential.setInstitutionUserCredentialPrimaryKey(instituteUserCredentialPrimaryKey);
    	
    	// Default password will be set which will be same as the default user-id.
    	institutionUserCredential.setInstituteUserPassword(instituteUserCredentialPrimaryKey.getInstitutionUserName());
    	
    	if(guardianDtlsTO.getgTaxId() == null)
    		institutionUserCredential.setUserTaxId("DEFAULT");
    	else if(guardianDtlsTO.getgTaxId().isEmpty())
    			institutionUserCredential.setUserTaxId("DEFAULT");
    		else
    			institutionUserCredential.setUserTaxId(guardianDtlsTO.getgTaxId());
    	
    	if(guardianDtlsTO.getgUniqueUserId() == null)
    		institutionUserCredential.setUserUniqueId("DEFAULT");
    	else if(guardianDtlsTO.getgUniqueUserId().isEmpty())
    			institutionUserCredential.setUserUniqueId("DEFAULT");
    		else
    			institutionUserCredential.setUserUniqueId(guardianDtlsTO.getgUniqueUserId());
    	
    	institutionUserCredential.setFirstname(guardianDtlsTO.getgFirstName());
    	institutionUserCredential.setMiddleName(guardianDtlsTO.getgMiddleName());
    	institutionUserCredential.setLastName(guardianDtlsTO.getgLastName());
    	institutionUserCredential.setDateOfBirth(guardianDtlsTO.getgDob());
    	institutionUserCredential.setGender(guardianDtlsTO.getgGender());
    	institutionUserCredential.setPrimaryContactNumber(guardianDtlsTO.getgPrimaryContact());
    	institutionUserCredential.setSecondaryContactNumber(guardianDtlsTO.getgSecondaryContact());
    	institutionUserCredential.setEmailid(guardianDtlsTO.getgEmailId());
    	institutionUserCredential.setStreetAddress(guardianDtlsTO.getgStreetAdd());
    	institutionUserCredential.setCity(guardianDtlsTO.getgCity());
    	institutionUserCredential.setState(guardianDtlsTO.getgState());
    	institutionUserCredential.setPincode(guardianDtlsTO.getgPincode());
    	institutionUserCredential.setImageUrl("http:\\faulty_image:kaushik");
    	institutionUserCredential.setLastUpdateId(userCredentialTO.getLastUpdateId());
    	
    	
        java.util.Date dt = new java.util.Date();
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime = sdf.format(dt);
        institutionUserCredential.setLastUpdateTimestamp(currentTime); 
        
        return institutionUserCredential;
    }
}
