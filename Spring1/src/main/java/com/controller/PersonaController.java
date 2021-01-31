package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.PersonaJPA;
import com.domain.Persona;
import com.service.PersonaService;
import com.service.PersonaServiceImpl;

@RestController
public class PersonaController {
	
	private PersonaService servicePersona = new PersonaServiceImpl();
	//*************************************************************************
	@Autowired
	private PersonaService jpaService;
	//*************************************************************************
	@GetMapping("/getPersonas")
	public @ResponseBody String getPersona() {
		return "Hola soy Caleb";
	}
	
	@GetMapping("/getPersona")
	public @ResponseBody Persona getPer() {
		Persona p= new Persona();
		p.setNombre("Caleb Jimenez Herrera");
		p.setEdad(33);
		p.setDireccion("sdasdas");
		return p;
	}
	
	@PostMapping("/createPersona")
	public @ResponseBody Persona getP(@RequestBody Persona persona) {
		//guardar en la base dedatos  (DAO)
		Persona p= new Persona();
		p.setNombre(persona.getNombre());
		p.setEdad(persona.getEdad());
		p.setDireccion(persona.getDireccion());
		return servicePersona.createPersona(p);
	}
	
	@GetMapping("/deletePersona/{nombre}")
	public @ResponseBody String deletePersona(@PathVariable String nombre) {
		return nombre;
	}
	
	@GetMapping("/getPersonaDao/{nombre}")
	public @ResponseBody Persona getP(@PathVariable String nombre) {
		return servicePersona.getpersona(nombre);
	}
	
	@GetMapping("/getListPersonas")
	public @ResponseBody List<Persona> getList(){
		return jpaService.getList();
	}
	@PostMapping("/inserPersona")
	public @ResponseBody Persona insertarPersona(@RequestBody Persona persona) {
		return jpaService.createPersona(persona);
	}
	
	@GetMapping("/getById/{id}")
	public @ResponseBody Persona getPersona(@PathVariable Integer id) {
		return null;
	}
	
	
}
