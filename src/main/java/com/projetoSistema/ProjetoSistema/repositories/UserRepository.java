package com.projetoSistema.ProjetoSistema.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoSistema.ProjetoSistema.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
 
	
}
