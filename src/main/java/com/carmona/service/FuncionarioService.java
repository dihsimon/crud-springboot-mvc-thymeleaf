package com.carmona.service;

import java.util.List;

import com.carmona.domain.Funcionario;


public interface FuncionarioService {

void salvar(Funcionario funcionario);
	
	void editar(Funcionario funcionario);
	
	void excluir(Long id);
	
	Funcionario buscaPorId(Long id);
	
	List<Funcionario> buscarTodos();
}
