package com.carmona.service;

import java.util.List;

import com.carmona.domain.Cargo;

public interface CargoService {

	void salvar(Cargo cargo);
	
	void editar(Cargo cargo);
	
	void excluir(Long id);
	
	Cargo buscaPorId(Long id);
	
	List<Cargo> buscarTodos();
	
}
