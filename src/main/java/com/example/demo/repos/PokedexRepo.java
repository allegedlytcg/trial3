package com.example.demo.repos;

import com.example.demo.model.PokeUser;
import com.example.demo.model.Pokedex;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PokedexRepo extends JpaRepository<Pokedex, Integer> {

	List<Pokedex> findAllByUser(PokeUser user);
}