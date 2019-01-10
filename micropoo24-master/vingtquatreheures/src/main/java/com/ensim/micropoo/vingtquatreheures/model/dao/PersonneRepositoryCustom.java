package com.ensim.micropoo.vingtquatreheures.model.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ensim.micropoo.vingtquatreheures.model.Personne;

public interface PersonneRepositoryCustom {
	
	List<Personne> findAllByName(String name);
}
