package com.pokemon.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

import com.pokemon.api.model.entities.Pokedex;
import com.pokemon.api.model.entities.Pokemon;
import com.pokemon.api.service.PokemonService;

@RestController
@RequestMapping("/api")
public class PokemonController {

	@Autowired
	private PokemonService pokemonService;

	@GetMapping("/all")
	public ResponseEntity<?> getAll(@AuthenticationPrincipal String user, @RequestParam(required = true) Integer size,
			@RequestParam(required = true) Integer page) {

		try {
			return ResponseEntity.ok(pokemonService.getAll(size, page));
		} catch (RestClientException e) {
			return new ResponseEntity<Object>("Error al obtener Pokemones del API http://pokeapi.co", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/user")
	public ResponseEntity<Pokedex> getUser(@AuthenticationPrincipal String user) {
		return ResponseEntity.ok(pokemonService.getUser(user));
	}

	@PostMapping("/user/add")
	public ResponseEntity<?> addPokemon(@AuthenticationPrincipal String user,
			@RequestBody(required = true) Pokemon pokemon) {
		try {
			return new ResponseEntity<Pokedex>(pokemonService.addPokemon(user, pokemon), HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<Object>("Error al añadir pokemon", HttpStatus.BAD_REQUEST);
		}
	}

	@DeleteMapping("/user/delete")
	public ResponseEntity<?> deletePokemon(@AuthenticationPrincipal String name,
			@RequestParam(required = true) Integer idPokemon) {
		try {
			return ResponseEntity.ok(pokemonService.deletePokemon(name, idPokemon));
		} catch (Exception e) {
			return new ResponseEntity<Object>("Id de Entidad Pokemon no encontrado", HttpStatus.BAD_REQUEST);
		}
	}

	@PutMapping("/user/update")
	public ResponseEntity<?> updatePokemon(@AuthenticationPrincipal String name, @RequestBody Pokemon pokemon) {
		try {
			return ResponseEntity.ok(pokemonService.updatePokemon(name, pokemon));
		} catch (Exception e) {
			return new ResponseEntity<Object>("Id de Entidad Pokemon no encontrado", HttpStatus.BAD_REQUEST);
		}
	}

}
