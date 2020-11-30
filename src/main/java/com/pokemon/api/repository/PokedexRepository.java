package com.pokemon.api.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.pokemon.api.model.entities.Pokedex;

public interface PokedexRepository extends CrudRepository<Pokedex, Integer> {
	
	@Transactional
	public Pokedex findByNombreUsuario(String name);

}
