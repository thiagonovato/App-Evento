package com.logusit.eventoapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.logusit.eventoapp.models.Evento;

public interface EventoRepository extends CrudRepository<Evento, String> {
	
	Evento findByCodigo(long codigo);
}
