package com.br.robertosantin.festa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Convidado {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private Integer quantidadeAcompanhantes;

	public Convidado() {
	
	}
	
	public Convidado(int id, String nome, int qtdAcompanhates) {
		this.id = (long) id;
		this.nome = nome;
		this.quantidadeAcompanhantes = qtdAcompanhates;

	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public Integer getQuantidadeAcompanhantes() {
		return quantidadeAcompanhantes;
	}

}
