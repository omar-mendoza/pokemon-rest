package com.pokemon.api.model.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pokemones")
public class Pokemon {

	@Id
	private Integer id;

	private String urlImagen;

	private Boolean shiny;

	private String nature;

	private Integer idPokemonApi;

	private String nombrePokemon;
	
	private Integer numeroPokedex;

	public Pokemon() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUrlImagen() {
		return urlImagen;
	}

	public void setUrlImagen(String urlImagen) {
		this.urlImagen = urlImagen;
	}

	public Boolean getShiny() {
		return shiny;
	}

	public void setShiny(Boolean shiny) {
		this.shiny = shiny;
	}

	public String getNature() {
		return nature;
	}

	public void setNature(String nature) {
		this.nature = nature;
	}

	public Integer getIdPokemonApi() {
		return idPokemonApi;
	}

	public void setIdPokemonApi(Integer idPokemonApi) {
		this.idPokemonApi = idPokemonApi;
	}

	public String getNombrePokemon() {
		return nombrePokemon;
	}

	public void setNombrePokemon(String nombrePokemon) {
		this.nombrePokemon = nombrePokemon;
	}

	public Integer getNumeroPokedex() {
		return numeroPokedex;
	}

	public void setNumeroPokedex(Integer numeroPokedex) {
		this.numeroPokedex = numeroPokedex;
	};

}
