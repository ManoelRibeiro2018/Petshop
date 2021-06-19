/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author manoel.ribeiro.neto
 */
public class Atendimento {
    private int ID;
	private Cliente cliente;
	private Funcionario funcionario;
	private Date dataDeAtendimento;
	private List<Servico> servicos = new ArrayList<>();
	private BigDecimal valorTotal;
	
	public Atendimento() {}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Funcionario getFuncionario() {
		return funcionario;
	}


	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}


	

	public List<Servico> getServicos() {
		return servicos;
	}


	public void setServicos( Servico servico) {
		this.servicos.add(servico);
	}


	public BigDecimal getValorTotal() {
		return valorTotal;
	}


	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}


	public int getID() {
		return ID;
	}


	public void setID(int id) {
		this.ID = id;
	}
        
        public Date getDataDeAtendimento() {
		return dataDeAtendimento;
	}


	public void setDataDeAtendimento(Date data) {
		this.dataDeAtendimento = dataDeAtendimento;
	}

}
