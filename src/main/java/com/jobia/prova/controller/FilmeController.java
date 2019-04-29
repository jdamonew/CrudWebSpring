package com.jobia.prova.controller;


import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jobia.prova.model.Filme;
import com.jobia.prova.service.FilmeService;


@Controller
public class FilmeController {
	
	@Autowired
	private FilmeService service;
	
	@GetMapping("/")
	public ModelAndView findAll() {
		
		ModelAndView mv = new ModelAndView("/post");
		mv.addObject("filmes", service.findAll());
		
		Filme filme = new Filme();
		mv.addObject("filme", filme);
		return mv;
	}
	
	@GetMapping("/add")
	public ModelAndView add(Filme filme) {
		
		ModelAndView mv = new ModelAndView("/CadastroFilme");
		mv.addObject("filme", filme);
		
		return mv;
	}
	
	@GetMapping("/edit/{id}")
	public ModelAndView edit(@PathVariable("id") Long id) {
		
		
		return add(service.findOne(id));
	}
	
	@GetMapping("/delete/{id}")
	public ModelAndView delete(@PathVariable("id") Long id) {
		
		service.delete(id);
		
		return findAll();
	}

	@PostMapping("/save")
	public ModelAndView save(@Valid Filme filme, BindingResult result) {
	
		if(result.hasErrors()) {
			System.out.println(result);
			return add(filme);
			
		}
		
		System.out.println(filme);
		service.save(filme);
		return findAll();
	}
}

