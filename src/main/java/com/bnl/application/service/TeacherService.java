package com.bnl.application.service;
import com.bnl.application.common.to.UserCredentialTO;
import com.bnl.application.dto.InstitutionUserCredentialMasterDTO;

public interface TeacherService
{
    public Boolean saveTeacherData(UserCredentialTO userCredentialTO, InstitutionUserCredentialMasterDTO institutionUserCredentialMasterDTO);
    /*public Boolean editTeacherData(TeacherTO teacherTO);
	public Boolean deleteTeacherData(TeacherTO teacher);
	public String getAllTeacherData();*/

}
