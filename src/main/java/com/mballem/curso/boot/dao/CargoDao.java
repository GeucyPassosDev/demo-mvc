package com.mballem.curso.boot.dao;

import java.util.List;

import com.mballem.curso.boot.domain.Cargo;

public interface CargoDao {
	
	void save(Cargo departamento);
	
	void update(Cargo departamento);
	
	void delete(Long id);
	
	List<Cargo> findAll();

	Cargo findById(Long id);

}
