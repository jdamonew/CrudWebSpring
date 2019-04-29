package com.jobia.prova.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobia.prova.model.Filme;
import com.jobia.prova.repositoty.FilmeRepository;


@Service
public class FilmeService {
	
	@Autowired
	private FilmeRepository repository;
	
	public List<Filme> findAll() {
		return repository.findAll();
	}
	
	public Filme findOne(Long id) {
		Filme filme = repository.findById(id).get();
		return filme;
	}
	
	public Filme save(Filme filme) {
		return repository.saveAndFlush(filme);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}

		
}
