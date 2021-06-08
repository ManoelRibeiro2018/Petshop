package Program;

import java.time.LocalDateTime;

import models.Cliente;
import validations.ClienteNegocio;

public class Program {

	public static void main(String[] args) {
		Cliente client = new Cliente("valido", "1234567891234", "teste@gmail.", "123123", null);
		
		try {

			ClienteNegocio cn = new ClienteNegocio();
			cn.inserirCliente(client);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(client.getCpf());
	}

}
