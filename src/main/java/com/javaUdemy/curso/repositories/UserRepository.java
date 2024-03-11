package com.javaUdemy.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaUdemy.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	//não é necessário implementar nada
}
