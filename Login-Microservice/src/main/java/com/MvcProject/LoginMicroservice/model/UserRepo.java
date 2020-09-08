package com.MvcProject.LoginMicroservice.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/* 
 this interface Interacts With database.
 */
@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

	

}
