package br.com.database.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ordem_servico")
public class OrdemServico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "id_trello")
	private Long idTrello;

	private String nome;

	@Column(name = "data_criacao")
	private LocalDateTime dataCriacao;

	@Column(name = "data_inicio_servico")
	private LocalDateTime dataInicioServico;

	@Column(name = "data_conclusao_servico")
	private LocalDateTime dataConclusaoServico;

	@Enumerated(EnumType.STRING)
	private StatusOrdem status;

	private Integer idCampus;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "ordem_servico_etiqueta")
	private List<Etiqueta> etiquetas = new ArrayList<Etiqueta>();
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "ordem_servico_tecnico")
	private List<Tecnico> tecnicos = new ArrayList<Tecnico>();

	public OrdemServico() {
		// TODO Auto-generated constructor stub
	}

	public OrdemServico(Long idTrello, String nome, Integer idCampus, LocalDateTime dataCriacao) {
		this.idTrello = idTrello;
		this.nome = nome;
		this.idCampus = idCampus;
		this.dataCriacao = dataCriacao;
		this.status = StatusOrdem.ATIVA;
	}
	
	public void adicionaEtiqueta(Etiqueta etiqueta) {
		this.etiquetas.add(etiqueta);
	}

	public void setDataInicioServico(LocalDateTime dataInicioServico) {
		this.dataInicioServico = dataInicioServico;
	}

	public void setDataConclusaoServico(LocalDateTime dataConclusaoServico) {
		this.dataConclusaoServico = dataConclusaoServico;
	}

	public void setStatus(StatusOrdem status) {
		this.status = status;
	}

	public Long getIdTrello() {
		return idTrello;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public LocalDateTime getDataInicioServico() {
		return dataInicioServico;
	}

	public LocalDateTime getDataConclusaoServico() {
		return dataConclusaoServico;
	}

	public StatusOrdem getStatus() {
		return status;
	}

	public Integer getIdCampus() {
		return idCampus;
	}

}
