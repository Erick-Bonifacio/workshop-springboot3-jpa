package com.javaUdemy.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaUdemy.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	//não é necessário implementar nada
}
