package com.estudoBrenoSpring.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudoBrenoSpring.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	

}
