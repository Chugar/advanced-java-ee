package fr.training.service;

import java.util.List;

import fr.training.dao.DaoProvider;
import fr.training.domain.DresseurEntity;

public class DresseurService implements IService<DresseurEntity> {

	@Override
	public List<DresseurEntity> findAll() {
		return DaoProvider.getDresseurDao().findAll();
	}

	@Override
	public DresseurEntity findById(int id) {
		return DaoProvider.getDresseurDao().findById(id);
	}

	@Override
	public DresseurEntity add(DresseurEntity entity) {
		return DaoProvider.getDresseurDao().add(entity);
	}

	@Override
	public DresseurEntity save(DresseurEntity entity) {
		return DaoProvider.getDresseurDao().save(entity);
	}

	@Override
	public boolean deleteById(int id) {
		return DaoProvider.getDresseurDao().deleteById(id);
	}

}
