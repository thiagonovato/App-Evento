package com.logusit.eventoapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.logusit.eventoapp.models.Convidado;
import com.logusit.eventoapp.models.Evento;

public interface ConvidadoRepository extends CrudRepository<Convidado, String>{
	Iterable<Convidado> findByEvento(Evento evento);
	Convidado findByRg(String rg);
}