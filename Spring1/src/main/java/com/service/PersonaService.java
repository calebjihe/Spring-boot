package com.service;

import java.util.List;

import com.domain.Persona;

public interface PersonaService {
	Persona createPersona(Persona persona);
	List<Persona> getList();
	Persona getpersona(String nombre);
	String deletePersona(String nombre);
	Persona updatePersona(Persona persona);
	
}
