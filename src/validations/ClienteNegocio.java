package validations;

import Context.ClienteDado;
import models.Cliente;

public class ClienteNegocio {

	public void inserirCliente(Cliente c) throws Exception {
		if (c == null) {
			throw new Exception("Insira os dados do Cliente");
		}
		if (c.getNome() == null) {
			throw new Exception("Informar o nome do Cliente");
		}
		if (c.getNome().trim().equals("") == true) {
			throw new Exception("Informar o nome do Cliente");
		}
		if (c.getNome().trim().length() > 100) {
			throw new Exception("O nome do Cliente deverá ter menos de 100 caracteres");
		}
		if (c.getNome().trim().length() < 4) {
			throw new Exception("O nome do Cliente deverá ter mais de 4 caracteres");
		}

		if (c.getCpf() == null) {
			throw new Exception("Insira o CPF do Cliente");
		}
		String cpfNew = c.getCpf().trim();
		cpfNew = cpfNew.replace(" ", "");
		cpfNew = cpfNew.replace("-", "");
		if (c.getCpf().trim().equals("-   -   -") == true) {
			throw new Exception("Insira o CPF do Cliente");
		}
		if (c.getEmail() == null) {
			throw new Exception("Informar o e-mail ");
		}
		if (c.getEmail().trim().length() < 5) {
			throw new Exception("O e-mail não pode ter menos de 5 caracteres");
		}
		if (c.getEmail().trim().length() > 100) {
			throw new Exception("O e-mail tem ter menos de 100 caracteres");
		}

		if (c.getTelefone().trim().equals("") == true) {
			throw new Exception("Informar o telefone");
		}
		if (c.getTelefone().trim().length() > 11) {
			throw new Exception("O telefone  não pode ter mais de 11 digitos");
		}
		if (c.getTelefone().trim().length() < 9) {
			throw new Exception("O telefone  não poder ter meno de 9 digitos");
		}
		if (c.getDataDeNascimento().toString() == "") {
			throw new Exception("Informe a data de nascimento");
		}		
		
		ClienteDado persistence = new ClienteDado();
		persistence.CadastrarCliente(c);
		
	}

	public void atualizarCliente(Cliente c) throws Exception {

		if (c == null) {
			throw new Exception("Insira os dados do Cliente");
		}
		if (c.getNome() == null) {
			throw new Exception("Informar o nome do Cliente");
		}
		if (c.getNome().trim().equals("") == true) {
			throw new Exception("Informar o nome do Cliente");
		}
		if (c.getNome().trim().length() > 100) {
			throw new Exception("O nome do Cliente deverá ter menos de 100 caracteres");
		}
		if (c.getNome().trim().length() < 4) {
			throw new Exception("O nome do Cliente deverá ter mais de 4 caracteres");
		}

		if (c.getCpf() == null) {
			throw new Exception("Insira o CPF do Cliente");
		}
		String cpfNew = c.getCpf().trim();
		cpfNew = cpfNew.replace(" ", "");
		cpfNew = cpfNew.replace("-", "");
		if (c.getCpf().trim().equals("-   -   -") == true) {
			throw new Exception("Insira o CPF do Cliente");
		}
		if (c.getEmail() == null) {
			throw new Exception("Informar o e-mail ");
		}
		if (c.getEmail().trim().length() < 5) {
			throw new Exception("O e-mail não pode ter menos de 5 caracteres");
		}
		if (c.getEmail().trim().length() > 100) {
			throw new Exception("O e-mail tem ter menos de 100 caracteres");
		}

		if (c.getTelefone().trim().equals("") == true) {
			throw new Exception("Informar o telefone");
		}
		if (c.getTelefone().trim().length() > 11) {
			throw new Exception("O telefone  não pode ter mais de 11 digitos");
		}
		if (c.getTelefone().trim().length() < 9) {
			throw new Exception("O telefone  não poder ter meno de 9 digitos");
		}
		if (c.getDataDeNascimento().toString() == "") {
			throw new Exception("Informe a data de nascimento");
		}
		
		ClienteDado persistence = new ClienteDado();
		persistence.AtualizarCliente(c);

	}

}
