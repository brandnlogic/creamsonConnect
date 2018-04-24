package com.bnl.dao;

import com.bnl.dto.TeachersDetailsDTO;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface TeachersDetailsDAO extends CrudRepository<TeachersDetailsDTO, TeachersDetailsDTO>  {

    TeachersDetailsDTO findByTeacherId(String teacherId);

    @Modifying
    @Transactional
    @Query(value = "delete from TEACHER_DTLS WHERE TEACHER_ID = :teacherIdList", nativeQuery = true)
    Integer deleteTeacherIdIn(@Param("teacherIdList") List<String> teacherIdList);
}
