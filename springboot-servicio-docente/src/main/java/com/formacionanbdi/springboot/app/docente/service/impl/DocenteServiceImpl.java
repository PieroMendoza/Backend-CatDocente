package com.formacionanbdi.springboot.app.docente.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formacionanbdi.springboot.app.docente.dao.DocenteDao;
import com.formacionanbdi.springboot.app.docente.entity.Docente;
import com.formacionanbdi.springboot.app.docente.service.DocenteService;

@Service
public class DocenteServiceImpl implements DocenteService {

	@Autowired
	private DocenteDao docenteDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Docente> findAll() {
		return (List<Docente>) docenteDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Docente findById(Integer id) {
		return docenteDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Docente save(Docente docente) {
		return docenteDao.save(docente);
	}

	@Override
	@Transactional
	public void deleteById(Integer id) {
		docenteDao.deleteById(id);
	}

}
