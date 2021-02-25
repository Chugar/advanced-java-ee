package fr.training.dao.jpa;

import java.util.List;

import fr.training.dao.ArticleDao;
import fr.training.domain.ArticleEntity;

public class ArticleDaoJpaImpl extends DaoJpa implements ArticleDao {

	@Override
	public List<ArticleEntity> findAll() {
		return this.em.createQuery("select a from ArticleEntity a", ArticleEntity.class)
					.getResultList();
	}

	@Override
	public ArticleEntity findById(int id) {
		return this.em.find(ArticleEntity.class, id);
	}

	@Override
	public ArticleEntity add(ArticleEntity entity) {
		// update ?
		return null;
	}

	@Override
	public ArticleEntity save(ArticleEntity entity) {
		return this.em.merge(entity);
	}

	@Override
	public boolean deleteById(int id) {
		ArticleEntity entity = this.em.find(ArticleEntity.class, id);
		
		if(entity != null) {
			this.em.remove(entity);
			return true;
		}
		
		return false;
	}

}
