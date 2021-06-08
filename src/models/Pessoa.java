package models;

import java.util.Date;

public abstract class Pessoa {
	
	protected String nome;
	protected String cpf;
	protected String email;
	protected String telefone;
	protected Date dataNascimento;
	
	
	public Pessoa(String nome, String cpf, String email, String telefone, Date dataNascimento) {
		
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.dataNascimento = dataNascimento;
	}


	public abstract String getNome();
	
	public abstract void setNome(String nome);
	
	
	public abstract String getCpf();
	public abstract void setCpf(String cpf);
	
	
	public abstract String getEmail();
	
	public abstract void setEmail(String email);

	public abstract String getTelefone();
	
	public abstract void setTelefone(String telefone);
	
	public abstract Date getDataDeNascimento();
	
	public abstract void setDataDeNascimento(Date dateDeNascimento);
	




	
	
	
	
}
