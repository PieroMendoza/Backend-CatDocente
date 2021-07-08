package com.formacionanbdi.springboot.app.usuarios.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.JoinColumn;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "usuario")
public class Usuario{
	
	@Id
	@Column(name = "id_usuario")
	private Integer id;
	
	@Column(name = "nombre")
	private String username;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "id_docente")
	private Integer idDocente;
	
	@Column(name = "id_categorizacion")
	private Integer idCategorizacion;
	
	@Column(name = "id_evaluacion")
	private Integer idEvaluacion;
	
	
}
