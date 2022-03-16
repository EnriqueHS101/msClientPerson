package com.ehsproy.ClientPerson.service.impl;


import org.springframework.stereotype.Service;

import com.ehsproy.ClientPerson.model.InfoPersona;
import com.ehsproy.ClientPerson.repository.IInfoPersonaRepository;
import com.ehsproy.ClientPerson.service.IInfoPersonaService;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class InfoPersonaServiceImpl implements IInfoPersonaService {

	private final IInfoPersonaRepository repository;
	
	public Flux<InfoPersona> findAll(){
		return repository.findAll();
	}
	
	public Mono<InfoPersona> findById(String id){
		return repository.findById(id);
	}
	
	public Mono<InfoPersona> save(InfoPersona client){
		return repository.save(client);
	}
	
	public Mono<Void> deleteById(String id){
		return repository.deleteById(id);
	}

	
	public Mono<InfoPersona> findByDocNumber(String numDoc) {
		return repository.findByDocNumber(numDoc);
	}

}
