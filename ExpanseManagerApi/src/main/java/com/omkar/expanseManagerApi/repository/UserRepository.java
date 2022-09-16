package com.omkar.expanseManagerApi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.omkar.expanseManagerApi.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	//Optional<User> findByEmail(String email);
//	Boolean existsByEmail(String email);
      Boolean existsByEmail(String email);
	
	Optional<User> findByEmail(String email);
}
