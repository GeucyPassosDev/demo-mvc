package com.mballem.curso.boot.dao;

import org.springframework.stereotype.Repository;

import com.mballem.curso.boot.domain.Funcionarios;

@Repository
public class FuncionariosDaoImpl extends AbstractDao<Funcionarios, Long> implements FuncionariosDao{

}
