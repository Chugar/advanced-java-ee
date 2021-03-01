package fr.training;

import java.util.List;

import fr.training.domain.DresseurEntity;
import fr.training.domain.PokemonEntity;
import fr.training.service.DresseurService;
import fr.training.service.PokemonService;

public class SimpleJpaApp {

	public static void main(String[] args) {
		
		// 		
		PokemonService pokemonService = new PokemonService();
		DresseurService dresseurService = new DresseurService();
		
		DresseurEntity dresseur = dresseurService.findById(1);
		System.out.println(dresseur.getPrenom());
		dresseur.getPokemons().forEach(p -> System.out.println(p.getName()));
	}


}
