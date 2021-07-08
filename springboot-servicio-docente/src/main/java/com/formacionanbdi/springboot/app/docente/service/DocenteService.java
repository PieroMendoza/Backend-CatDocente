package com.formacionanbdi.springboot.app.docente.service;

import java.util.List;

import com.formacionanbdi.springboot.app.docente.entity.Docente;

public interface DocenteService {

	public List<Docente> findAll();
	public Docente findById(Integer id);
	public Docente save(Docente docente);
	public void deleteById(Integer id);
	
}
