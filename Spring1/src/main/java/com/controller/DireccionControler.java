package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.domain.Direccion;
import com.service.DireccionService;

@RestController
public class DireccionControler {
	@Autowired
	private DireccionService direcionService;
	
	@GetMapping("/getDirecciones")
	public @ResponseBody List<Direccion> getDirecciones(){
		return direcionService.getDirecciones();
	}
	@GetMapping("/getDireccionByName/{nombre}")
	public @ResponseBody Direccion getDireccionByName(@PathVariable String nombre) {
		return direcionService.getByName(nombre);
	}
	@GetMapping("/getDireccionById/{id}")
	public @ResponseBody Direccion getDireccionById(@PathVariable int id) {
		return direcionService.getById(id);
			
	}
	
	@PostMapping("/inserDireccion")
	public @ResponseBody void inserDireccion(@RequestBody Direccion direccion) {
		direcionService.insertDireccion(direccion);
	}
}
