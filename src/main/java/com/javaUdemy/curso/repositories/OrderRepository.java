package com.javaUdemy.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaUdemy.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	//não é necessário implementar nada
}
