package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.Constraint;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Check;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table(name = "Pokemon")

public class Pokemon {
	@Id
	@NotBlank
	@NotNull
	//@Constraint()
	@Column(unique = true, name = "PokemonID")
	private Long pokemonId;
	
	@Column(length = 50, nullable = false)
	private String name;
	
	@Column(length = 50)
	private String evolve_into;
	
	@Column(name="encounter_weight")
	private Long encounter_weight; 
	
	@Column(name="catch_chance")
	private Long catch_chance;
	
//	@OneToMany(mappedBy = "pokemon")
//	private List<Pokedex> pokedexs = new ArrayList<Pokedex>();

	public Long getPokeminId() {
		return pokemonId;
	}

	public void setPokeminId(Long pokeminId) {
		this.pokemonId = pokeminId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEvolve_into() {
		return evolve_into;
	}

	public void setEvolve_into(String evolve_into) {
		this.evolve_into = evolve_into;
	}

	public Long getEncounter_weight() {
		return encounter_weight;
	}

	public void setEncounter_weight(Long encounter_weight) {
		this.encounter_weight = encounter_weight;
	}

	public Long getCatch_chance() {
		return catch_chance;
	}

	public void setCatch_chance(Long catch_chance) {
		this.catch_chance = catch_chance;
	}

//	public List<Pokedex> getPokedexs() {
//		return pokedexs;
//	}
//
//	public void setPokedexs(List<Pokedex> pokedexs) {
//		this.pokedexs = pokedexs;
//	}

	public Pokemon() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pokemon(@NotBlank @NotNull Long pokeminId, String name, String evolve_into, Long encounter_weight,
			Long catch_chance) {
		super();
		this.pokemonId = pokeminId;
		this.name = name;
		this.evolve_into = evolve_into;
		this.encounter_weight = encounter_weight;
		this.catch_chance = catch_chance;
		//this.pokedexs = pokedexs;
	}

	@Override
	public String toString() {
		return "Pokemon [pokeminId=" + pokemonId + ", name=" + name + ", evolve_into=" + evolve_into
				+ ", encounter_weight=" + encounter_weight + ", catch_chance=" + catch_chance + ", pokedexs=" + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((catch_chance == null) ? 0 : catch_chance.hashCode());
		result = prime * result + ((encounter_weight == null) ? 0 : encounter_weight.hashCode());
		result = prime * result + ((evolve_into == null) ? 0 : evolve_into.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		//result = prime * result + ((pokedexs == null) ? 0 : pokedexs.hashCode());
		result = prime * result + ((pokemonId == null) ? 0 : pokemonId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pokemon other = (Pokemon) obj;
		if (catch_chance == null) {
			if (other.catch_chance != null)
				return false;
		} else if (!catch_chance.equals(other.catch_chance))
			return false;
		if (encounter_weight == null) {
			if (other.encounter_weight != null)
				return false;
		} else if (!encounter_weight.equals(other.encounter_weight))
			return false;
		if (evolve_into == null) {
			if (other.evolve_into != null)
				return false;
		} else if (!evolve_into.equals(other.evolve_into))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
//		if (pokedexs == null) {
//			if (other.pokedexs != null)
//				return false;
//		} else if (!pokedexs.equals(other.pokedexs))
//			return false;
		if (pokemonId == null) {
			if (other.pokemonId != null)
				return false;
		} else if (!pokemonId.equals(other.pokemonId))
			return false;
		return true;
	}
}
