package models;

public class Pet {

	private String nome;
	private String especie;
	private int idade;
	private String raca;
	private Cliente responsavel;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public Cliente getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(Cliente responsavel) {
		this.responsavel = responsavel;
	}
	
	
	
	
	
}
