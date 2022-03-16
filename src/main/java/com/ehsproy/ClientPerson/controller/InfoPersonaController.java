package com.ehsproy.ClientPerson.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ehsproy.ClientPerson.model.InfoPersona;
import com.ehsproy.ClientPerson.service.IInfoPersonaService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequestMapping("/clients")
@RequiredArgsConstructor
public class InfoPersonaController {
	
	private final IInfoPersonaService service;
	
	@GetMapping
	public Flux<InfoPersona> findAll(){
		return service.findAll();
	}
	
	@GetMapping("/{id}")
	public Mono<InfoPersona> findById(@PathVariable String id){
		return service.findById(id);
	}
	
	@PostMapping
	public Mono<InfoPersona> save(@RequestBody InfoPersona client){
		log.info("grabado");
		return service.save(client);
	}
	
	@PutMapping
	public Mono<InfoPersona> put(@RequestBody InfoPersona client){
		return service.save(client);
	}
	
	@DeleteMapping("/{id}")
	public Mono<Void> deleteById(@PathVariable String id){
		return service.deleteById(id);
	}
	
	@GetMapping("/busca/{numDoc}")
	public Mono<InfoPersona> findByDocNumber(@PathVariable String numDoc){
		return service.findByDocNumber(numDoc);
	}
}
