package com.dao;

import java.util.List;

import com.domain.Persona;

public class PersonaDao {
	
	public Persona createPersona(Persona persona) {
		// TODO Auto-generated method stub
		Persona p= new Persona();
		if(persona!=null) {
			p.setNombre(persona.getNombre());
			p.setEdad(persona.getEdad());
			p.setDireccion(persona.getDireccion());
		}
		return p;
	}

	
	public List<Persona> getList() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Persona getpersona(String nombre) {
		Persona p= new Persona();
		if(nombre.equals("Caleb")) {
			p.setNombre("Caleb Jimenez Herrera");
			p.setEdad(33);
			p.setDireccion("sdasdas");
		}
		return p;
	}

	
	public String deletePersona(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Persona updatePersona(Persona persona) {
		// TODO Auto-generated method stub
		return null;
	}
}
