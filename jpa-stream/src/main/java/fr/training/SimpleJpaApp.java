package fr.training;

import fr.training.domain.ArticleEntity;
import fr.training.domain.CategorieEntity;
import fr.training.service.CategorieService;


import static fr.training.util.StreamData.*;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class SimpleJpaApp {

	public static void main(String[] args) {
		
		// Printing result
		ARTICLES.forEach(System.out::println);
		
		
		// Convert to map
		Map<Integer, String> map = ARTICLES
				.stream()
				.collect(Collectors.toMap(ArticleEntity::getArticleId, ArticleEntity::getAuthor));
		
		
		// Map entry set
				map.entrySet().forEach(System.out::println);
		
				
		// Total
		Integer total = ARTICLES.stream()
			.map(art -> art.getArticleId())
			.reduce( (acc, curr) -> acc + curr)
			.orElse(0);
		System.out.println(total);
		
		
		
		// Find the biggest
		Integer maximum = NUMBERS.stream()
			.max(Integer::compare)
			.orElse(0);
		System.out.println(maximum);
		
		
		
		// Find the smallest
		Integer minimum = NUMBERS.stream()
				.min(Integer::compare)
				.orElse(0);
			System.out.println(minimum);
		
		
	}

}
