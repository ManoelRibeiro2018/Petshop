package validations;

import Context.ClienteDado;
import Context.FuncionarioDado;
import models.Funcionario;

public class FuncionarioNegocio {
	 public void inserirFuncionario (Funcionario f) throws Exception {
		    
	        if (f == null  ) {
	            throw new Exception("Insira os dados do funcionario");
	        }
	        
	        if (f.getNome() == null) {
	            throw new Exception("Informar o nome do funcionario");
	        }
	        if (f.getNome().trim().equals("") == true) {
	            throw new Exception("Informar o nome do funcionario");
	        }
	        if (f.getNome().trim().length() > 100) {
	            throw new Exception("O nome do funcinario tem ter menos de 100 caracteres");
	        }
	        if (f.getNome().trim().length() < 5) {
	            throw new Exception("O Nome do Funcionario n�o pode ter menos de 5 caracteres");
	        }
	       
	        if (f.getCpf() == null) {
	            throw new Exception("Insira o CPF do Funcionario");
	        }
	        String cpfNew = f.getCpf().trim();
	        cpfNew = cpfNew.replace(" ", "");
	        cpfNew = cpfNew.replace("-", "");
	        if (f.getCpf().trim().equals("-   -   -") == true) {
	            throw new Exception("Insira o CPF do Funcionario");
	        }
	        if (f.getEmail() == null) {
	            throw new Exception("Informar o  e-mail do funcionario");
	        }
	        if (f.getEmail().trim().length() < 5) {
	            throw new Exception("O e-mail do Funcionario n�o pode ter menos de 5 caracteres");
	        }
	        if (f.getEmail().trim().length() > 100) {
	            throw new Exception("O e-mail do funcinario tem ter menos de 100 caracteres");
	        }
	        
	        if (f.getTelefone().trim().equals("") == true) {
	            throw new Exception("Informar o Numero do funcion�rio");
	        }
	        if (f.getTelefone().trim().length() > 11) {
	            throw new Exception("O telefone do funcion�rio n�o pode ter mais de 11 digitos");
	        }
	        if (f.getTelefone().trim().length() < 9) {
	            throw new Exception("O telefone do funcion�rio n�o poder ter meno de 9 digitos");
	        }
	        if (f.getDataDeNascimento().toString() == "") {
				throw new Exception("Informe a data de nascimento");
			}
	        
	        if (f.getMatricula().trim().equals("") == true) {
	            throw new Exception("Informar a matr�cula do funcion�rio");
	        }
	        
	        if (f.getMatricula().trim().length() > 100) {
	            throw new Exception("O matr�cula do funcinario tem ter menos de 100 caracteres");
	        }	        
	        
	       
	        FuncionarioDado percistence = new FuncionarioDado();
	        percistence.Cadastrarfuncionario(f);
	  
	     }
	    
	    public void atualizarFuncionario(Funcionario f) throws Exception {
	    	  if (f == null  ) {
		            throw new Exception("Insira os dados do funcionario");
		        }
		        
		        if (f.getNome() == null) {
		            throw new Exception("Informar o nome do funcionario");
		        }
		        if (f.getNome().trim().equals("") == true) {
		            throw new Exception("Informar o nome do funcionario");
		        }
		        if (f.getNome().trim().length() > 100) {
		            throw new Exception("O nome do funcinario tem ter menos de 100 caracteres");
		        }
		        if (f.getNome().trim().length() < 5) {
		            throw new Exception("O Nome do Funcionario n�o pode ter menos de 5 caracteres");
		        }
		       
		        if (f.getCpf() == null) {
		            throw new Exception("Insira o CPF do Funcionario");
		        }
		        String cpfNew = f.getCpf().trim();
		        cpfNew = cpfNew.replace(" ", "");
		        cpfNew = cpfNew.replace("-", "");
		        if (f.getCpf().trim().equals("-   -   -") == true) {
		            throw new Exception("Insira o CPF do Funcionario");
		        }
		        if (f.getEmail() == null) {
		            throw new Exception("Informar o  e-mail do funcionario");
		        }
		        if (f.getEmail().trim().length() < 5) {
		            throw new Exception("O e-mail do Funcionario n�o pode ter menos de 5 caracteres");
		        }
		        if (f.getEmail().trim().length() > 100) {
		            throw new Exception("O e-mail do funcinario tem ter menos de 100 caracteres");
		        }
		        
		        if (f.getTelefone().trim().equals("") == true) {
		            throw new Exception("Informar o Numero do funcion�rio");
		        }
		        if (f.getTelefone().trim().length() > 11) {
		            throw new Exception("O telefone do funcion�rio n�o pode ter mais de 11 digitos");
		        }
		        if (f.getTelefone().trim().length() < 9) {
		            throw new Exception("O telefone do funcion�rio n�o poder ter meno de 9 digitos");
		        }
		    	if (f.getDataDeNascimento().toString() == "") {
					throw new Exception("Informe a data de nascimento");
				}
		        
		        if (f.getMatricula().trim().equals("") == true) {
		            throw new Exception("Informar a matr�cula do funcion�rio");
		        }
		        
		        if (f.getMatricula().trim().length() > 100) {
		            throw new Exception("O matr�cula do funcinario tem ter menos de 100 caracteres");
		        }	      
		        
		        FuncionarioDado percistence = new FuncionarioDado();
		        percistence.Atualizarfuncionario(f);
	     
	    }
}
