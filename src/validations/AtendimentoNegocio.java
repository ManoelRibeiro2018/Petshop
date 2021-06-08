package validations;

import models.Atendimento;

public class AtendimentoNegocio {
	public void inserirServico(Atendimento a) throws Exception {

		if (a == null) {
			throw new Exception("Insira os dados do serviço");
		}

		if (a.getCliente() == null) {
			throw new Exception("O atendimento deverá está atrelado a algum cliente");
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

	
	}
}
