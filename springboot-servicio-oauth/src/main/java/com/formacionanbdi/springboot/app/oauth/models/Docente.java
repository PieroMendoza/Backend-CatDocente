package com.formacionanbdi.springboot.app.oauth.models;

import java.util.Date;

import lombok.Data;

@Data
public class Docente {

private Integer id;
	
	private String nombres;
	
	private String paterno;
	
	private String materno;
	
	private String dni;
	
	private String correo;
	
	private Date nacimiento;
	
	private String sexo;
	
	private String usuario;
	
	private String campus;
	
	private String estado;
	
	private Integer idCategorizacion;

	private Integer idEvaluacion;
	
}
