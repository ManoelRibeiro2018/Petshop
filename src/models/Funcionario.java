package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Funcionario extends Pessoa {

	private String matricula;
	private List<Servico> servicos = new ArrayList<>();

	public Funcionario(String nome, String cpf, String email, String telefone, Date dataNascimento, String matricula) {

		super(nome, cpf, email, telefone, dataNascimento);
		this.matricula = matricula;
		
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return this.nome;
	}

	@Override
	public void setNome(String nome) {

		this.nome = nome;

	}

	@Override
	public String getCpf() {
		// TODO Auto-generated method stub
		return this.cpf;
	}

	@Override
	public void setCpf(String cpf) {

		this.cpf = cpf;

	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return this.email;
	}

	@Override
	public void setEmail(String email) {

		this.email = email;

	}

	@Override
	public String getTelefone() {
		// TODO Auto-generated method stub
		return this.telefone;
	}

	@Override
	public void setTelefone(String telefone) {

		this.telefone = telefone;

	}

	@Override
	public Date getDataDeNascimento() {
		// TODO Auto-generated method stub
		return this.dataNascimento;
	}

	@Override
	public void setDataDeNascimento(Date dateDeNascimento) {
		this.dataNascimento = dataNascimento;

	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public List<Servico> getServicos() {
		return servicos;
	}

	public void setServicos(Servico servico) {
		this.servicos.add(servico);
	}
	
	
	

}
