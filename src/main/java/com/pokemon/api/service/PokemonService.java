package com.pokemon.api.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.pokemon.api.model.PokemonAPI;
import com.pokemon.api.model.PokemonDTO;
import com.pokemon.api.model.Result;
import com.pokemon.api.model.TestPokemon;
import com.pokemon.api.model.entities.Pokedex;
import com.pokemon.api.model.entities.Pokemon;
import com.pokemon.api.repository.PokedexRepository;
import com.pokemon.api.repository.PokemonRepository;

@Service
public class PokemonService {

	String uri = "https://pokeapi.co/api/v2/pokemon/";

	@Autowired
	PokedexRepository pokedexRepository;

	@Autowired
	PokemonRepository pokemonRepository;

	public List<PokemonDTO> getAll(Integer size, Integer page) throws RestClientException {

		int offset = page * size;
		RestTemplate restTemplate = new RestTemplate();
		String uriAll = uri + "?limit=" + size + "&offset=" + offset;
		TestPokemon pokemonList = restTemplate.getForObject(uriAll, TestPokemon.class);

		List<Result> resultList = pokemonList.getResults();

		List<PokemonDTO> pokeList = new LinkedList<>();

		for (Result r : resultList) {
			PokemonAPI pokemon = restTemplate.getForObject(r.getURL(), PokemonAPI.class);
			
			PokemonDTO pokemonDto = new PokemonDTO();
			pokemonDto.setIdPokemonApi(pokemon.getID());
			pokemonDto.setNombrePokemon(pokemon.getName());
			pokemonDto.setUrlImagen(pokemon.getSprites().getFrontDefault());
			
			pokeList.add(pokemonDto);
		}

		return pokeList;

	}

	public Pokedex getUser(String user) {
		return pokedexRepository.findByNombreUsuario(user);
	}

	public Pokedex addPokemon(String user, Pokemon pokemon) throws IllegalArgumentException {
		Pokedex  pokedex = pokedexRepository.findByNombreUsuario(user);
		pokemon.setNumeroPokedex(pokedex.getNumeroPokedex());
		pokemonRepository.save(pokemon);
		return pokedexRepository.findById(pokedex.getNumeroPokedex()).get();
	}

	public Pokedex deletePokemon(String usuario, Integer idPokemon) {
		pokemonRepository.deleteById(idPokemon);
		return pokedexRepository.findByNombreUsuario(usuario);
	}
	
	public Pokedex updatePokemon(String usuario, Pokemon pokemon) {
		Pokemon pokemonDB = pokemonRepository.findById(pokemon.getId()).get();
		pokemonDB.setNature(pokemon.getNature());
		pokemonDB.setShiny(pokemon.getShiny());
		pokemonRepository.save(pokemonDB);
		return pokedexRepository.findByNombreUsuario(usuario);
	}
}
