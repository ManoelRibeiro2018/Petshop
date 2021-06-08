package validations;


import models.Servico;

public class ServicoNegocio {
	public void inserirServico(Servico s) throws Exception {

		if (s == null) {
			throw new Exception("Insira os dados do servi�o");
		}

		if (s.getNome() == null) {
			throw new Exception("Informar o nome do servi�o");
		}
		if (s.getNome().trim().equals("") == true) {
			throw new Exception("Informar o nome do servi�o");
		}
		if (s.getNome().trim().length() > 100) {
			throw new Exception("O nome do servi�o tem ter menos de 100 caracteres");
		}
		if (s.getNome().trim().length() < 4) {
			throw new Exception("O Nome do servi�o n�o pode ter menos de 4 caracteres");
		}

		if (s.getFuncionario() == null) {
			throw new Exception("O servi�o dever� est� atrelado a algum funcion�rio");
		}
		if (s.getPreco().signum() <= 0) {
			throw new Exception("Pre�o total inv�lido");
		}
		

	}
	public void utualizarServico(Servico s) throws Exception {
		
		if (s == null) {
			throw new Exception("Insira os dados do servi�o");
		}

		if (s.getNome() == null) {
			throw new Exception("Informar o nome do servi�o");
		}
		if (s.getNome().trim().equals("") == true) {
			throw new Exception("Informar o nome do servi�o");
		}
		if (s.getNome().trim().length() > 100) {
			throw new Exception("O nome do servi�o tem ter menos de 100 caracteres");
		}
		if (s.getNome().trim().length() < 4) {
			throw new Exception("O Nome do servi�o n�o pode ter menos de 4 caracteres");
		}

		if (s.getFuncionario() == null) {
			throw new Exception("O servi�o dever� est� atrelado a algum funcion�rio");
		}
		if (s.getPreco().signum() <= 0) {
			throw new Exception("Pre�o total inv�lido");
		}

	}

}
