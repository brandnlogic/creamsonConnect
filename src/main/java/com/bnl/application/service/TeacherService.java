package com.bnl.application.service;


import com.bnl.application.common.to.TeacherTO;

public interface TeacherService
{
    public Boolean saveTeacherData(TeacherTO teacherTO);
    public Boolean editTeacherData(TeacherTO teacherTO);
	public Boolean deleteTeacherData(TeacherTO teacher);
	public String getAllTeacherData();

}
