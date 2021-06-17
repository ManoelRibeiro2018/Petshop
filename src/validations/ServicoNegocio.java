package validations;


import Context.ServicoDado;
import models.Servico;

public class ServicoNegocio {
	public void inserirServico(Servico s) throws Exception {

		if (s == null) {
			throw new Exception("Insira os dados do serviço");
		}

		if (s.getNome() == null) {
			throw new Exception("Informar o nome do serviço");
		}
		if (s.getNome().trim().equals("") == true) {
			throw new Exception("Informar o nome do serviço");
		}
		if (s.getNome().trim().length() > 100) {
			throw new Exception("O nome do serviço tem ter menos de 100 caracteres");
		}
		if (s.getNome().trim().length() < 4) {
			throw new Exception("O Nome do serviço não pode ter menos de 4 caracteres");
		}

		if (s.getFuncionario() == null) {
			throw new Exception("O serviço deverá está atrelado a algum funcionário");
		}
		if (s.getPreco().signum() <= 0) {
			throw new Exception("Preço total inválido");
		}
		
		ServicoDado persistence = new ServicoDado();
		persistence.CadastrarServico(s);
		

	}
	public void utualizarServico(Servico s) throws Exception {
		
		if (s == null) {
			throw new Exception("Insira os dados do serviço");
		}

		if (s.getNome() == null) {
			throw new Exception("Informar o nome do serviço");
		}
		if (s.getNome().trim().equals("") == true) {
			throw new Exception("Informar o nome do serviço");
		}
		if (s.getNome().trim().length() > 100) {
			throw new Exception("O nome do serviço tem ter menos de 100 caracteres");
		}
		if (s.getNome().trim().length() < 4) {
			throw new Exception("O Nome do serviço não pode ter menos de 4 caracteres");
		}

		if (s.getFuncionario() == null) {
			throw new Exception("O serviço deverá está atrelado a algum funcionário");
		}
		if (s.getPreco().signum() <= 0) {
			throw new Exception("Preço total inválido");
		}
		
		ServicoDado persistence = new ServicoDado();
		persistence.AtualizarServico(s);

	}

}
