package validations;

import Context.VeterinarioDado;
import models.Veterinario;

public class VeterinarioNegocio {
	 public void inserirVeterinario (Veterinario v) throws Exception {
		    
	        if (v == null  ) {
	            throw new Exception("Insira os dados do Veterinario");
	        }
	        
	        if (v.getNome() == null) {
	            throw new Exception("Informar o nome do Veterinario");
	        }
	        if (v.getNome().trim().equals("") == true) {
	            throw new Exception("Informar o nome do Veterinario");
	        }
	        if (v.getNome().trim().length() > 100) {
	            throw new Exception("O nome do Veterinario tem ter menos de 100 caracteres");
	        }
	        if (v.getNome().trim().length() < 5) {
	            throw new Exception("O Nome do Veterinario não pode ter menos de 5 caracteres");
	        }
	       
	        if (v.getCpf() == null) {
	            throw new Exception("Insira o CPF do Veterinario");
	        }
	        String cpfNew = v.getCpf().trim();
	        cpfNew = cpfNew.replace(" ", "");
	        cpfNew = cpfNew.replace("-", "");
	        if (v.getCpf().trim().equals("-   -   -") == true) {
	            throw new Exception("Insira o CPF do Veterinario");
	        }
	        if (v.getEmail() == null) {
	            throw new Exception("Informar o  e-mail do Veterinario");
	        }
	        if (v.getEmail().trim().length() < 5) {
	            throw new Exception("O e-mail do Veterinario não pode ter menos de 5 caracteres");
	        }
	        if (v.getEmail().trim().length() > 100) {
	            throw new Exception("O e-mail do Veterinario tem ter menos de 100 caracteres");
	        }
	        
	        if (v.getTelefone().trim().equals("") == true) {
	            throw new Exception("Informar o Numero do Veterinario");
	        }
	        if (v.getTelefone().trim().length() > 11) {
	            throw new Exception("O telefone do Veterinario não pode ter mais de 11 digitos");
	        }
	        if (v.getTelefone().trim().length() < 9) {
	            throw new Exception("O telefone do Veterinario não poder ter meno de 9 digitos");
	        }
	        if (v.getDataDeNascimento().toString() == "") {
				throw new Exception("Informe a data de nascimento");
			}
	        
	        if (v.getMatricula().trim().equals("") == true) {
	            throw new Exception("Informar a matrícula do Veterinario");
	        }
	        
	        if (v.getMatricula().trim().length() > 100) {
	            throw new Exception("O matrícula do Veterinario tem ter menos de 100 caracteres");
	        }	       
	        
	        
	        VeterinarioDado persistence = new VeterinarioDado();
	        persistence.CadastrarVeterinario(v);

	     }
	    
	    public void atualizarFuncionario(Veterinario v) throws Exception {
	    	  if (v == null  ) {
		            throw new Exception("Insira os dados do Veterinario");
		        }
		        
		        if (v.getNome() == null) {
		            throw new Exception("Informar o nome do Veterinario");
		        }
		        if (v.getNome().trim().equals("") == true) {
		            throw new Exception("Informar o nome do Veterinario");
		        }
		        if (v.getNome().trim().length() > 100) {
		            throw new Exception("O nome do Veterinario tem ter menos de 100 caracteres");
		        }
		        if (v.getNome().trim().length() < 5) {
		            throw new Exception("O Nome do Veterinario não pode ter menos de 5 caracteres");
		        }
		       
		        if (v.getCpf() == null) {
		            throw new Exception("Insira o CPF do Veterinario");
		        }
		        String cpfNew = v.getCpf().trim();
		        cpfNew = cpfNew.replace(" ", "");
		        cpfNew = cpfNew.replace("-", "");
		        if (v.getCpf().trim().equals("-   -   -") == true) {
		            throw new Exception("Insira o CPF do Veterinario");
		        }
		        if (v.getEmail() == null) {
		            throw new Exception("Informar o  e-mail do Veterinario");
		        }
		        if (v.getEmail().trim().length() < 5) {
		            throw new Exception("O e-mail do Veterinario não pode ter menos de 5 caracteres");
		        }
		        if (v.getEmail().trim().length() > 100) {
		            throw new Exception("O e-mail do Veterinario tem ter menos de 100 caracteres");
		        }
		        
		        if (v.getTelefone().trim().equals("") == true) {
		            throw new Exception("Informar o Numero do Veterinario");
		        }
		        if (v.getTelefone().trim().length() > 11) {
		            throw new Exception("O telefone do Veterinario não pode ter mais de 11 digitos");
		        }
		        if (v.getTelefone().trim().length() < 9) {
		            throw new Exception("O telefone do Veterinario não poder ter meno de 9 digitos");
		        }
		    	if (v.getDataDeNascimento().toString() == "") {
					throw new Exception("Informe a data de nascimento");
				}
		        
		        if (v.getMatricula().trim().equals("") == true) {
		            throw new Exception("Informar a matrícula do Veterinario");
		        }
		        
		        if (v.getMatricula().trim().length() > 100) {
		            throw new Exception("O matrícula do Veterinario tem ter menos de 100 caracteres");
		        }	        
		        VeterinarioDado persistence = new VeterinarioDado();
		        persistence.AtualizarVeterinario(v);;
	     
	    }
}
