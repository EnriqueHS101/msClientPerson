package com.ehsproy.ClientPerson.service.impl;

import org.springframework.stereotype.Service;

import com.ehsproy.ClientPerson.model.TypeDocument;
import com.ehsproy.ClientPerson.repository.ITypeDocumentRepository;
import com.ehsproy.ClientPerson.service.ITypeDocumentService;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class TypeDocumentServiceImpl implements ITypeDocumentService {
	
	private final ITypeDocumentRepository typeDocRepo;

	@Override
	public Flux<TypeDocument> findAll() {
		return typeDocRepo.findAll();
	}

	@Override
	public Mono<TypeDocument> findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<TypeDocument> save(TypeDocument typeDoc) {
		return typeDocRepo.save(typeDoc);
	}

	
}
