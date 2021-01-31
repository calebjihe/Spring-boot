package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.PersonaDao;
import com.dao.PersonaJPA;
import com.domain.Persona;

@Service
public class PersonaServiceImpl implements PersonaService {
	private PersonaDao dao =new PersonaDao();
	
	@Autowired
	private PersonaJPA jpa;
	
	@Override
	public Persona createPersona(Persona persona) {
		// TODO Auto-generated method stub
		//return dao.createPersona(persona);
		return jpa.save(persona);
		
	}
//	**********************************************************
	@Override
	public List<Persona> getList() {
		// TODO Auto-generated method stub
		return jpa.findAll();
	}
//	**********************************************************
	@Override
	public Persona getpersona(String nombre) {
		// TODO Auto-generated method stub
		return dao.getpersona(nombre);
	}

	@Override
	public String deletePersona(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Persona updatePersona(Persona persona) {
		// TODO Auto-generated method stub
		return null;
	}

}
