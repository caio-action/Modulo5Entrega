package com.exemplo.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contatos")
public class Contato {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String email;
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private String assunto;
	@Column(nullable = false, length = 500)
	private String mensagem;

	public Contato() {

	}

	

	public Contato(String email, String nome, String assunto, String mensagem) {
		super();
		this.email = email;
		this.nome = nome;
		this.assunto = assunto;
		this.mensagem = mensagem;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getAssunto() {
		return assunto;
	}



	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}



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

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}



	@Override
	public String toString() {
		return "Contato [id=" + id + ", email=" + email + ", nome=" + nome + ", assunto=" + assunto + ", mensagem="
				+ mensagem + "]";
	}

	
}
