package com.exemplo.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "destinos")
public class Destino {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDestino;
	
	@Column(nullable = false)
	private String nomeDestino;
	
	
	private String foto;
	
	private String descricao;
	
	@JsonIgnore
	@OneToMany(mappedBy = "destino", cascade = CascadeType.ALL)
	private List<Promocao> promocoes;
	
	
	
	public Destino() {
		
	}

	public Destino(String nomeDestino, String foto, String descricao, List<Promocao> promocoes) {
		this.nomeDestino = nomeDestino;
		this.foto = foto;
		this.descricao = descricao;
		this.promocoes = promocoes;
	}



	public Long getIdDestino() {
		return idDestino;
	}


	public void setIdDestino(Long idDestino) {
		this.idDestino = idDestino;
	}


	public String getNomeDestino() {
		return nomeDestino;
	}


	public void setNomeDestino(String nomeDestino) {
		this.nomeDestino = nomeDestino;
	}


	public String getFoto() {
		return foto;
	}


	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Promocao> getPromocoes() {
		return promocoes;
	}


	public void setPromocoes(List<Promocao> promocoes) {
		this.promocoes = promocoes;
	}

	@Override
	public String toString() {
		return "Destino [idDestino=" + idDestino + ", nomeDestino=" + nomeDestino + ", foto=" + foto + ", descricao="
				+ descricao + ", promocoes=" + promocoes + "]";
	}

	

	

	
	/*
	@PreRemove
	public void beforeRemovingDestino() {
		for (Cliente cliente : clientes) {
			cliente.setDestino(null);
		}
	}*/
	
	
}
