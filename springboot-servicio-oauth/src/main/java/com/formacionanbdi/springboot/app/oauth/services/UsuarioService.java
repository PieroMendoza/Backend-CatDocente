package com.formacionanbdi.springboot.app.oauth.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.formacionanbdi.springboot.app.oauth.clients.UsuarioFeignClient;
import com.formacionanbdi.springboot.app.oauth.models.Docente;
import com.formacionanbdi.springboot.app.oauth.models.Rol;
import com.formacionanbdi.springboot.app.oauth.models.Usuario;


@CrossOrigin(origins = "*")
@Service
public class UsuarioService implements IUsuarioService, UserDetailsService{

	private Logger log = LoggerFactory.getLogger(UsuarioService.class);

	@Autowired
	private UsuarioFeignClient client;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = client.findByUsername(username);
		
		if(usuario == null) {
			log.error("Error en el login, no existe  el usuario '"+ username + "' en el sistema");
			throw new UsernameNotFoundException("Error en el login, no existe  el usuario '"+ username + "' en el sistema");
		}
		
		List<Rol> roles = new ArrayList<>();
		
		roles.add(new Rol(1, "rol1"));
		
		List<GrantedAuthority> authorities = roles
				.stream()
				.map(role -> new SimpleGrantedAuthority(role.getNombre()))
				.peek(authority -> log.info("Role" + authority.getAuthority()))
				.collect(Collectors.toList());
		log.info("Usuario autentificado: "+ username);
		
		return new User(usuario.getUsername(), usuario.getPassword(), true, true, true, true
				, authorities);
	}

	@Override
	public Usuario findByUsername(String username) {
		return client.findByUsername(username);
	}

	@Override
	public Usuario update(Usuario usuario, Integer id) {
		return client.update(usuario, id);
	}

	@Override
	public Docente findDocenteByUsername(String username) {
		return client.findDocenteByUsername(username);
	}

}
