package com.bnl.application.service.impl;
import com.bnl.application.common.to.PersonalInformationDtlsTO;
/*
 * Created By : Kaushik Ghosh
 * Date       : 05/07/2018
 * Description: This is the Service layer of the TeacherService which implments the TeacherService Interface. This contains the basic CRUD repository
 * operation. Also it contains two methods to set the Embeddable Primary Key and the other fields of the TeacherDetailsDTO object from the 
 * TeacherTO object.
 * This also calls the GSON class to create the JSON strign from the JSON object received as part of the GETALL call and passes that to teh controller
 * layer.
 * Alternatively it executes the method to populate the unique systemgenerate keys.
 */
import com.bnl.application.common.to.TeacherTO;
import com.bnl.application.common.util.GenerateRandomNum;
import com.bnl.application.common.util.GsonConverter;
import com.bnl.application.dao.TeachersDetailsDAO;
import com.bnl.application.dto.TeacherPrimaryKey;
import com.bnl.application.dto.TeachersDetailsDTO;
import com.bnl.application.service.PersonalInformationDtlsService;
import com.bnl.application.service.TeacherService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {
	
	/*
	 * The spring data-jpa will provide the class which is actually extending the interface TeachersDetailsDAO
	 */
    @Autowired
    TeachersDetailsDAO teachersDetailsDAO;
    
    @Autowired
    PersonalInformationDtlsService personalInformationDtlService;
    
    /*
     * (non-Javadoc)
     * @see com.bnl.service.TeacherService#saveTeacherData(com.bnl.common.to.TeacherTO)
     * POST request handling
     */
    @Override
    public Boolean saveTeacherData(TeacherTO teacherTO) {
    	
    	// setting up the primary key for the teacher class
    	TeacherPrimaryKey teacherPrimaryKey = setPrimaryKeys(teacherTO);
    	
    	//Setting up all the other variables of the Teacher Entity Class
    	TeachersDetailsDTO teacherDetailsDTO = initializeFieldMapping(teacherTO,teacherPrimaryKey); 
    	
    	//Firing the CRUD operation to insert the data into the Teacher_Dtls table
        teachersDetailsDAO.save(teacherDetailsDTO);
        
        /* 
         * calls the Method for Corresponding PersonalInformationDtlsTO object and populates that. That will be passed to the corresponding 
         * PersonalInformatioDtls Service layer so that corresponding CRUD operation can be done. 
         */
        
        PersonalInformationDtlsTO personalInformationDtlsTO = populatePersonalInformationDtlsTO(teacherTO, teacherDetailsDTO);
        personalInformationDtlService.savePersonalInformatioDtls(personalInformationDtlsTO);
        return true;
    }
    
    /*
     * (non-Javadoc)
     * @see com.bnl.service.TeacherService#editTeacherData(com.bnl.common.to.TeacherTO)
     * PUT request handling
     */
    @Override
    public Boolean editTeacherData(TeacherTO teacherTO) {
    	
    	// setting up the primary key
    	TeacherPrimaryKey teacherPrimaryKey = setPrimaryKeys(teacherTO);
        
        /*
         * Update will happen if only the entity is already there.
         */
        if(teachersDetailsDAO.existsById(teacherPrimaryKey))
        {
        	teachersDetailsDAO.save(initializeFieldMapping(teacherTO,teacherPrimaryKey));
        	return true;
       	}
        else
        	return false;
    }
    
    /*
     * (non-Javadoc)
     * @see com.bnl.service.TeacherService#deleteTeacherData(com.bnl.common.to.TeacherTO)
     * Delete Request handling
     */
    @Override
    public Boolean deleteTeacherData(TeacherTO teacherTO) {
    	
    	// setting up the primary key
    	TeacherPrimaryKey teacherPrimaryKey = setPrimaryKeys(teacherTO);
    	
        /*
         * Delete will happen if only the entity is already there.
         */
    	
        if(teachersDetailsDAO.existsById(teacherPrimaryKey))
        {
        	teachersDetailsDAO.deleteById(teacherPrimaryKey);
        	return true;
       	}
        else
        	return false;
    }
    
    /*
     * GET Request Handling. For  this we need to first pull request from the Person_identity table and populate the entire body
     * Accordingly. For the time being just for testing purpose we will just pull the details from the teachers table
     */
    
    @Override
    public String getAllTeacherData()
    {
    	List<TeachersDetailsDTO> allTeachers = new ArrayList<>();
    	
    	teachersDetailsDAO.findAll().forEach(allTeachers::add);
    	
    	if(!(allTeachers.isEmpty()))
    		return (new GsonConverter<TeachersDetailsDTO>().ConvertJSONToString(allTeachers));
    	else
    		return "X";
    }
    
    public TeacherPrimaryKey setPrimaryKeys(TeacherTO teacherTO)
    {
    	GenerateRandomNum generate = new GenerateRandomNum();
    	TeacherPrimaryKey teacherPrimaryKey = new TeacherPrimaryKey();
    	int teacheridTemp = generate.randomNumberGenerator();
    	String instituteUserId = "U" + teacherTO.getInstitutionId() + "T" + teacheridTemp;
    	teacherPrimaryKey.setInstitutionId(teacherTO.getInstitutionId());
        teacherPrimaryKey.setInstituteUserId(instituteUserId);
        teacherPrimaryKey.setTeacherId(teacheridTemp);
        
        return teacherPrimaryKey;
    }
    
    public TeachersDetailsDTO initializeFieldMapping(TeacherTO teacherTO, TeacherPrimaryKey teacherPrimaryKey)
    {
         TeachersDetailsDTO teachersDetailsDTO =  new TeachersDetailsDTO();

         //TODO : Setting of Teachers DTO .
          
          teachersDetailsDTO.setTeacherPrimaryKey(teacherPrimaryKey);
          teachersDetailsDTO.setPersonalID(new GenerateRandomNum().randomNumberGenerator());
          teachersDetailsDTO.setTeacherType(teacherTO.getTeacherType());
          teachersDetailsDTO.setStatus(teacherTO.getStatus()) ;
          teachersDetailsDTO.setLastUpdateID(teacherTO.getLastUpdateID()) ;
          
          java.util.Date dt = new java.util.Date();
          java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
          String currentTime = sdf.format(dt);
          teachersDetailsDTO.setLastUpdateTimeStamp(currentTime); 
          
          return teachersDetailsDTO;
    }
    
    public PersonalInformationDtlsTO populatePersonalInformationDtlsTO(TeacherTO teacherTO, TeachersDetailsDTO teachersDetailsDTO)
    {
    	PersonalInformationDtlsTO personalInformationDtlsTO = new PersonalInformationDtlsTO();
    	
    	personalInformationDtlsTO.setInstitutionId(teacherTO.getInstitutionId());
    	personalInformationDtlsTO.setInstitutionUserType(teacherTO.getInstitutionUserType());
    	personalInformationDtlsTO.setPersonalId(teachersDetailsDTO.getTeacherPrimaryKey().getInstituteUserId());
    	personalInformationDtlsTO.setFirstName(teacherTO.getFirstName());
    	personalInformationDtlsTO.setMiddleName(teacherTO.getMiddleName());
    	personalInformationDtlsTO.setLastName(teacherTO.getLastName());
    	personalInformationDtlsTO.setGender(teacherTO.getGender());
    	personalInformationDtlsTO.setDateOfBirth(teacherTO.getDateOfBirth());
    	personalInformationDtlsTO.setContactNumber(teacherTO.getContactNumber());
    	personalInformationDtlsTO.setCity(teacherTO.getCity());
    	personalInformationDtlsTO.setEmailId(teacherTO.getEmailId());
    	personalInformationDtlsTO.setStreetAddress(teacherTO.getStreetAddress());
    	personalInformationDtlsTO.setState(teacherTO.getState());
    	personalInformationDtlsTO.setPincode(teacherTO.getPincode());
    	personalInformationDtlsTO.setLastUpdateID(teacherTO.getLastUpdateID());
    	personalInformationDtlsTO.setLastUpdateTimeStamp(teachersDetailsDTO.getLastUpdateTimeStamp());
    	
    	return personalInformationDtlsTO;
    }
}
