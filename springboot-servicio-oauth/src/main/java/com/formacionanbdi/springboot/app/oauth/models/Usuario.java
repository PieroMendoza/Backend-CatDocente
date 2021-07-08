package com.formacionanbdi.springboot.app.oauth.models;

import java.util.List;

import lombok.Data;


@Data
public class Usuario {

	private Integer id;
	private String username;
	private String password;
	private Integer idDocente;
	private Integer idCategorizacion;
	private Integer idEvaluacion;
	private List<Rol> roles;
}
