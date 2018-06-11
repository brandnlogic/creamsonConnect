package com.bnl.application.service.impl;

/*
 * Created By : Kaushik Ghosh
 * Date       : 05/07/2018
 * Description: This is the Service layer of the TeacherService which implments the TeacherService Interface. This contains the basic CRUD repository
 * operation. Also it contains two methods to set the Embeddable Primary Key and the other fields of the TeacherDetailsDTO object from the 
 * TeacherTO object.
 * This also calls the GSON class to create the JSON strign from the JSON object received as part of the GETALL call and passes that to the controller
 * layer.
 * Alternatively it executes the method to populate the unique system generate keys.
 */

import com.bnl.application.common.to.UserCredentialTO;
import com.bnl.application.dao.TeachersDetailsDAO;
import com.bnl.application.dto.InstitutionUserCredentialMasterDTO;
import com.bnl.application.dto.TeacherPrimaryKey;
import com.bnl.application.dto.TeachersDetailsDTO;
import com.bnl.application.service.TeacherService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TeacherServiceImpl implements TeacherService {
	
	/*
	 * The spring data-jpa will provide the class which is actually extending the interface TeachersDetailsDAO
	 */
    @Autowired
    TeachersDetailsDAO teachersDetailsDAO;
    
    /*
     * (non-Javadoc)
     * @see com.bnl.service.TeacherService#saveTeacherData(com.bnl.common.to.TeacherTO)
     * POST request handling
     */
    @Override
    @Transactional
    public Boolean saveTeacherData(UserCredentialTO userCredentialTO,
    		InstitutionUserCredentialMasterDTO institutionUserCredentialMasterDTO) 
    {
    	
    	// setting up the primary key for the teacher class
    	TeacherPrimaryKey teacherPrimaryKey = setPrimaryKeys(userCredentialTO,institutionUserCredentialMasterDTO);
    	
    	//Setting up all the other variables of the Teacher Entity Class
    	TeachersDetailsDTO teacherDetailsDTO = initializeFieldMapping(userCredentialTO,teacherPrimaryKey,institutionUserCredentialMasterDTO); 
    	
    	//Firing the CRUD operation to insert the data into the Teacher_Dtls table
        teachersDetailsDAO.save(teacherDetailsDTO);
        
        return true;
    }
    
    /*
     * (non-Javadoc)
     * @see com.bnl.service.TeacherService#editTeacherData(com.bnl.common.to.TeacherTO)
     * PUT request handling
     */
   /* @Override
    public Boolean editTeacherData(TeacherTO teacherTO) {
    	
    	// setting up the primary key
    	TeacherPrimaryKey teacherPrimaryKey = setPrimaryKeys(teacherTO);
        
        
         * Update will happen if only the entity is already there.
         
        if(teachersDetailsDAO.existsById(teacherPrimaryKey))
        {
        	teachersDetailsDAO.save(initializeFieldMapping(teacherTO,teacherPrimaryKey));
        	return true;
       	}
        else
        	return false;
    }
    
    
     * @see com.bnl.service.TeacherService#deleteTeacherData(com.bnl.common.to.TeacherTO)
     * Delete Request handling
     
    @Override
    public Boolean deleteTeacherData(TeacherTO teacherTO) {
    	
    	// setting up the primary key
    	TeacherPrimaryKey teacherPrimaryKey = setPrimaryKeys(teacherTO);
    	
        
         * Delete will happen if only the entity is already there.
         
    	
        if(teachersDetailsDAO.existsById(teacherPrimaryKey))
        {
        	teachersDetailsDAO.deleteById(teacherPrimaryKey);
        	return true;
       	}
        else
        	return false;
    }
    
    
     * GET Request Handling. For  this we need to first pull request from the Person_identity table and populate the entire body
     * Accordingly. For the time being just for testing purpose we will just pull the details from the teachers table.
     * Note that GetAllTeacher will always happen based on the institution id, i.e., once someone logs in then only he will ask for all the 
     * teacher list. So GetAll teacher dtls will always happen based on only the id while any individual teacher details will happen based on the 
     * primary key of the teacher table. 
     
    
    @Override
    public String getAllTeacherData()
    {
    	List<TeachersDetailsDTO> allTeachers = new ArrayList<>();
    	
    	teachersDetailsDAO.findAll().forEach(allTeachers::add);
    	
    	if(!(allTeachers.isEmpty()))
    		return (new GsonConverter<TeachersDetailsDTO>().ConvertJSONToString(allTeachers));
    	else
    		return "X";
    }*/
    
    /*
     * Setting up the primary key for the teacher table
     */
    public TeacherPrimaryKey setPrimaryKeys(UserCredentialTO userCredentialTO,
    		InstitutionUserCredentialMasterDTO institutionUserCredentialMasterDTO)
    {
    //	GenerateRandomNum generate = new GenerateRandomNum();
    	TeacherPrimaryKey teacherPrimaryKey = new TeacherPrimaryKey();
    	
    	teacherPrimaryKey.setInstitutionId(institutionUserCredentialMasterDTO.getInstituteUserCredentialMasterPrimaryKey().getInstitutionId());
        teacherPrimaryKey.setInstituteUserIdTeacher(institutionUserCredentialMasterDTO.getInstituteUserCredentialMasterPrimaryKey().getInstitutionUserId());
        return teacherPrimaryKey;
    }
    
    /*
     * Setting up the Primary Key fields of the teacher_dtls table
     */
    
    public TeachersDetailsDTO initializeFieldMapping(UserCredentialTO userCredentialTO, TeacherPrimaryKey teacherPrimaryKey,
    		InstitutionUserCredentialMasterDTO institutionUserCredentialMasterDTO)
    {
         TeachersDetailsDTO teachersDetailsDTO =  new TeachersDetailsDTO();

         //TODO : Setting of Teachers DTO .
          
         teachersDetailsDTO.setTeacherPrimaryKey(teacherPrimaryKey);
         teachersDetailsDTO.setSubject(userCredentialTO.getSubject());
         teachersDetailsDTO.setTeacherType(userCredentialTO.getTeacherType());
         teachersDetailsDTO.setClassTeacherFlag(userCredentialTO.getClassTeacherFlag());
         if(userCredentialTO.getClassTeacherFlag().equalsIgnoreCase("Y"))
         {
          teachersDetailsDTO.setInstituteClass(userCredentialTO.getClassTeacherClass());;
          teachersDetailsDTO.setInstituteSec(userCredentialTO.getClassTeacherSection());
         }
         
         teachersDetailsDTO.setLastUpdateID(userCredentialTO.getLastUpdateId());
         teachersDetailsDTO.setLastUpdateTimeStamp(institutionUserCredentialMasterDTO.getLastUpdateTimestamp());
         return teachersDetailsDTO;
    }
    
}
