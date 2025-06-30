package com.estudoBrenoSpring.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudoBrenoSpring.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
