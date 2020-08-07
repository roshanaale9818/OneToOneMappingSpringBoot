package com.onetoonemapping.repository;

import org.springframework.data.repository.CrudRepository;

import com.onetoonemapping.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
