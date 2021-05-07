package com.felipebs.vitalarca.publico.user.login;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.felipebs.vitalarca.publico.user.Usuario;

@RestController
@RequestMapping(value = "/public")
public class UsuarioControlador {
	
	@PostMapping("/user")
	public Usuario acessoAoSite(@RequestBody Usuario usuario) {
		return null;
	}
}
