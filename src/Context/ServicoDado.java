/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Context;

import Database.PetShopDatabase;
import Models.Servico;
import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author manoel.ribeiro.neto
 */
public class ServicoDado extends PetShopDatabase{
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
        
           public ArrayList<Servico> listar(Servico servico) throws Exception {
	        ArrayList<Servico> retorno = new ArrayList();
	        String query = " select * ";
	        query = query + " from servico  ";
	        query = query + " where id > 0 ";
	        if (servico.getID() > 0) {
	        	query = query + " and id = ? ";
	        }

	        PreparedStatement preparedStatement = super.conectar().prepareStatement(query);
	        if (servico.getID() > 0) {
	            preparedStatement.setInt(1, servico.getID());
	        }

	        ResultSet leitor = preparedStatement.executeQuery();

	        while(leitor.next()) {
	        	Servico  s = new Servico();
	            s.setID(leitor.getInt("id"));
	            s.setNome(leitor.getString("nome"));	           
	            s.setPreco( new BigDecimal(leitor.getString("Preco")));
	            retorno.add(s);
	        }

	        super.desconectar();
	        return retorno;
	    }
}
