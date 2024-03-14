package com.javaUdemy.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaUdemy.curso.entities.OrderItem;
import com.javaUdemy.curso.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
	//não é necessário implementar nada
}
