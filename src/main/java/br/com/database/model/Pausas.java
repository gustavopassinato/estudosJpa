package br.com.database.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Pausas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "data_inicio_pausa")
	private LocalDateTime dataInicioPausa;

	@Column(name = "data_fim_pausa")
	private LocalDateTime dataFimPausa;

	@ManyToOne
	private OrdemServico ordemServico;

	public Pausas() {
		// TODO Auto-generated constructor stub
	}

	public Pausas(LocalDateTime dataInicioPausa, OrdemServico ordemServico) {
		this.dataInicioPausa = dataInicioPausa;
		this.ordemServico = ordemServico;
	}

	public LocalDateTime getDataFimPausa() {
		return dataFimPausa;
	}

	public void setDataFimPausa(LocalDateTime dataFimPausa) {
		this.dataFimPausa = dataFimPausa;
	}

	public Long getId() {
		return id;
	}

	public LocalDateTime getDataInicioPausa() {
		return dataInicioPausa;
	}

	public OrdemServico getOrdemServico() {
		return ordemServico;
	}

}
