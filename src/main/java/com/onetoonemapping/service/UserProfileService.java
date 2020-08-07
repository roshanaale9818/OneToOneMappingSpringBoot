package com.onetoonemapping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onetoonemapping.model.UserProfile;
import com.onetoonemapping.repository.UserProfileRepository;
import com.onetoonemapping.repository.UserRepository;

@Service
public class UserProfileService {
	@Autowired
	private UserProfileRepository userProfileRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	public void addUserProfile(Integer userId, UserProfile userProfile) {
		userRepository.findById(userId).map(userData ->{
			userProfile.setUser(userData);
			return userProfileRepository.save(userProfile);
		}).orElseThrow(()->(new ResourceNotFoundException("UserId"+userId+"Not Found")));		
	}

}
