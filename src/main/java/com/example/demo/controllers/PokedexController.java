package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Pokedex;
import com.example.demo.services.PokedexService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class PokedexController {

	private PokedexService pokemonService;
	
	@Autowired
	public PokedexController(PokedexService pokemonService) {
		super();
		this.pokemonService = pokemonService;
	}
	
	@GetMapping(value="/pokedex/find-all-by-user", produces="application/json")
	public ResponseEntity<List<Pokedex>> findAllByUser(@CookieValue(value = "token", defaultValue = "") String token) {
				
		return this.pokemonService.findAllByUser(token);
	}
}
