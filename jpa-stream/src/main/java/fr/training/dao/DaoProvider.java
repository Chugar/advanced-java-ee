package fr.training.dao;

import fr.training.dao.jpa.ArticleDaoJpaImpl;
import fr.training.dao.jpa.CategorieDaoJpaImpl;
import fr.training.dao.jpa.PokemonDaoJpaImpl;

public class DaoProvider {
	
	public static CategorieDaoJpaImpl getCategorieDao() {
		return new CategorieDaoJpaImpl();
	}
	
	public static ArticleDaoJpaImpl getArticleDao() {
		return new ArticleDaoJpaImpl();
	}
	
	
	public static PokemonDaoJpaImpl getPokemonDao() {
		return new PokemonDaoJpaImpl();
	}
}
