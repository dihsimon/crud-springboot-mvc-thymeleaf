package com.carmona.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.carmona.dao.DepartamentoDao;
import com.carmona.domain.Departamento;
import com.carmona.service.DepartamentoService;

@Service
public class DepartamentoServiceImpl implements DepartamentoService {
	
	@Autowired
	private DepartamentoDao dao;
	

	@Override
	@Transactional(readOnly = false)
	public void salvar(Departamento departamento) {
		dao.save(departamento);
	}

	@Override
	@Transactional(readOnly = false)
	public void editar(Departamento departamento) {
		dao.update(departamento);
	}

	@Override
	@Transactional(readOnly = false)
	public void excluir(Long id) {
		dao.delete(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Departamento buscaPorId(Long id) {
		return dao.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Departamento> buscarTodos() {
		return dao.findAll();
	}

	@Override
	public boolean departamentoTemCargo(Long id) {
		if(buscaPorId(id).getCargos().isEmpty()) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

}
