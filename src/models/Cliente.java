package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cliente extends Pessoa {

	private List<Pet> pets = new ArrayList<>();
	

	public Cliente(String nome, String cpf, String email, String telefone, Date dataNascimento) {
		super(nome, cpf, email, telefone, dataNascimento);
		// TODO Auto-generated constructor stub
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
		// TODO Auto-generated method stub
		this.email = email;
	}

	@Override
	public String getTelefone() {
		// TODO Auto-generated method stub
		return this.telefone;
	}

	@Override
	public void setTelefone(String telefone) {
		// TODO Auto-generated method stub
		this.telefone = telefone;
	}

	@Override
	public Date getDataDeNascimento() {
		// TODO Auto-generated method stub
		return this.dataNascimento;
	}

	@Override
	public void setDataDeNascimento(Date dateDeNascimento) {
		// TODO Auto-generated method stub
		this.dataNascimento = dataNascimento;
	}

	public List<Pet> getPets() {
		return pets;
	}

	public void adicionarPet(Pet pet) {
		this.pets.add(pet);
	}
	
}
