package com.bnl.service.impl;

import com.bnl.common.to.TeacherTO;
import com.bnl.dao.TeachersDetailsDAO;
import com.bnl.dto.TeacherPrimaryKey;
import com.bnl.dto.TeachersDetailsDTO;
import com.bnl.service.TeacherService;
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
     * Accordingly. For the time being just for testing purpose we will just pull the details from the techers table
     */
    
    @Override
    public String getAllTeacherData()
    {
    	List<TeachersDetailsDTO> allTeachers = new ArrayList<>();
    	
    	teachersDetailsDAO.findAll().forEach(allTeachers::add);
    	if(!(allTeachers.isEmpty()))
    		return allTeachers.toString();
    	else
    		return "X";
    }
    
    public TeacherPrimaryKey setPrimaryKeys(TeacherTO teacherTO)
    {
    	TeacherPrimaryKey teacherPrimaryKey = new TeacherPrimaryKey();
    	teacherPrimaryKey.setInstitutionId(teacherTO.getInstituteID());
        teacherPrimaryKey.setInstituteUserId(teacherTO.getInstituteUserID());
        teacherPrimaryKey.setTeacherId(teacherTO.getTeachersID());
        
        return teacherPrimaryKey;
    }
    
    public TeachersDetailsDTO initializeFieldMapping(TeacherTO teacherTO, TeacherPrimaryKey teacherPrimaryKey)
    {
         TeachersDetailsDTO teachersDetailsDTO =  new TeachersDetailsDTO();

         //TODO : Seting of Teachers DTO .
          
          teachersDetailsDTO.setTeacherPrimaryKey(teacherPrimaryKey);
          teachersDetailsDTO.setStatus(teacherTO.getStatus()) ;
          teachersDetailsDTO.setLastUpdateID(teacherTO.getLastUpdateID()) ;
          teachersDetailsDTO.setLastUpdateTimeStamp(Date.valueOf(teacherTO.getLastUpdateTimestamp())); 
          
          return teachersDetailsDTO;
    	
    }
}
