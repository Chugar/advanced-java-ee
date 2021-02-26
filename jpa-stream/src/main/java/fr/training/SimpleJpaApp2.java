package fr.training;

import static java.util.stream.Collectors.toMap;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import fr.training.domain.CategorieEntity;
import fr.training.service.CategorieService;

public class SimpleJpaApp2 {

	public static void main(String[] args) {
		CategorieService cs = new CategorieService();
		
		CategorieEntity c1 = new CategorieEntity("CategorieParent");
		CategorieEntity c2 = new CategorieEntity("CategorieEnfant");
		
		c2.setParent(c1);
		cs.save(c1);
		cs.save(c2);
		
		// Retransformer une liste en Map
		cs.findAll().stream()
					.collect(toMap(CategorieEntity::getId, 
									CategorieEntity::getNom))
					.entrySet()
					.forEach(System.out::println);
		
		// flatmap : accès aux éléments d'une liste imbriquée
		List<List<String>> list = Arrays.asList(
				Arrays.asList("a", "b"),
				Arrays.asList("c", "d")
				);
		
		list.stream()
			.flatMap(Collection::stream)
			.map(String::toUpperCase)
			.forEach(System.out::println);
		
		// Additioner des int
		int sum = cs.findAll().stream()
								.mapToInt(CategorieEntity::getId)
								.sum();
		
		System.out.println("Somme : " + sum);
		
		// Trouver et afficher le max
		int max = cs.findAll().stream()
				.mapToInt(CategorieEntity::getId)
				.max()
				.getAsInt();

		System.out.println("Max : " + max);
		
		// Trouver et afficher le min
		int min = cs.findAll().stream()
				.mapToInt(CategorieEntity::getId)
				.min()
				.getAsInt();
		
		System.out.println("Min : " + min);
	}

}
