package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.model.PokeUser;
import com.example.demo.model.Pokedex;
import com.example.demo.repos.PokedexRepo;

@Service
public class PokedexService {
	
	private PokedexRepo pokedexRepo;

	@Autowired
	public PokedexService (PokedexRepo pokedexRepo) {
		super();
		this.pokedexRepo = pokedexRepo;
	}
	
	public ResponseEntity<List<Pokedex>> findAllByUser(String token) {
		
		//todo: implement JWT
//		int userId = PokeUserService.getUserIdFromJWT(token);
//		if(userId < 1) {
//			return ResponseEntity
//					.status(401)
//					.body(null);
//		}

		//for testing, hard-coding user 1 (Henry)
		long userId = 1;
		
		PokeUser user = new PokeUser();
		user.setUser_id(userId);
		
		List<Pokedex> poke =  pokedexRepo.findAllByUser(user);

		return ResponseEntity
				.status(200)
				.body(poke);
	}
}
