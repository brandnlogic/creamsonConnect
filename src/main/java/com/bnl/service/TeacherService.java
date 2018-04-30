package com.bnl.service;


import java.util.List;

import com.bnl.common.to.TeacherTO;
import com.bnl.dto.TeachersDetailsDTO;

public interface TeacherService
{
    public Boolean saveTeacherData(TeacherTO teacherTO);
    public Boolean editTeacherData(TeacherTO teacherTO);
	public Boolean deleteTeacherData(TeacherTO teacher);
	public String getAllTeacherData();

}
