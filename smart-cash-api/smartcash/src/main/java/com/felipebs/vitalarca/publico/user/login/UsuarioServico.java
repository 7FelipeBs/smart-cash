package com.felipebs.vitalarca.publico.user.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipebs.vitalarca.publico.user.Usuario;

@Service
public class UsuarioServico {
	@Autowired
	private UsuarioRepositorio repositorio;
	
	public Usuario validarAcesso(Usuario usuario) {
		return null;
	}
}
