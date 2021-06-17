package Context;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Database.PetShopDatabase;
import models.Atendimento;
import models.Veterinario;

public class AtendimentoDado extends PetShopDatabase {
	
	private  PreparedStatement ps;
	public void CadastrarAtendimento(Atendimento atendimento) throws SQLException, Exception {
		String query = "INSERT INTO atendimento(idCliente, idFuncionario, dataDeAtendimento,  valorTotal) ";
				query += "VALUES(?,?,?,?)";
				
		 ps = super.conectar().prepareStatement(query);
				 ps.setInt(1, atendimento.getCliente().getID());
				 ps.setInt(2, atendimento.getFuncionario().getID()); 
				 ps.setString(3, atendimento.getDataDeAtendimento().toString());
				 ps.setBigDecimal(4, atendimento.getValorTotal()); 
	      super.desconectar();		   	
	}
	
	public void DeletarAtendimento(Atendimento atendimento) throws SQLException, Exception {
		
		String query = "DELETE FROM atendimento WHERE id = ?";
		 ps = super.conectar().prepareStatement(query);
         ps.setInt(1, atendimento.getID()); 	
        
        ps.executeUpdate();
        super.desconectar();		
		
	}
	
	
	public void AtualizarAtendimento(Atendimento atendimento) throws SQLException, Exception {
		
		String query = "UPDATE atendimento SET idCliente = ?, idFuncionario = ?, dataDeAtendimento = ?,  valorTotal = ? where id = ?";
		 ps = super.conectar().prepareStatement(query);
		 ps.setInt(1, atendimento.getCliente().getID());
		 ps.setInt(2, atendimento.getFuncionario().getID()); 
		 ps.setString(3, atendimento.getDataDeAtendimento().toString());
		 ps.setInt(4, atendimento.getFuncionario().getID()); 
	     ps.setInt(5, atendimento.getID());
		 
        ps.executeUpdate();
        super.desconectar();		
		
	}
	 
	public ArrayList<Atendimento> listar(Atendimento atendimento) throws Exception {
        ArrayList<Atendimento> retorno = new ArrayList();
        String query = " select * ";
        query = query + " from Atendimento  ";
        query = query + " where id > 0 ";
        if (atendimento.getID() > 0) {
        	query = query + " and id = ? ";
        }

        PreparedStatement preparedStatement = super.conectar().prepareStatement(query);
        if (atendimento.getID() > 0) {
            preparedStatement.setInt(1, atendimento.getID());
        }

        ResultSet leitor = preparedStatement.executeQuery();

        while(leitor.next()) {
        	Atendimento a = new Atendimento();
            a.setID(leitor.getInt("id"));
            a.getCliente().setID(leitor.getInt("idCliente"));
            a.getFuncionario().setID(leitor.getInt("idFuncionario"));
            a.setValorTotal(leitor.getBigDecimal("valorTotal"));
            retorno.add(a);
        }

        super.desconectar();
        return retorno;
    }
}
