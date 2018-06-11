package com.bnl.application.dao;

import org.springframework.data.repository.CrudRepository;
import com.bnl.application.dto.TeacherPrimaryKey;
import com.bnl.application.dto.TeachersDetailsDTO;

/*
 * Created By : Kaushik Ghosh
 * Date       : 05/07/2018
 * Description: This is an Interface which extends the default CrudRepository interface of the SpringBoot-JPA platform. For any basic CRUD operation
 * we can use the default methods offered by this interface, but for any custom made Queries we need to define the appropriate queries. Note that for 
 * the table DAO since we have a composite Primary key we are using the appropriate classes in the generics of the CrudRepository Interface.
 * Note that the SPringBoot will provide the corresponding class for the implementation of this interface.
 */
public interface TeachersDetailsDAO extends CrudRepository<TeachersDetailsDTO, TeacherPrimaryKey>  {

  //  TeachersDetailsDTO findByTeacherId(TeacherPrimaryKey teacherId);

    /*@Modifying
    @Transactional
    @Query(value = "delete from TEACHER_DTLS WHERE TEACHER_ID = :teacherIdList", nativeQuery = true)
    Integer deleteTeacherIdIn(@Param("teacherIdList") List<String> teacherIdList);*/
}
