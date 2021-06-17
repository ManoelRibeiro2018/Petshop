package Context;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Database.PetShopDatabase;
import models.Veterinario;

public class VeterinarioDado  extends PetShopDatabase{
	private  PreparedStatement ps;
	public void CadastrarVeterinario(Veterinario veterinario) throws SQLException, Exception {
		String query = "INSERT INTO veterinario(crmv, matricula, nome, cpf, email, telefone, dataNascimento) ";
				query += "VALUES(?,?,?,?,?,?,?)";
				
		 ps = super.conectar().prepareStatement(query);
				 ps.setString(1, veterinario.getCrmv());
				 ps.setString(2, veterinario.getMatricula()); 
				 ps.setString(3, veterinario.getNome()); 
				 ps.setString(4, veterinario.getCpf()); 
				 ps.setString(5, veterinario.getEmail());
				 ps.setString(6, veterinario.getTelefone());
				 ps.setString(7, veterinario.getEmail());				 
	      ps.executeUpdate();
	      super.desconectar();		   	
	}
	
	public void DeletarVeterinario(Veterinario veterinario) throws SQLException, Exception {
		
		String query = "DELETE FROM veterinario WHERE id = ?";
		 ps = super.conectar().prepareStatement(query);
         ps.setString(1, veterinario.getMatricula()); 	
        
        ps.executeUpdate();
        super.desconectar();		
		
	}
	
	
	public void AtualizarVeterinario(Veterinario veterinario) throws SQLException, Exception {
		
		String query = "UPDATE veterinario SET  matricula = ? nome = ?, cpf = ?, email = ?, telefone = ?, dataNascimento= ?, crmv = ? WHERE id = ?";
		 ps = super.conectar().prepareStatement(query);
         ps.setString(1, veterinario.getMatricula()); 
		 ps.setString(2, veterinario.getNome()); 
		 ps.setString(3, veterinario.getCpf()); 
		 ps.setString(4, veterinario.getEmail());
		 ps.setString(5, veterinario.getTelefone());
		 ps.setString(6, veterinario.getEmail());
		 ps.setString(7, veterinario.getCrmv());
	     ps.setInt(8, veterinario.getID());
		 
        ps.executeUpdate();
        super.desconectar();		
		
	}
	
	
	  public ArrayList<Veterinario> listar(Veterinario veterinario) throws Exception {
	        ArrayList<Veterinario> retorno = new ArrayList();
	        String query = " select * ";
	        query = query + " from veterinario  ";
	        query = query + " where id > 0 ";
	        if (veterinario.getID() > 0) {
	        	query = query + " and id = ? ";
	        }

	        PreparedStatement preparedStatement = super.conectar().prepareStatement(query);
	        if (veterinario.getID() > 0) {
	            preparedStatement.setInt(1, veterinario.getID());
	        }

	        ResultSet leitor = preparedStatement.executeQuery();

	        while(leitor.next()) {
	        	Veterinario v = new Veterinario();
	            v.setID(leitor.getInt("id"));
	            v.setCrmv(leitor.getString("crmv"));
	            v.setMatricula(leitor.getString("matricula"));
	            v.setTelefone(leitor.getString("telefone"));
	            v.setNome(leitor.getString("nome"));
	            v.setEmail(leitor.getString("email"));
	            retorno.add(v);
	        }

	        super.desconectar();
	        return retorno;
	    }
}
