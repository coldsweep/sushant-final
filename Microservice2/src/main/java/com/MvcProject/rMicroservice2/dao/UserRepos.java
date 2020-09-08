package com.MvcProject.rMicroservice2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.MvcProject.rMicroservice2.model.User;

@Repository
public interface UserRepos extends JpaRepository<User,Integer> {

}
 