package com.mballem.curso.boot.service;

import java.util.List;

import com.mballem.curso.boot.domain.Funcionarios;

public interface FuncionariosService {
	
	void salvar(Funcionarios cargo);
	
	void editar(Funcionarios cargo);
	
	void excluir(Long id);
	
	Funcionarios buscarPorId(Long id);
	
	List<Funcionarios> buscarTodos();;

}
