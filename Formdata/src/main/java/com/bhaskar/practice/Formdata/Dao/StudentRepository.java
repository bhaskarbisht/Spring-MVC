package com.bhaskar.practice.Formdata.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import com.bhaskar.practice.Formdata.model.StudentModel;

@Repository
@Transactional
public class StudentRepository {

	@PersistenceContext
	EntityManager  entitymanager;
	
	


public StudentModel insert(StudentModel student){

	return entitymanager.merge(student);//JPA
	}




}
