package com.ehsproy.ClientPerson.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.ehsproy.ClientPerson.model.InfoPersona;

public interface InfoPersonaRepository extends ReactiveCrudRepository<InfoPersona, String> {

}
