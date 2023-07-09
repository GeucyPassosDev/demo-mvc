package com.mballem.curso.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mballem.curso.boot.dao.FuncionariosDao;
import com.mballem.curso.boot.domain.Funcionarios;

@Service
@Transactional(readOnly = true)
public class FuncionariosServiceImpl implements FuncionariosService{
	
	@Autowired
	private FuncionariosDao dao;

	@Override
	@Transactional(readOnly = false)
	public void salvar(Funcionarios funcionarios) {
		dao.save(funcionarios);
		
	}

	@Override
	@Transactional(readOnly = false)
	public void editar(Funcionarios funcionarios) {
		dao.update(funcionarios);
		
	}

	@Override
	@Transactional(readOnly = false)
	public void excluir(Long id) {
		dao.delete(id);
		
	}

	@Override
	public Funcionarios buscarPorId(Long id) {
		return dao.findById(id);
	}

	@Override
	public List<Funcionarios> buscarTodos() {
		return dao.findAll();
	}

}
