package com.formacionanbdi.springboot.app.oauth.services;

import com.formacionanbdi.springboot.app.oauth.models.Docente;
import com.formacionanbdi.springboot.app.oauth.models.Usuario;

public interface IUsuarioService {

	public Usuario findByUsername(String username);
	
	public Docente findDocenteByUsername(String username);

	public Usuario update(Usuario usuario, Integer id);
	
}
