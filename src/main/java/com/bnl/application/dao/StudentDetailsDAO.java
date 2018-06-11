package com.bnl.application.dao;

import org.springframework.data.repository.CrudRepository;

import com.bnl.application.dto.StudentDetailsDTO;
import com.bnl.application.dto.StudentPrimaryKey;


public interface StudentDetailsDAO extends CrudRepository<StudentDetailsDTO, StudentPrimaryKey>{
	
	
}
