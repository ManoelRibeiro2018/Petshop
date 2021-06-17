package Context;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Database.PetShopDatabase;
import models.Funcionario;

public class FuncionarioDado extends PetShopDatabase {

	private  PreparedStatement ps;
	public void Cadastrarfuncionario(Funcionario funcionario) throws SQLException, Exception {
		String query = "INSERT INTO funcionario(matricula, nome, cpf, email, telefone, dataNascimento) ";
				query += "VALUES(?,?,?,?,?,?)";
				
		 ps = super.conectar().prepareStatement(query);
		 ps.setString(1, funcionario.getMatricula()); 
		 ps.setString(2, funcionario.getNome()); 
		 ps.setString(3, funcionario.getCpf()); 
		 ps.setString(4, funcionario.getEmail());
		 ps.setString(5, funcionario.getTelefone());
		 ps.setString(6, funcionario.getEmail());
		 
	        ps.executeUpdate();
	        super.desconectar();		   	
	}
	
	public void Deletarfuncionario(Funcionario funcionario) throws SQLException, Exception {
		
		String query = "DELETE FROM funcionario WHERE id = ?";
		 ps = super.conectar().prepareStatement(query);
         ps.setString(1, funcionario.getMatricula()); 
		
        
        ps.executeUpdate();
        super.desconectar();		
		
	}
	
	
	public void Atualizarfuncionario(Funcionario funcionario) throws SQLException, Exception {
		
		String query = "UPDATE funcionario SET matricula = ? nome = ?, cpf = ?, email = ?, telefone = ?, dataNascimento= ? WHERE id = ?";
		 ps = super.conectar().prepareStatement(query);
         ps.setString(1, funcionario.getMatricula()); 
		 ps.setString(2, funcionario.getNome()); 
		 ps.setString(3, funcionario.getCpf()); 
		 ps.setString(4, funcionario.getEmail());
		 ps.setString(5, funcionario.getTelefone());
		 ps.setString(6, funcionario.getEmail());
	     ps.setInt(7, funcionario.getID());
		 
        ps.executeUpdate();
        super.desconectar();		
		
	}
	
	
	  public ArrayList<Funcionario> listar(Funcionario funcionario) throws Exception {
	        ArrayList<Funcionario> retorno = new ArrayList();
	        String query = " select * ";
	        query = query + " from funcionario  ";
	        query = query + " where id > 0 ";
	        if (funcionario.getID() > 0) {
	        	query = query + " and id = ? ";
	        }

	        PreparedStatement preparedStatement = super.conectar().prepareStatement(query);
	        if (funcionario.getID() > 0) {
	            preparedStatement.setInt(1, funcionario.getID());
	        }

	        ResultSet leitor = preparedStatement.executeQuery();

	        while(leitor.next()) {
	        	Funcionario f = new Funcionario();
	            f.setID(leitor.getInt("id"));
	            f.setMatricula(leitor.getString("matricula"));
	            f.setTelefone(leitor.getString("telefone"));
	            f.setNome(leitor.getString("nome"));
	            f.setEmail(leitor.getString("email"));
	            retorno.add(f);
	        }

	        super.desconectar();
	        return retorno;
	    }
	
	
}
