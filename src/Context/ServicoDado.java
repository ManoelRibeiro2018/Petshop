package Context;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Database.PetShopDatabase;
import models.Servico;

public class ServicoDado extends PetShopDatabase {
		
	private  PreparedStatement ps;
	public void CadastrarServico(Servico servico) throws SQLException, Exception {
		String query = "INSERT INTO servico( nome, preco, funcionario) ";
				query += "VALUES(?,?,?)";
				
		 ps = super.conectar().prepareStatement(query);
				 ps.setString(1, servico.getNome());
				 ps.setBigDecimal(2, servico.getPreco()); 
				 ps.setInt(3, servico.getFuncionario().getID()); 
	      super.desconectar();		   	
	}
	
	public void DeletarServico(Servico servico) throws SQLException, Exception {
		
		String query = "DELETE FROM servico WHERE id = ?";
		 ps = super.conectar().prepareStatement(query);
         ps.setInt(1, servico.getID()); 	
        
        ps.executeUpdate();
        super.desconectar();		
		
	}
	
	
	public void AtualizarServico(Servico servico) throws SQLException, Exception {
		
		String query = "UPDATE servico SET nome = ?, preco = ? WHERE idFunc = ? and id = ?";
		 ps = super.conectar().prepareStatement(query);
		 ps.setString(1, servico.getNome());
		 ps.setBigDecimal(2, servico.getPreco()); 
	     ps.setInt(4, servico.getFuncionario().getID());
	     ps.setInt(5, servico.getID());
		 
        ps.executeUpdate();
        super.desconectar();		
		
	}
	 
}
