package controlefinanceiro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class testePostgres {

	public static void main(String[] args) {

		int codigo = 1;
		String nome = "Paulo";
		String endereco = "Rua c";
		String telefone = "88990077";

		
		try {

			Class.forName("org.postgresql.Driver");
			

		} catch (ClassNotFoundException e) {

			System.out.println("Where is your PostgreSQL JDBC Driver? "
					+ "Include in your library path!");
			e.printStackTrace();
			return;

		}
		Connection connection = null;

		try {

			connection = DriverManager.getConnection(
					"jdbc:postgresql://127.0.0.1:5432/recantoproducao", "SYSDBA",
					"L$5a7*(B");
			 
			
			
			String sql = "insert into cliente(id_usuario, nome, cod_usuario, senha)values('Pablo',1,'123)";
			PreparedStatement pstm = connection.prepareStatement(sql);
			pstm.setInt(1, codigo);
			pstm.setString(2, nome);
			pstm.setString(3, endereco);
			pstm.setString(4, telefone);
			
			pstm.execute();
			pstm.close();
                        System.out.println("contato adicionado ");


		} catch (SQLException e) {

			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return;

		}

	}

}