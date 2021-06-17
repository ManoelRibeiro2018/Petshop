package Context;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import Database.PetShopDatabase;
import models.Pet;

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
			
			 
}
