package com.formacionanbdi.springboot.app.usuarios.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "docente")
public class Docente implements Serializable {

private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_DOCENTE")
	private Integer id;
	
	@Column(name = "NOMBRES")
	private String nombres;
	
	@Column(name = "AP_PATERNO")
	private String paterno;
	
	@Column(name = "AP_MATERNO")
	private String materno;
	
	@Column(name = "DNI")
	private String dni;
	
	@Column(name = "CORREO")
	private String correo;
	
	@Column(name = "FECHA_NACIMIENTO")
	private Date nacimiento;
	
	@Column(name = "SEXO")
	private String sexo;
	
	@Column(name = "USUARIO")
	private String usuario;
	
	@Column(name = "CAMPUS")
	private String campus;
	
	@Column(name = "ESTADO")
	private String estado;
	
	@Column(name = "CATEGORIZACION_ID_CATEGORIZACION")
	private Integer idCategorizacion;

	@Column(name = "EVALUACION_ID_EVALUACION")
	private Integer idEvaluacion;
	
}
