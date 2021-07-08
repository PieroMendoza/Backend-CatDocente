package com.formacionanbdi.springboot.app.usuarios.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.formacionanbdi.springboot.app.usuarios.entity.Docente;
import com.formacionanbdi.springboot.app.usuarios.entity.Usuario;

@RepositoryRestResource(path="usuario")
public interface UsuarioDao extends JpaRepository<Usuario, Integer>{

	@RestResource(path = "buscar-username")
	@Query("select u from Usuario u where u.username=?1")
	public Usuario obtenerUsuario(@Param("username") String username);
	
	@RestResource(path = "buscar-docente")
	@Query("select d from Docente d where d.usuario = ?1")
	public Docente obtenerDocenteByUsername(@Param("username") String username);
	
}