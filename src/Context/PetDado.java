/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Context;

import Database.PetShopDatabase;
import Models.Pet;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author manoel.ribeiro.neto
 */
public class PetDado extends PetShopDatabase {
	private  PreparedStatement ps;
	public void CadastrarPet(Pet pet) throws SQLException, Exception {
		String query = "INSERT INTO pet( nome, especie, idade, raca, responsavel) ";
				query += "VALUES(?,?,?,?,?)";
		
				 ps = super.conectar().prepareStatement(query);
				 ps.setString(1, pet.getNome()); 
				 ps.setString(2, pet.getEspecie()); 
				 ps.setInt(3, pet.getIdade()); 
				 ps.setString(4, pet.getRaca());
				 ps.setInt(5, pet.getResponsavel().getID());
				 
			        ps.executeUpdate();
			        super.desconectar();		   	
			}
			
			public void DeletarPet(Pet pet) throws SQLException, Exception {
				
				String query = "DELETE FROM pet WHERE id = ?";
				ps = super.conectar().prepareStatement(query);
		        ps.setInt(1, pet.getID());
		        
		        ps.executeUpdate();
		        super.desconectar();		
				
			}
			
			
			public void AtualizarPet(Pet pet) throws SQLException, Exception {
				
				String query = "UPDATE pet SET  nome =?, especie =?, idade= ?, raca = ?, responsavel = ? WHERE id = ?";
				ps = super.conectar().prepareStatement(query);
				   	 ps.setString(1, pet.getNome()); 
					 ps.setString(2, pet.getEspecie()); 
					 ps.setInt(3, pet.getIdade()); 
					 ps.setString(4, pet.getRaca());
					 ps.setInt(5, pet.getResponsavel().getID());
				     ps.setInt(6, pet.getID());
		        ps.executeUpdate();
		        super.desconectar();		
				
	}	
                public ArrayList<Pet> listar(Pet pet) throws Exception {
	        ArrayList<Pet> retorno = new ArrayList();
	        String query = " select * ";
	        query = query + " from pet  ";
	        query = query + " where id > 0 ";
	        if (pet.getID() > 0) {
	        	query = query + " and id = ? ";
	        }

	        PreparedStatement preparedStatement = super.conectar().prepareStatement(query);
	        if (pet.getID() > 0) {
	            preparedStatement.setInt(1, pet.getID());
	        }

	        ResultSet leitor = preparedStatement.executeQuery();

	        while(leitor.next()) {
	        	Pet p = new Pet();
	            p.setID(leitor.getInt("id"));
	            p.setNome(leitor.getString("nome"));
	            p.setEspecie(leitor.getString("especie"));
	            p.setIdade(Integer.parseInt(leitor.getString("idade")));
	            p.setRaca(leitor.getString("raca"));
	            retorno.add(p);
	        }

	        super.desconectar();
	        return retorno;
	    }
}
