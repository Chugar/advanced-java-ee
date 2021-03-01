package fr.training;

import java.time.LocalDate;
import java.util.List;

import fr.training.domain.DresseurEntity;
import fr.training.domain.DresseurTitle;
import fr.training.domain.PokemonEntity;
import fr.training.service.DresseurService;
import fr.training.service.PokemonService;

public class SimpleJpaApp {

	public static void main(String[] args) {
		
		// 			
		DresseurService dresseurService = new DresseurService();
		DresseurEntity dreusseur = dresseurService.findById(1);
		System.out.println(dreusseur.getPrenom());


		

	}

	// TODO: call me once then delete me
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
	
	
	public static void initializeDresseur() {
		
		DresseurService dresseurService = new DresseurService();

		PokemonService pokemonService = new PokemonService();
		List<PokemonEntity> pokemons = pokemonService.findAll();

		DresseurEntity dresseur1 = new DresseurEntity();
		dresseur1.setNom("Dresseur");
		dresseur1.setPrenom("Chinois");
		dresseur1.setArgent(2000.00);
		dresseur1.setTitle(DresseurTitle.DRESSEUR);
		dresseur1.setPokemons(pokemons);

		dresseurService.save(dresseur1);
	}

}
