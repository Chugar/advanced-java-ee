package fr.training.dao;

import fr.training.dao.jpa.ArticleDaoJpaImpl;
import fr.training.dao.jpa.CategorieDaoJpaImpl;
import fr.training.dao.jpa.DresseurDaoJpaImpl;
import fr.training.dao.jpa.PokemonDaoJpaImpl;

public class DaoProvider {
	
	public static CategorieDaoJpaImpl getCategorieDao() {
		return new CategorieDaoJpaImpl();
	}
	
	public static ArticleDaoJpaImpl getArticleDao() {
		return new ArticleDaoJpaImpl();
	}
	
	public static DresseurDaoJpaImpl getDresseurDao() {
		return new DresseurDaoJpaImpl();
	}
	
	public static PokemonDaoJpaImpl getPokemonDao() {
		return new PokemonDaoJpaImpl();
	}
}
