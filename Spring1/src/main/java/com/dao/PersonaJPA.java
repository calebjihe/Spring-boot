package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.domain.Persona;

public interface PersonaJPA extends JpaRepository<Persona, Integer>{
	
}
