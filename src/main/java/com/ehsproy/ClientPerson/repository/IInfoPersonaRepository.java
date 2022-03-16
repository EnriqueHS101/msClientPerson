package com.ehsproy.ClientPerson.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.ehsproy.ClientPerson.model.InfoPersona;

import reactor.core.publisher.Mono;

public interface IInfoPersonaRepository extends ReactiveCrudRepository<InfoPersona, String> {

	
	Mono<InfoPersona> findByDocNumber(String numDoc);
}
