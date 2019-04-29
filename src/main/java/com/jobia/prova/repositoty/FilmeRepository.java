package com.jobia.prova.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jobia.prova.model.Filme;

	@Repository
	@Transactional
	public interface FilmeRepository extends JpaRepository<Filme, Long> {
			
	}
