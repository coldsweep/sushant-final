package com.MvcProject.rMicroservice2.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.MvcProject.rMicroservice2.dao.UserRepos;
import com.MvcProject.rMicroservice2.model.User;

@RestController
public class RegController {

	@Autowired
	UserRepos users;
	
	@RequestMapping("/check")
	public String checkconn() {
		return "welcome";
	}
	
	@RequestMapping(value="/login-user/{UserId}/{password}")
	public boolean loginHomePage(@PathVariable("UserId") int UserId, @PathVariable("password") String password, Model model) 
	{
		User u = null;
		boolean check=false;
		try {
			Optional <User> ou=users.findById(UserId);
			u=ou.get();
			if(u.getPassword().equals(password))
			{
				check=true;
			}
		}
		catch (Exception e) {
		System.out.println("User Not Found !!!");
		
		}
		if(check==true) 
		{
			return true;
		}
		return false;
	}
	
	@RequestMapping("/register-user/{UserId}/{name}/{password}")
	public String registerUser(@PathVariable("UserId") int UserId,
		                    	@PathVariable("name") String name,
		                    	@PathVariable("password") String password) {
		 System.out.println("======In register microService from loginMicroservice Start");
		User u=new User();
		u.setUserId(UserId);
		u.setName(name);
		u.setPassword(password);
		
		users.save(u);
		 System.out.println("===== in register microService from loginMicroservice end");
		return "Succcessfully Registered";
		
	}
	
}
