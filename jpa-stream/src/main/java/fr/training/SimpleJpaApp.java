package fr.training;

import java.time.LocalDate;

import fr.training.domain.PokemonEntity;
import fr.training.service.PokemonService;

public class SimpleJpaApp {

	
	public static void main(String[] args) {
		
		initializePokemons();
		
	}
	
	
	// TODO:  call me once then delete me
	public static void initializePokemons() {
		
		PokemonService pokemonService = new PokemonService();
		
		PokemonEntity pokemon1 = new PokemonEntity("Pikachu", LocalDate.of(1994, 7, 13));
		PokemonEntity pokemon2 = new PokemonEntity("Lucario", LocalDate.of(1998, 4, 17));
		PokemonEntity pokemon3 = new PokemonEntity("Charizard", LocalDate.of(1980, 1, 21));
		PokemonEntity pokemon4 = new PokemonEntity("Chalgoumi", LocalDate.of(1729, 1, 21));

		
		pokemonService.save(pokemon1);
		pokemonService.save(pokemon2);
		pokemonService.save(pokemon3);
		pokemonService.save(pokemon4);



	}

	
}
