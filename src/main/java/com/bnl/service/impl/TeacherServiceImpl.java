package com.bnl.service.impl;

import com.bnl.common.to.TeacherTO;
import com.bnl.dao.TeachersDetailsDAO;
import com.bnl.dto.TeachersDetailsDTO;
import com.bnl.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Date;

public class TeacherServiceImpl implements TeacherService {

    @Autowired
    TeachersDetailsDAO teachersDetailsDAO;

    @Override
    public Boolean saveTeacherData(TeacherTO teacherTO) {
       TeachersDetailsDTO teachersDetailsDTO =  new TeachersDetailsDTO();

       //TODO : Setiing of Teachers DTO .

        teachersDetailsDTO.setInstitutionId(Integer.valueOf(teacherTO.getInstituteID()));
        teachersDetailsDTO.setTeacherId(Integer.valueOf(teacherTO.getTeachersID()));
        teachersDetailsDTO.setInstituteUserId(teacherTO.getInstituteUserID());
        teachersDetailsDTO.setFirstName(teacherTO.getFirstName()) ;
        teachersDetailsDTO.setMiddleName(teacherTO.getMiddleName()) ;
        teachersDetailsDTO.setLastName(teacherTO.getLastName()) ;
        teachersDetailsDTO.setDob(teacherTO.getDob()) ;
        teachersDetailsDTO.setGender(teacherTO.getGender()) ;
        teachersDetailsDTO.setContactNumber(teacherTO.getContactNumber());
        teachersDetailsDTO.setEmailID(teacherTO.getEmail()); ;
        teachersDetailsDTO.setStreetAddress(teacherTO.getStreetAddress());
        teachersDetailsDTO.setState(teacherTO.getState()) ;
        teachersDetailsDTO.setCity (teacherTO.getCity());
        teachersDetailsDTO.setPincode(teacherTO.getPincode()) ;
        teachersDetailsDTO.setStatus(teacherTO.getStatus()) ;
        teachersDetailsDTO.setLastUpdateID(teacherTO.getLastUpdateID()) ;
        teachersDetailsDTO.setLastUpdateTimeStamp(Date.valueOf(teacherTO.getLastUpdateTimestamp())); ;
        teachersDetailsDAO.save(teachersDetailsDTO);
        return true;
    }
}
