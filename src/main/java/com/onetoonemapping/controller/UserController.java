package com.onetoonemapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.onetoonemapping.model.User;
import com.onetoonemapping.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@GetMapping
	public List<User> getUsers(){
		return userService.getAllUsers();
	}
	@PostMapping
	public void postUser(@RequestBody User user) {
		userService.addUser(user);
		
	}
	@PutMapping
	public void update(@RequestBody User user) {
		userService.updateByUserId(user);
	}
	@DeleteMapping("{userId}")
	public void delete(@PathVariable Integer userId) {
		userService.deleteUserById(userId);
		
	}
	

}
