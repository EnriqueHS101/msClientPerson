package com.ehsproy.ClientPerson.service;

import com.ehsproy.ClientPerson.model.InfoPersona;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface InfoPersonaService {
	
	public Flux<InfoPersona> findAll();
	public Mono<InfoPersona> findById(String id);
	public Mono<InfoPersona> save(InfoPersona client);
	public Mono<Void> deleteById(String id);
	
}
