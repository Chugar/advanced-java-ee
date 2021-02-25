package fr.training.service;

import java.util.List;

import fr.training.dao.DaoProvider;
import fr.training.domain.ArticleEntity;

public class ArticleService implements IService<ArticleEntity> {

	@Override
	public List<ArticleEntity> findAll() {
		return DaoProvider.getArticleDao().findAll();
	}

	@Override
	public ArticleEntity findById(int id) {
		return DaoProvider.getArticleDao().findById(id);
	}

	@Override
	public ArticleEntity add(ArticleEntity entity) {
		return DaoProvider.getArticleDao().add(entity);
	}

	@Override
	public ArticleEntity save(ArticleEntity entity) {
		return DaoProvider.getArticleDao().save(entity);
	}

	@Override
	public boolean deleteById(int id) {
		return DaoProvider.getArticleDao().deleteById(id);
	}

}
