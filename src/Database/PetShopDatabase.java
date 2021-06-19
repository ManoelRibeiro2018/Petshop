/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author manoel.ribeiro.neto
 */
public class PetShopDatabase {
     private Connection connection;
	    private final String DRIVER_SQLSERVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	    private final String LOCAL_SERVIDOR = "WINAPKJ2VNHH47O\\SQLEXPRESS";
	    private final String BANCO_DE_DADOS = "PetShop";
	    private final String PORTA_BANCO = "1433";
	    private final String USUARIO = "Root";
	    private final String SENHA = "";

	    public Connection conectar() throws Exception {
	        return this.conectarSqlServer();
	    }

	    public void desconectar() throws SQLException {
	    	connection.close();
	    }	  

	    private Connection conectarSqlServer() throws Exception {
	        Class.forName(DRIVER_SQLSERVER);
	        String url = "jdbc:sqlserver://"+LOCAL_SERVIDOR+":"+PORTA_BANCO+";DatabaseName="+BANCO_DE_DADOS;
	        connection = DriverManager.getConnection(url, USUARIO, SENHA);
	        return connection;
	    }
}
