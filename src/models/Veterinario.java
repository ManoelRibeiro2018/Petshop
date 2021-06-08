package models;

import java.util.Date;
import java.util.List;

public class Veterinario extends Funcionario {

	
	private String crmv;
	
	
	public Veterinario(String nome, String cpf, String email, String telefone, Date dataNascimento, String matricula, String crmv) {
		super(nome, cpf, email, telefone, dataNascimento, matricula);
		this.crmv = crmv;
	}


	public String getCrmv() {
		return crmv;
	}


	public void setCrmv(String crmv) {
		this.crmv = crmv;
	}
	
	
	
	

	
}
