package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.PokeUser;
import com.example.demo.services.PokeUserService;

@RestController
@RequestMapping("/pokeuser")
@CrossOrigin
public class PokeUserController {
	
	@Autowired
	private PokeUserService pus;
	
	
	@GetMapping()
	public List<PokeUser> getUser()
	{
		return pus.getAllUsers();
	}
}
