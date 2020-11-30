package com.pokemon.api.model.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Pokedex {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer numeroPokedex;

	private String nombrePokedex;

	private String nombreUsuario;

	private String aliasUsuario;

	@OneToMany(mappedBy = "numeroPokedex")
	private List<Pokemon> pokemones;

	public Pokedex() {
	}

	public Integer getNumeroPokedex() {
		return numeroPokedex;
	}

	public void setNumeroPokedex(Integer numeroPokedex) {
		this.numeroPokedex = numeroPokedex;
	}

	public String getNombrePokedex() {
		return nombrePokedex;
	}

	public void setNombrePokedex(String nombrePokedex) {
		this.nombrePokedex = nombrePokedex;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getAliasUsuario() {
		return aliasUsuario;
	}

	public void setAliasUsuario(String aliasUsuario) {
		this.aliasUsuario = aliasUsuario;
	}

	public List<Pokemon> getPokemones() {
		return pokemones;
	}

	public void setPokemones(List<Pokemon> pokemones) {
		this.pokemones = pokemones;
	}

}
