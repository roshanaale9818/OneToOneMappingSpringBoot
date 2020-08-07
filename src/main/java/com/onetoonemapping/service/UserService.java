package com.onetoonemapping.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onetoonemapping.model.User;
import com.onetoonemapping.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public List<User> getAllUsers() {
		return (List<User>) userRepository.findAll();
	}
	
	public User getUserById(Integer userId) {
		return userRepository.findById(userId).get();
	}
	
	public void updateByUserId(User user) {
		userRepository.save(user);
	}
	public void addUser(User user) {
		userRepository.save(user);
	}
	
	public void deleteUserById(Integer userId) {
		userRepository.deleteById(userId);
	}
	
	
	

}
