package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Check;

@Entity
@Table(name = "pokeuser")
@Check(constraints = "pokeball > 0")
public class PokeUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Long user_id;
	
	@Column(name="uname", length = 50)
	private String user_name;
	
	@Column(name= "password", length = 50)
	@NotNull
	private String pwd;
	
	@Column(name="pokeball_quantity")
	private Long pokeball;
	
	@OneToMany (mappedBy = "user")
	List<Pokedex> pokedexs = new ArrayList<Pokedex>();

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Long getPokeball() {
		return pokeball;
	}

	public void setPokeball(Long pokeball) {
		this.pokeball = pokeball;
	}

	public List<Pokedex> getPokedexs() {
		return pokedexs;
	}

	public void setPokedexs(List<Pokedex> pokedexs) {
		this.pokedexs = pokedexs;
	}

	public PokeUser(Long user_id, String user_name, @NotNull String pwd, Long pokeball, List<Pokedex> pokedexs) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.pwd = pwd;
		this.pokeball = pokeball;
		this.pokedexs = pokedexs;
	}

	public PokeUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PokeUser [user_id=" + user_id + ", user_name=" + user_name + ", pwd=" + pwd + ", pokeball=" + pokeball
				+ ", pokedexs=" + pokedexs + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pokeball == null) ? 0 : pokeball.hashCode());
		result = prime * result + ((pokedexs == null) ? 0 : pokedexs.hashCode());
		result = prime * result + ((pwd == null) ? 0 : pwd.hashCode());
		result = prime * result + ((user_id == null) ? 0 : user_id.hashCode());
		result = prime * result + ((user_name == null) ? 0 : user_name.hashCode());
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
		PokeUser other = (PokeUser) obj;
		if (pokeball == null) {
			if (other.pokeball != null)
				return false;
		} else if (!pokeball.equals(other.pokeball))
			return false;
		if (pokedexs == null) {
			if (other.pokedexs != null)
				return false;
		} else if (!pokedexs.equals(other.pokedexs))
			return false;
		if (pwd == null) {
			if (other.pwd != null)
				return false;
		} else if (!pwd.equals(other.pwd))
			return false;
		if (user_id == null) {
			if (other.user_id != null)
				return false;
		} else if (!user_id.equals(other.user_id))
			return false;
		if (user_name == null) {
			if (other.user_name != null)
				return false;
		} else if (!user_name.equals(other.user_name))
			return false;
		return true;
	}
	

}
