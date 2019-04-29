package com.jobia.prova.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Entity(name = "filme")
public class Filme implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, length = 50)
	@NotEmpty(message = "Nome é uma informação obrigatória.")
	private String nome;

	@Column(nullable = false, length = 15)
	@NotEmpty(message = "Genero é uma informação obrigatória.")
	private String genero;

	//@Max (5)
	@Column(nullable = false, length = 4)
	@NotEmpty(message = "Ano é uma informação obrigatória.")
	private String ano;

	@Column(nullable = false, length = 20)
	@NotEmpty(message = "Diretor é uma informação obrigatória.")
	private String diretor;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Filme [id=" + id + ", nome=" + nome + ", genero=" + genero + ", ano=" + ano + ", diretor=" + diretor
				+ "]";
	}

}
