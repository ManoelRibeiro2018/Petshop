package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Funcionario extends Pessoa {

	private String matricula;
	private List<Servico> servicos = new ArrayList<>();

	public Funcionario() {	}

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
		this.dataNascimento = dateDeNascimento;

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

	@Override
	public Integer getID() {
		return this.ID;
	}

	@Override
	public void setID(int id) {
		this.ID = id;
	}
	
	
	

}
