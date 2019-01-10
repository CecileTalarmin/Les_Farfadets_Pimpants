package com.ensim.micropoo.vingtquatreheures.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ensim.micropoo.vingtquatreheures.model.Personne;

public class PersonneRepositoryImpl implements PersonneRepositoryCustom {

	@Autowired
	PersonneRepository personneRepository;
	
	@Override
	public List<Personne> findAllByName(String name) {
		List<Personne> liste = new ArrayList<>();
		return liste;
	}
		
}
