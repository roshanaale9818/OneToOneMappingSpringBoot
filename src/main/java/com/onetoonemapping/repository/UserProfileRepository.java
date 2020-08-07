package com.onetoonemapping.repository;

import org.springframework.data.repository.CrudRepository;

import com.onetoonemapping.model.UserProfile;

public interface UserProfileRepository extends CrudRepository<UserProfile, Integer> {

}
