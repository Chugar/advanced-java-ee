package fr.training.service;

import java.util.List;

import fr.training.dao.DaoProvider;
import fr.training.domain.CategorieEntity;

public class CategorieService implements IService<CategorieEntity> {

	@Override
	public List<CategorieEntity> findAll() {
		return DaoProvider.getCategorieDao().findAll();
	}

	@Override
	public CategorieEntity findById(int id) {
		return DaoProvider.getCategorieDao().findById(id);
	}

	@Override
	public CategorieEntity add(CategorieEntity entity) {
		return DaoProvider.getCategorieDao().add(entity);
	}

	@Override
	public CategorieEntity save(CategorieEntity entity) {
		return DaoProvider.getCategorieDao().save(entity);
	}

	@Override
	public boolean deleteById(int id) {
		return DaoProvider.getCategorieDao().deleteById(id);
	}

}
