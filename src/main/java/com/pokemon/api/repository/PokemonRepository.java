package com.pokemon.api.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.pokemon.api.model.entities.Pokemon;

public interface PokemonRepository extends CrudRepository<Pokemon, Integer>{
	
	@Transactional
	public void deleteById(Integer id);

}
