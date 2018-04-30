package com.bnl.application.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bnl.application.dto.TeacherPrimaryKey;
import com.bnl.application.dto.TeachersDetailsDTO;

//@Repository
public interface TeachersDetailsDAO extends CrudRepository<TeachersDetailsDTO, TeacherPrimaryKey>  {

  //  TeachersDetailsDTO findByTeacherId(TeacherPrimaryKey teacherId);

    /*@Modifying
    @Transactional
    @Query(value = "delete from TEACHER_DTLS WHERE TEACHER_ID = :teacherIdList", nativeQuery = true)
    Integer deleteTeacherIdIn(@Param("teacherIdList") List<String> teacherIdList);*/
}
