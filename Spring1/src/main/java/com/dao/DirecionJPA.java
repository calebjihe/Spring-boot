package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.domain.Direccion;

public interface DirecionJPA extends JpaRepository<Direccion, Integer> {
	@Query(value="SELECT * FROM DIRECCION WHERE NOMBRE_CALLE=?",nativeQuery=true)
	public Direccion getDirecionByName(String nombre);

}
