package br.edu.univas.vo;

public class Cliente {

	private String nome;
	private String email;
	private String celular;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	@Override
	public String toString() {
		return "Nome: " + this.nome
				+ "\nE-mail: " + this.email
				+ "\nCelular: " + this.celular;
	}
}
