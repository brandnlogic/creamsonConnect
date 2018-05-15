package com.bnl.application.service.impl;


/*
 * Created By : Kaushik Ghosh
 * Date       : 05/14/2018
 * Description: This is the Service layer of the login module which implements the InstitutionAdminDtlsService Interface. This contains the basic CRUD 
 * repository operation. Also it contains two methods to set the Embeddable Primary Key and the other fields of the InstitutionAdminDtlsDTO object from 
 * the InstitutionAdminDtlsTO object.
 * This also calls the GSON class to create the JSON string from the JSON object received as part of the GetByUserName call and passes that to the 
 * controller layer.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bnl.application.common.to.InstitutionAdminDtlsTO;
import com.bnl.application.common.util.GsonConverter;
import com.bnl.application.dao.InstitutionAdminDtlsDAO;
import com.bnl.application.dto.InstitutionAdminDtlsDTO;
import com.bnl.application.dto.InstitutionAdminDtlsPrimaryKey;
import com.bnl.application.service.InstitutionAdminDtlsService;

@Service
public class InstitutionAdminDtlsServiceImpl implements InstitutionAdminDtlsService {
	
	@Autowired
	InstitutionAdminDtlsDAO institutionAdminDtlsDAO;

	@Override
	public Boolean saveInstitutionAdminDtls(InstitutionAdminDtlsTO institutionAdminDtlsTO) {
		
		//Setting up all the fields of the Instituion_Admin_Dtl Entity Class
		InstitutionAdminDtlsDTO institutionAdminDtlsDTO = initializeFieldMapping(institutionAdminDtlsTO); 
		
		institutionAdminDtlsDAO.save(institutionAdminDtlsDTO);
		return true;
	}

	@Override
	public String getAllInstitutionAdminDtls() {
		return null;
	}

	@Override
	public String getInstitutionAdminDtlsByinstitutionAdminUsername(String institutionAdminUsername) {
		
		InstitutionAdminDtlsDTO institutionAdminDtlsDTOByUserName = institutionAdminDtlsDAO.findByInstitutionAdminUsername(institutionAdminUsername);
		
		return (new GsonConverter<InstitutionAdminDtlsDTO>().ConvertJSONToString(institutionAdminDtlsDTOByUserName));
	}
	
	/*
     * Setting up the primary key for the Instituion_Admin_Dtl Entity Class
     */
    public InstitutionAdminDtlsPrimaryKey setPrimaryKeys(InstitutionAdminDtlsTO institutionAdminDtlsTO)
    {
    	InstitutionAdminDtlsPrimaryKey institutionAdminDtlsPrimaryKey = new InstitutionAdminDtlsPrimaryKey();
    	
    	institutionAdminDtlsPrimaryKey.setInstitutionAdminId(institutionAdminDtlsTO.getInstitutionAdminId());
    	institutionAdminDtlsPrimaryKey.setInstitutionId(institutionAdminDtlsTO.getInstitutionId());
        
        return institutionAdminDtlsPrimaryKey;
    }
    
    /*
     * Setting up fields of the Instituion_Admin_Dtl Entity Class
     */
    
    public InstitutionAdminDtlsDTO initializeFieldMapping(InstitutionAdminDtlsTO institutionAdminDtlsTO)
    {
		InstitutionAdminDtlsDTO institutionAdminDtlsDTO = new InstitutionAdminDtlsDTO();

		institutionAdminDtlsDTO.setInstitutionAdminDtlsPrimaryKey(setPrimaryKeys(institutionAdminDtlsTO));
		institutionAdminDtlsDTO.setInstitutionAdminUsername(institutionAdminDtlsTO.getInstitutionAdminUsername());
		institutionAdminDtlsDTO.setInstitutionAdminPassword(institutionAdminDtlsTO.getInstitutionAdminPassword());
		institutionAdminDtlsDTO.setInstituionAdminRole(institutionAdminDtlsTO.getInstituionAdminRole());
		institutionAdminDtlsDTO.setInstituionAdminStatus(institutionAdminDtlsTO.getInstituionAdminStatus());
		institutionAdminDtlsDTO.setLastUpdateId(institutionAdminDtlsTO.getLastUpdateId());

		java.util.Date dt = new java.util.Date();
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String currentTime = sdf.format(dt);
		institutionAdminDtlsDTO.setLastUpdteTimestamp(currentTime);
	
		return institutionAdminDtlsDTO;
    }

}
