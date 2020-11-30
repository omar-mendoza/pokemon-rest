DROP TABLE IF EXISTS pokemones;
DROP TABLE IF EXISTS pokedex;

CREATE TABLE pokedex (
	numero_pokedex INT AUTO_INCREMENT PRIMARY KEY,
	nombre_pokedex VARCHAR(255) NOT NULL,
	nombre_usuario VARCHAR(255) NOT NULL,
	alias_usuario VARCHAR(255)
);

CREATE TABLE pokemones (
	id INT AUTO_INCREMENT  PRIMARY KEY,
	url_imagen VARCHAR(255),
	shiny boolean,
	nature VARCHAR(255),
	id_pokemon_api INT NOT NULL,
	nombre_pokemon VARCHAR(255),
	numero_pokedex INT NOT NULL,
	FOREIGN KEY (numero_pokedex) REFERENCES pokedex(numero_pokedex)
);


insert into pokedex (nombre_pokedex, nombre_usuario, alias_usuario ) 
	values ('Pokedex de Omar', 'omar', 'Master Omar');

insert into pokemones (url_imagen, shiny, nature, id_pokemon_api, nombre_pokemon, numero_pokedex) 
						values ('https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/1.png', false, '', 1, 'bulbasaur', 1);
insert into pokemones (url_imagen, shiny, nature, id_pokemon_api, nombre_pokemon, numero_pokedex) 
						values ('https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/2.png', false, '', 2, 'ivysaur', 1);