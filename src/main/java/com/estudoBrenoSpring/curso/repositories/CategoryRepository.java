package com.estudoBrenoSpring.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudoBrenoSpring.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	

}
