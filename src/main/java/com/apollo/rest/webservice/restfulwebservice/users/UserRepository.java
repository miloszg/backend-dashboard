package com.apollo.rest.webservice.restfulwebservice.users;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
	List <User>findByUsername(String username);
}
