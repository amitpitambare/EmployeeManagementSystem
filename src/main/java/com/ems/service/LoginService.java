package com.ems.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.model.UserProfile;
import com.ems.repository.UserRepository;

@Service
public class LoginService {

	@Autowired
	UserRepository userRepository;
	
	public boolean validateUser(String LoginId,String Passwd) {
	
	Optional<UserProfile> user=userRepository.findById(LoginId);
	if(user.isPresent()) {
		UserProfile profile=user.get();
		if(profile.getLoginPasswd().equals(Passwd)) {
			return true;
		}
	}
		return false;
		
	}
}
