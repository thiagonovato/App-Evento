package com.logusit.eventoapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.logusit.eventoapp.models.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, String>{

	Usuario findByLogin(String login);
}