package Context;

import Database.PetShopDatabase;
import models.Cliente;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class ClienteDado extends PetShopDatabase {
	private  PreparedStatement ps;
	public void CadastrarCliente(Cliente cliente) throws SQLException, Exception {
		String query = "INSERT INTO CLIENTE(nome, cpf, email, telefone) ";
				query += "VALUES(?,?,?,?,?)";
				
		 ps = super.conectar().prepareStatement(query);
		 ps.setString(1, cliente.getNome()); 
		 ps.setString(2, cliente.getCpf()); 
		 ps.setString(3, cliente.getEmail());
		 ps.setString(4, cliente.getTelefone());
		 ps.setString(5, cliente.getEmail());
		 
	        ps.executeUpdate();
	        super.desconectar();		   	
	}
	
	public void DeletarCliente(Cliente cliente) throws SQLException, Exception {
		
		String query = "DELETE FROM cliente WHERE id = ?";
		ps = super.conectar().prepareStatement(query);
        ps.setInt(1, cliente.getID());
        
        ps.executeUpdate();
        super.desconectar();		
		
	}
	
	
	public void AtualizarCliente(Cliente cliente) throws SQLException, Exception {
		
		String query = "UPDATE cliente SET nome = ?, cpf = ?, email = ?, telefone = ? WHERE id = ?";
		ps = super.conectar().prepareStatement(query);
			 ps.setInt(1, cliente.getID());
         	 ps.setString(1, cliente.getNome()); 
    		 ps.setString(2, cliente.getCpf()); 
    		 ps.setString(3, cliente.getEmail());
    		 ps.setString(4, cliente.getTelefone());
    		 ps.setString(5, cliente.getEmail());
    	     ps.setInt(6, cliente.getID());
        ps.executeUpdate();
        super.desconectar();		
		
	}
	
	
	  public ArrayList<Cliente> listar(Cliente cliente) throws Exception {
	        ArrayList<Cliente> retorno = new ArrayList();
	        String query = " select * ";
	        query = query + " from cliente  ";
	        query = query + " where id > 0 ";
	        if (cliente.getID() > 0) {
	        	query = query + " and id = ? ";
	        }

	        PreparedStatement preparedStatement = super.conectar().prepareStatement(query);
	        if (cliente.getID() > 0) {
	            preparedStatement.setInt(1, cliente.getID());
	        }

	        ResultSet leitor = preparedStatement.executeQuery();

	        while(leitor.next()) {
	            Cliente c = new Cliente();
	            c.setID(leitor.getInt("id"));
	            c.setTelefone(leitor.getString("telefone"));
	            c.setNome(leitor.getString("nome"));
	            c.setEmail(leitor.getString("email"));
	            retorno.add(c);
	        }

	        super.desconectar();
	        return retorno;
	    }
	
	
}
