package com.mballem.curso.boot.dao;

import java.util.List;

import com.mballem.curso.boot.domain.Funcionarios;

public interface FuncionariosDao {
	
void save(Funcionarios departamento);
	
	void update(Funcionarios departamento);
	
	void delete(Long id);
	
	List<Funcionarios> findAll();

}
