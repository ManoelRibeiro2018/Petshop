/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validations;

import Context.AtendimentoDado;
import Models.Atendimento;

/**
 *
 * @author manoel.ribeiro.neto
 */
public class AtendimentoNegocio {
    public void inserirAtendimento(Atendimento a) throws Exception {

		if (a == null) {
			throw new Exception("Insira os dados do atendimento");
		}

		if (a.getCliente() == null) {
			throw new Exception("O atendimento deverá está atrelado a algum cliente");
		}
		if(a.getFuncionario() == null) {
			throw new Exception("O atendimento deverá está atrelado a algum funcionario");
		}
		if (a.getDataDeAtendimento().toString() == "") {
			throw new Exception("Informe a data do atendimento");
		}
		if (a.getServicos() == null) {
			throw new Exception("O atendimento deverá conter a algum serviço");
		}
		if (a.getValorTotal().signum() <= 0) {
			throw new Exception("Valor total inválido");
		}
		
		AtendimentoDado persistence = new AtendimentoDado();
		persistence.CadastrarAtendimento(a);
	
	}
    
       public void atualzarAtendimento(Atendimento a) throws Exception {

		if (a == null) {
			throw new Exception("Insira os dados do atendimento");
		}

		if (a.getCliente() == null) {
			throw new Exception("O atendimento deverá está atrelado a algum cliente");
		}
		if(a.getFuncionario() == null) {
			throw new Exception("O atendimento deverá está atrelado a algum funcionario");
		}
		if (a.getDataDeAtendimento().toString() == "") {
			throw new Exception("Informe a data do atendimento");
		}
		if (a.getServicos() == null) {
			throw new Exception("O atendimento deverá conter a algum serviço");
		}
		if (a.getValorTotal().signum() <= 0) {
			throw new Exception("Valor total inválido");
		}
		
		AtendimentoDado persistence = new AtendimentoDado();
		persistence.CadastrarAtendimento(a);
	
	}
         public void removerAtendimento(Atendimento a) throws Exception {
                if (a == null) {
                   throw new Exception("Selecione um atendimento para remover");
		}
                AtendimentoDado persistence = new AtendimentoDado();
		persistence.DeletarAtendimento(a);
         }
}
