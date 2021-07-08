package com.formacionanbdi.springboot.app.oauth.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.formacionanbdi.springboot.app.oauth.models.Docente;
import com.formacionanbdi.springboot.app.oauth.models.Usuario;

@CrossOrigin(origins = "*")
@FeignClient(name = "servicio-usuario")
public interface UsuarioFeignClient {
	
	@GetMapping("/usuario/search/buscar-username")
	public Usuario findByUsername(@RequestParam String username);
	
	@GetMapping("/usuario/search/buscar-docente")
	public Docente findDocenteByUsername(@RequestParam String username);
	
	@PutMapping("/usuario/{id}")
	public Usuario update(@RequestBody Usuario usuario, @PathVariable Integer id);
	
}
