package com.pokemon.api.model;

public class PokemonDTO {

	private Integer idPokemonApi;
	
	private String urlImagen;

	private Boolean shiny;

	private String nature;

	private String nombrePokemon;

	public PokemonDTO() {
		this.urlImagen = "";
		this.shiny = false;
		this.nature = "";
	}
	
	public Integer getIdPokemonApi() {
		return idPokemonApi;
	}

	public void setIdPokemonApi(Integer idPokemonApi) {
		this.idPokemonApi = idPokemonApi;
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

	public String getNombrePokemon() {
		return nombrePokemon;
	}

	public void setNombrePokemon(String nombrePokemon) {
		this.nombrePokemon = nombrePokemon;
	}
	

}
