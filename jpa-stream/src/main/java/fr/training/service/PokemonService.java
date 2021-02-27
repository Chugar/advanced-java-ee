package fr.training.service;

import java.time.DayOfWeek;
import java.util.List;

import fr.training.dao.DaoProvider;
import fr.training.dao.jpa.DaoJpa;
import fr.training.domain.PokemonEntity;

public class PokemonService implements IService<PokemonEntity> {

	@Override
	public List<PokemonEntity> findAll() {
		return DaoProvider.getPokemonDao().findAll();
	}

	@Override
	public PokemonEntity findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PokemonEntity add(PokemonEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PokemonEntity save(PokemonEntity entity) {
		return DaoProvider.getPokemonDao().save(entity);
	}

	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
