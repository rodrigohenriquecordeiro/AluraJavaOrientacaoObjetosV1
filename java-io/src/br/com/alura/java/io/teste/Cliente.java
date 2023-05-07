package br.com.alura.java.io.teste;

import java.io.Serializable;

/**
 * Classe que representa um cliente ByteBank
 * 
 * @author Rodrigo H. Cordeiro
 * @version 1.0 
 */

public class Cliente implements Serializable{

	private String nome;
	private String cpf;
	private String profissao;

	private static final long serialVersionUID = 1L;
    
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

}
