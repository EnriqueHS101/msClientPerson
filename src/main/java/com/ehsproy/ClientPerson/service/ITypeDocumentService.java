package com.ehsproy.ClientPerson.service;

import com.ehsproy.ClientPerson.model.TypeDocument;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ITypeDocumentService {

	public Flux<TypeDocument> findAll();
	public Mono<TypeDocument> findById(String id);
	public Mono<TypeDocument> save(TypeDocument typeDoc);
	
}
