package br.com.database.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tecnico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "id_trello")
	private Long idTrello;

	private String nome;

	public Tecnico() {
	}

	public Tecnico(Long idTrello, String nome) {
		this.idTrello = idTrello;
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public Long getIdTrello() {
		return idTrello;
	}

	public String getNome() {
		return nome;
	}

}
