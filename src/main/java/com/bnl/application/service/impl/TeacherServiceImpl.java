package com.bnl.application.service.impl;

import com.bnl.application.common.to.TeacherTO;
import com.bnl.application.dao.TeachersDetailsDAO;
import com.bnl.application.dto.TeacherPrimaryKey;
import com.bnl.application.dto.TeachersDetailsDTO;
import com.bnl.application.service.TeacherService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

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
    public Boolean saveTeacherData(TeacherTO teacherTO) {
    	
    	// setting up the primary key
    	TeacherPrimaryKey teacherPrimaryKey = setPrimaryKeys(teacherTO);
        teachersDetailsDAO.save(initializeFieldMapping(teacherTO,teacherPrimaryKey));
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
    	TeacherPrimaryKey teacherPrimaryKey = new TeacherPrimaryKey();
    	
    	teacherPrimaryKey.setInstitutionId(teacherTO.getInstitutionId());
        teacherPrimaryKey.setInstituteUserId(teacherTO.getInstituteUserId());
        teacherPrimaryKey.setTeacherId(teacherTO.getTeacherId());
        
        return teacherPrimaryKey;
    }
    
    public TeachersDetailsDTO initializeFieldMapping(TeacherTO teacherTO, TeacherPrimaryKey teacherPrimaryKey)
    {
         TeachersDetailsDTO teachersDetailsDTO =  new TeachersDetailsDTO();

         //TODO : Seting of Teachers DTO .
          
          teachersDetailsDTO.setTeacherPrimaryKey(teacherPrimaryKey);
          teachersDetailsDTO.setPersonalID(teacherTO.getPersonalID());
          teachersDetailsDTO.setTeacherType(teacherTO.getTeacherType());
          teachersDetailsDTO.setStatus(teacherTO.getStatus()) ;
          teachersDetailsDTO.setLastUpdateID(teacherTO.getLastUpdateID()) ;
          
          java.util.Date dt = new java.util.Date();
          java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
          String currentTime = sdf.format(dt);
          teachersDetailsDTO.setLastUpdateTimeStamp(currentTime); 
          
/*          System.out.println("\n\n **************************************** ");
          System.out.println("Institute-id :-" + teacherPrimaryKey.getInstitutionId());
          System.out.println("Institute-user-id :-" + teacherPrimaryKey.getInstituteUserId());
          System.out.println("Institute-teacher-id :-" + teacherPrimaryKey.getTeacherId());
          System.out.println("Institute-personal-id :-" + teachersDetailsDTO.getPersonalID());
          System.out.println("Institute-teacher-type :-" + teachersDetailsDTO.getTeacherType());
          System.out.println("Institute-teacher-status :-" + teachersDetailsDTO.getStatus());
          System.out.println("Institute-last-updt-id :-" + teachersDetailsDTO.getLastUpdateID());
          System.out.println("Institute-last-updt-ts:-" + teachersDetailsDTO.getLastUpdateTimeStamp());*/
          
          return teachersDetailsDTO;
    	
    }
}
