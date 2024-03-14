package com.javaUdemy.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaUdemy.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	//não é necessário implementar nada
}
