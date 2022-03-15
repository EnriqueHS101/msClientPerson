package com.ehsproy.ClientPerson.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ehsproy.ClientPerson.model.InfoPersona;
import com.ehsproy.ClientPerson.service.InfoPersonaService;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/clients")
@RequiredArgsConstructor
public class InfoPersonaController {
	
	private InfoPersonaService service;
	
	@GetMapping
	public Flux<InfoPersona> findAll(){
		System.out.println("aqui");
		return service.findAll();
	}
	
	@GetMapping("/{id}")
	public Mono<InfoPersona> findById(@RequestParam String id){
		return service.findById(id);
	}
	
	@PostMapping
	public Mono<InfoPersona> save(@RequestBody InfoPersona client){
		return service.save(client);
	}
	
	@PutMapping
	public Mono<InfoPersona> put(@RequestBody InfoPersona client){
		return service.save(client);
	}
	
	@DeleteMapping
	public Mono<Void> deleteById(@RequestParam String id){
		return service.deleteById(id);
	}
}
