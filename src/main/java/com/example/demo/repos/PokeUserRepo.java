package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.PokeUser;

@Repository
public interface PokeUserRepo extends JpaRepository<PokeUser, Long>{

}
