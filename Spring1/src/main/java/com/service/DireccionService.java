package com.service;

import java.util.List;

import com.domain.Direccion;

public interface DireccionService {
	public List<Direccion> getDirecciones();
	public void insertDireccion(Direccion direccion);
	public Direccion getById(Integer id);
	public Direccion getByName(String nombre);
	public int deleteDireccion(int id);
	public boolean updateDireccion(Direccion direccion);

}
