package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.DirecionJPA;
import com.domain.Direccion;
@Service
public class DireccionServiceImpl implements DireccionService {
	@Autowired
	private DirecionJPA jpa;
	
	@Override
	public List<Direccion> getDirecciones() {
		
		return jpa.findAll();
	}

	@Override
	public void insertDireccion(Direccion direccion) {
		// TODO Auto-generated method stub
		 jpa.save(direccion);
	}

	@Override
	public Direccion getById(Integer id) {
		// TODO Auto-generated method stub

		return jpa.getOne(id);
	}

	@Override
	public int deleteDireccion(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean updateDireccion(Direccion direccion) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Direccion getByName(String nombre) {
		// TODO Auto-generated method stub
		return jpa.getDirecionByName(nombre);
	}

}
