
package com.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.UsesSunHttpServer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ems.service.LoginService;

//Controller Class For Login
@RestController
public class LoginController {

	@Autowired
	LoginService loginService;
	
	 @RequestMapping("/login")
	 public String login(@RequestParam String loginID,@RequestParam String passwd) {
		 
		
	 	    boolean isUserValid=loginService.validateUser(loginID,passwd);
	 	    System.out.println(isUserValid);
	 	    if(isUserValid) {
	 	    	 return "Success";
	 	    }
	 	    else{
	 	    	return "error";
	 	    }
	 	    
	 }
	 
	
}
