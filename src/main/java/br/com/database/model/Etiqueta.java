package br.com.database.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Etiqueta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Long idTrello;

	private String nome;

	private String corEtiqueta;

	private int tipo;

	public Etiqueta() {

	}

	public Etiqueta(String nome, String corEtiqueta, int tipo, Long idTrello) {
		this.idTrello = idTrello;
		this.nome = nome;
		this.corEtiqueta = corEtiqueta;
		this.tipo = tipo;
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

	public String getCorEtiqueta() {
		return corEtiqueta;
	}

	public int getTipo() {
		return tipo;
	}

}
