package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cliente extends Pessoa {

	private List<Pet> pets = new ArrayList<>();
	

	public Cliente() {}

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
		return this.email;
	}

	@Override
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String getTelefone() {
		return this.telefone;
	}

	@Override
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public Date getDataDeNascimento() {
		return this.dataNascimento;
	}

	@Override
	public void setDataDeNascimento(Date dateDeNascimento) {
		// TODO Auto-generated method stub
		this.dataNascimento = dateDeNascimento;
	}

	public List<Pet> getPets() {
		return pets;
	}

	public void adicionarPet(Pet pet) {
		this.pets.add(pet);
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
