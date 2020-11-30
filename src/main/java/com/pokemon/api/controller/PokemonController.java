package com.pokemon.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pokemon.api.model.PokemonDTO;
import com.pokemon.api.model.entities.Pokedex;
import com.pokemon.api.model.entities.Pokemon;
import com.pokemon.api.service.PokemonService;

@RestController
@RequestMapping("/api")
public class PokemonController {

	@Autowired
	private PokemonService pokemonService;

	@GetMapping("/all")
	public ResponseEntity<List<PokemonDTO>> getAll(@AuthenticationPrincipal String user, @RequestParam(required = true) Integer size,
			@RequestParam(required = true) Integer page) {
		return ResponseEntity.ok(pokemonService.getAll(size, page));
	}

	@GetMapping("/user")
	public ResponseEntity<Pokedex> getUser(@AuthenticationPrincipal String user) {
		return ResponseEntity.ok(pokemonService.getUser(user));
	}

	@PostMapping("/user/add")
	public ResponseEntity<Pokedex> addPokemon(@RequestBody Pokedex usuario, @RequestBody Pokemon pokemon) {
		return ResponseEntity.ok(pokemonService.addPokemon(usuario, pokemon));
	}

	@DeleteMapping
	public ResponseEntity<Pokedex> deletePokemon(@AuthenticationPrincipal String name, @RequestParam Integer idPokemon) {
		return ResponseEntity.ok(pokemonService.deletePokemon(name, idPokemon));
	}
	
	@PutMapping
	public ResponseEntity<Pokedex> updatePokemon(@AuthenticationPrincipal String name, @RequestBody Pokemon pokemon) {
		return ResponseEntity.ok(pokemonService.updatePokemon(name, pokemon));
	}

}
