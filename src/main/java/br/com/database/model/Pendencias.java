package br.com.database.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Pendencias {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "data_inicio_pendencia")
	private LocalDateTime dataInicioPendencia;

	@Column(name = "data_fim_pendencia")
	private LocalDateTime dataFimPendencia;

	private String descricao;

	@ManyToOne
	private OrdemServico ordemServico;

	public Pendencias() {

	}

	public Pendencias(LocalDateTime dataInicioPendencia, String descricao, OrdemServico ordemServico) {
		this.dataInicioPendencia = dataInicioPendencia;
		this.descricao = descricao;
		this.ordemServico = ordemServico;
	}

	public LocalDateTime getDataFimPendencia() {
		return dataFimPendencia;
	}

	public void setDataFimPendencia(LocalDateTime dataFimPendencia) {
		this.dataFimPendencia = dataFimPendencia;
	}

	public Long getId() {
		return id;
	}

	public LocalDateTime getDataInicioPendencia() {
		return dataInicioPendencia;
	}

	public String getDescricao() {
		return descricao;
	}

	public OrdemServico getOrdemServico() {
		return ordemServico;
	}

}
