package fr.training.util;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import fr.training.domain.ArticleEntity;

public class StreamData {

	public static List<ArticleEntity> ARTICLES = Arrays.asList(
		new ArticleEntity(1, "Sipmle","Dimple",LocalDate.now(), null),
		new ArticleEntity(2, "Clear","Red",LocalDate.now(), null),
		new ArticleEntity(3, "Glow","Hoe",LocalDate.now(), null)
	);
	
	
	public static List<Integer> NUMBERS =  Arrays.asList(
		12, 3, 66, 55, 7, 18
	);
}
