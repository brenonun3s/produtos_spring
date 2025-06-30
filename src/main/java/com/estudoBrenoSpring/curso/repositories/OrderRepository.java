package com.estudoBrenoSpring.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudoBrenoSpring.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	

}
