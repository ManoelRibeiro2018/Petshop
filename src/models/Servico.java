package models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Servico {

	
	private String nome;
	private BigDecimal preco;
	private Funcionario funcionario;
	private List<Atendimento> atendimentos = new ArrayList<>();
	
	public Servico(String nome, BigDecimal preco, Funcionario funcionario) {
		
		this.nome = nome;
		this.preco = preco;
		this.funcionario = funcionario;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}


	public List<Atendimento> getAtendimentos() {
		return atendimentos;
	}

	public void setAtendimentos(Atendimento atendimento) {
		this.atendimentos.add(atendimento);
	}
	
	
	
	
	
	
	
}
