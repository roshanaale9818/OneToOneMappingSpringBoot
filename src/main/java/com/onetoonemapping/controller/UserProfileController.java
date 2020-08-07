package com.onetoonemapping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onetoonemapping.model.UserProfile;
import com.onetoonemapping.service.UserProfileService;

@RestController
@RequestMapping("/userprofile")
public class UserProfileController {
	@Autowired 
	private UserProfileService userProfileService;
	
	
	@PostMapping("{userId}")
	public void addUserProfile(@PathVariable Integer userId, @RequestBody UserProfile userProfile) {
		userProfileService.addUserProfile(userId, userProfile);
	}
	

}
