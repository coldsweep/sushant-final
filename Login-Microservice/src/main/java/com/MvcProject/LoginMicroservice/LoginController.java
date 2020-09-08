package com.MvcProject.LoginMicroservice;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.MvcProject.LoginMicroservice.model.User;
import com.MvcProject.LoginMicroservice.model.UserRepo;



@Controller
public class LoginController {
	
	@Autowired
    private UserRepo userRepo;
	
	@Autowired
    RestTemplate restTemplate;
	
	@GetMapping(value="/")
	public String CheckMVC() {
		return "login";
	}
	
	@RequestMapping(value="/login")
	public String loginHomePage(@RequestParam("UserId") int UserId, @RequestParam("password") String password, Model model) 
	{
		String s=restTemplate.getForObject("http://eureka-client-register/login-user/"+UserId+"/"+password , String.class);
		boolean check=Boolean.parseBoolean(s);
		if(check==true)
		{
			model.addAttribute("UserId",UserId);
			return "homePage";
		}
		model.addAttribute("error", "User not found");
		return  "dashboard";
		/*User u = null;
		try {
			Optional <User> ou=userRepo.findById(UserId);
			u=ou.get();
			System.out.println(ou.get());
	
		}
		catch (Exception e) {
			System.out.println(e);
		System.out.println("User Not Found !!!");
		
		}
		if(u!=null) {
		model.addAttribute("UserId",UserId);
		return "homePage";
		}
		model.addAttribute("error", "User not found");
		return  "dashboard";*/
	}
	
	@RequestMapping("/register")
	public String goToRegistrationPage() {
	
		return "register";
	}
	
	@RequestMapping("/set-user")
	public String goToRegisterMicroservice(@RequestParam("UserId") int UserId,
        	@RequestParam("name") String name,
            @RequestParam("password") String password,Model model) {
	
		    System.out.println("------going to register microService from loginMicroservice Start");
			restTemplate.getForObject("http://eureka-client-register/register-user/"+UserId+"/"+name+"/"+password , String.class);
			
			
			System.out.println("going to register microService from loginMicroservice End");
			
			return"Success";             
		
	}
	
}
