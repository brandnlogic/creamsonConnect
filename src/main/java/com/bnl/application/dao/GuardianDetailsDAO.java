package com.bnl.application.dao;

import org.springframework.data.repository.CrudRepository;

import com.bnl.application.dto.GuardianDetailsDTO;
import com.bnl.application.dto.GuardianPrimaryKey;

public interface GuardianDetailsDAO extends CrudRepository<GuardianDetailsDTO, GuardianPrimaryKey>{

}
