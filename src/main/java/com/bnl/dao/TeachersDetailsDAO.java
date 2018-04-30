package com.bnl.dao;

import com.bnl.dto.TeacherPrimaryKey;
import com.bnl.dto.TeachersDetailsDTO;
import org.springframework.data.repository.CrudRepository;

public interface TeachersDetailsDAO extends CrudRepository<TeachersDetailsDTO, TeacherPrimaryKey>  {

  //  TeachersDetailsDTO findByTeacherId(TeacherPrimaryKey teacherId);

    /*@Modifying
    @Transactional
    @Query(value = "delete from TEACHER_DTLS WHERE TEACHER_ID = :teacherIdList", nativeQuery = true)
    Integer deleteTeacherIdIn(@Param("teacherIdList") List<String> teacherIdList);*/
}
