package com.estudoBrenoSpring.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudoBrenoSpring.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
	

}
