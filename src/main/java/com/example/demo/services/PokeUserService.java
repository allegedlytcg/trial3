package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.PokeUser;
import com.example.demo.repos.PokeUserRepo;

@Service
public class PokeUserService {
	
	@Autowired
	private PokeUserRepo pur;

	public List<PokeUser> getAllUsers() {
		return pur.findAll();
	}

	public PokeUser getUserByUsername(String username) {
//		return pur.getUserByUsername(username);
		return null;
	}

	public PokeUser updatePokeUser(PokeUser user) {
		return pur.save(user);
	}
}
