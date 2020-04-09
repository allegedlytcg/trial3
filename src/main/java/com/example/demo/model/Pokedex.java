package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Check;

@Entity
@Table(name="pokedex")
@Check(constraints = "quantity > 0")
public class Pokedex {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="pokedex_id")
	private Long pokedexId;
	
	@Column(name = "quantity", nullable = false)
	private Long quantity;
	
	@ManyToOne(cascade =  CascadeType.ALL)
	@JoinColumn(name ="user_id" )
	private PokeUser user;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "PokemonID")
	private Pokemon pokemon;

	public Pokedex() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pokedex(Long pokedexId, Long quantity, PokeUser user, Pokemon pokemon) {
		super();
		this.pokedexId = pokedexId;
		this.quantity = quantity;
		this.user = user;
		this.pokemon = pokemon;
	}

	public Long getPokedexId() {
		return pokedexId;
	}

	public void setPokedexId(Long pokedexId) {
		this.pokedexId = pokedexId;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public PokeUser getUser() {
		return user;
	}

	public void setUser(PokeUser user) {
		this.user = user;
	}

	public Pokemon getPokemon() {
		return pokemon;
	}

	public void setPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pokedexId == null) ? 0 : pokedexId.hashCode());
		result = prime * result + ((pokemon == null) ? 0 : pokemon.hashCode());
		result = prime * result + ((quantity == null) ? 0 : quantity.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		Pokedex other = (Pokedex) obj;
		if (pokedexId == null) {
			if (other.pokedexId != null)
				return false;
		} else if (!pokedexId.equals(other.pokedexId))
			return false;
		if (pokemon == null) {
			if (other.pokemon != null)
				return false;
		} else if (!pokemon.equals(other.pokemon))
			return false;
		if (quantity == null) {
			if (other.quantity != null)
				return false;
		} else if (!quantity.equals(other.quantity))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pokedex [pokedexId=" + pokedexId + ", quantity=" + quantity + ", user=" + user + ", pokemon=" + pokemon
				+ "]";
	}
	
	

}
