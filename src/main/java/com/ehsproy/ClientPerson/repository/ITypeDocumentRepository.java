package com.ehsproy.ClientPerson.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.ehsproy.ClientPerson.model.TypeDocument;

public interface ITypeDocumentRepository extends ReactiveCrudRepository<TypeDocument, String>{

}
