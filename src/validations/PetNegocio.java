package validations;

import models.Pet;

public class PetNegocio {
	 public void inserirPet(Pet p) throws Exception {
		    
		        if (p == null  ) {
		            throw new Exception("Insira os dados do pet");
		        }
		        
		        if (p.getNome() == null) {
		            throw new Exception("Informar o nome do pet");
		        }
		        if (p.getNome().trim().equals("") == true) {
		            throw new Exception("Informar o nome do pet");
		        }
		        if (p.getNome().trim().length() > 100) {
		            throw new Exception("O nome do pet tem ter menos de 100 caracteres");
		        }
		        if (p.getNome().trim().length() < 3) {
		            throw new Exception("O Nome do pet n�o pode ter menos de 3 caracteres");
		        }
		        if (p.getEspecie() == null) {
		            throw new Exception("Insira a especie do pet");
		        }     
		        if (p.getEspecie().trim().equals("") == true) {
		            throw new Exception("Insira a especie do pet");
		        }
		        if (p.getEspecie().trim().length() > 20) {
		            throw new Exception("A Especie do pet n�o pode ter mais de 20 caracteres");
		        }
		        if (p.getEspecie().trim().length() < 4) {
		            throw new Exception("A Especie do pet n�o pode ter menos de 4 digitos");
		        }
		        if(p.getIdade() < 0) {
		            throw new Exception("Infome corretamente a idade do pet");
		        }		        
		        if (p.getRaca() == null) {
		            throw new Exception("Informar o nome do pet");
		        }
		        if (p.getRaca().trim().equals("") == true) {
		            throw new Exception("Informar o nome do pet");
		        }
		        if (p.getRaca().trim().length() > 100) {
		            throw new Exception("O ra�a do pet deve ter menos de 100 caracteres");
		        }
		        if (p.getRaca().trim().length() < 5) {
		            throw new Exception("O ra�a do pet n�o pode ter menos de 4 caracteres");
		        }
		        if(p.getResponsavel() == null) {
		            throw new Exception("O pet dever� ter um respons�vel");
		        }
		        
		       
		      	        
	   }
	    
	    public void atualizarPet(Pet p) throws Exception {
	        
	    	 if (p == null  ) {
		            throw new Exception("Insira os dados do pet");
		        }
		        
		        if (p.getNome() == null) {
		            throw new Exception("Informar o nome do funcionario");
		        }
		        if (p.getNome().trim().equals("") == true) {
		            throw new Exception("Informar o nome do funcionario");
		        }
		        if (p.getNome().trim().length() > 100) {
		            throw new Exception("O nome do pet tem ter menos de 100 caracteres");
		        }
		        if (p.getNome().trim().length() < 3) {
		            throw new Exception("O Nome do pet n�o pode ter menos de 3 caracteres");
		        }
		        if (p.getEspecie() == null) {
		            throw new Exception("Insira a especie do pet");
		        }     
		        if (p.getEspecie().trim().equals("") == true) {
		            throw new Exception("Insira a especie do pet");
		        }
		        if (p.getEspecie().trim().length() > 20) {
		            throw new Exception("A Especie do pet n�o pode ter mais de 20 caracteres");
		        }
		        if (p.getEspecie().trim().length() < 4) {
		            throw new Exception("A Especie do pet n�o pode ter menos de 4 digitos");
		        }
		        if(p.getIdade() < 0) {
		            throw new Exception("Infome corretamente a idade do pet");
		        }		        
		        if (p.getRaca() == null) {
		            throw new Exception("Informar o nome do pet");
		        }
		        if (p.getRaca().trim().equals("") == true) {
		            throw new Exception("Informar o nome do pet");
		        }
		        if (p.getRaca().trim().length() > 100) {
		            throw new Exception("O ra�a do pet deve ter menos de 100 caracteres");
		        }
		        if (p.getRaca().trim().length() < 3) {
		            throw new Exception("O ra�a do pet n�o pode ter menos de 3 caracteres");
		        }
		        if(p.getResponsavel() == null) {
		            throw new Exception("O pet dever� ter um respons�vel");
		        }
	    }
}
