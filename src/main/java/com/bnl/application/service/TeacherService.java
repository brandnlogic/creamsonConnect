package com.bnl.application.service;


import java.util.List;

import com.bnl.application.common.to.TeacherTO;
import com.bnl.application.dto.TeachersDetailsDTO;

public interface TeacherService
{
    public Boolean saveTeacherData(TeacherTO teacherTO);
    public Boolean editTeacherData(TeacherTO teacherTO);
	public Boolean deleteTeacherData(TeacherTO teacher);
	public String getAllTeacherData();

}
