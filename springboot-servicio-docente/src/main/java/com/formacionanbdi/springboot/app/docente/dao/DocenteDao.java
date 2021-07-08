package com.formacionanbdi.springboot.app.docente.dao;

import org.springframework.data.repository.CrudRepository;

import com.formacionanbdi.springboot.app.docente.entity.Docente;

public interface DocenteDao extends CrudRepository<Docente, Integer>{

}
