package validations;

import Context.AtendimentoDado;
import models.Atendimento;

public class AtendimentoNegocio {
	public void inserirServico(Atendimento a) throws Exception {

		if (a == null) {
			throw new Exception("Insira os dados do servi�o");
		}

		if (a.getCliente() == null) {
			throw new Exception("O atendimento dever� est� atrelado a algum cliente");
		}
		if(a.getFuncionario() == null) {
			throw new Exception("O atendimento dever� est� atrelado a algum funcionario");
		}
		if (a.getDataDeAtendimento().toString() == "") {
			throw new Exception("Informe a data do atendimento");
		}
		if (a.getServicos() == null) {
			throw new Exception("O atendimento dever� conter a algum servi�o");
		}
		if (a.getValorTotal().signum() <= 0) {
			throw new Exception("Valor total inv�lido");
		}
		
		AtendimentoDado persistence = new AtendimentoDado();
		persistence.CadastrarAtendimento(a);
	
	}
}
