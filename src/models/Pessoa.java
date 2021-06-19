/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.Date;
/**
 *
 * @author manoel.ribeiro.neto
 */
public abstract class Pessoa {
    protected int ID;
	protected String nome;
	protected String cpf;
	protected String email;
	protected String telefone;
	protected Date dataNascimento;
	
	public abstract Integer getID();
	public abstract void setID(int id);
	
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
