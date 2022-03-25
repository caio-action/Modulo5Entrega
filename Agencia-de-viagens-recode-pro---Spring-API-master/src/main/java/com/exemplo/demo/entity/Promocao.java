package com.exemplo.demo.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "promocoes")
public class Promocao {
	
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long idPromocao;
	
	@Column(nullable = false)
	private String localPartida;
	
	@Column(nullable = false)
	private Double precoPromocao;
	
	private Integer tempoDeViagem;
	
	@Column(nullable = false)
	private String data;
	
	
	@ManyToOne
	@JoinColumn(name = "destino_id", nullable = false)
	private Destino destino;
	
	
	
	
	public Promocao() {
		
	}
	
	public Promocao(Long idPromocao, String localPartida, Double precoPromocao, Integer tempoDeViagem, String data,
			Destino destino) {
		this.idPromocao = idPromocao;
		this.localPartida = localPartida;
		this.precoPromocao = precoPromocao;
		this.tempoDeViagem = tempoDeViagem;
		this.data = data;
		this.destino = destino;
		
	}



	public Long getIdPromocao() {
		return idPromocao;
	}

	public void setIdPromocao(Long idPromocao) {
		this.idPromocao = idPromocao;
	}

	public String getLocalPartida() {
		return localPartida;
	}

	public void setLocalPartida(String localPartida) {
		this.localPartida = localPartida;
	}

	public Double getPrecoPromocao() {
		return precoPromocao;
	}

	public void setPrecoPromocao(Double precoPromocao) {
		this.precoPromocao = precoPromocao;
	}

	public Integer getTempoDeViagem() {
		return tempoDeViagem;
	}

	public void setTempoDeViagem(Integer tempoDeViagem) {
		this.tempoDeViagem = tempoDeViagem;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Destino getDestino() {
		return destino;
	}

	public void setDestino(Destino destino) {
		this.destino = destino;
	}

	


	
	@Override
	public String toString() {
		return "Promocao [idPromocao=" + idPromocao + ", localPartida=" + localPartida + ", precoPromocao="
				+ precoPromocao + ", tempoDeViagem=" + tempoDeViagem + ", data=" + data + ", destino=" + destino
				+ "]";
	}

	




	
	
	
}
