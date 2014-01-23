package br.com.globalcode.aj3.util;

/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import br.com.globalcode.aj3.exception.GlobalcodeException;

public class ConnectionManager {

	/*
	 * Os valores das constantes abaixo devem estar de acordo com o banco de
	 * dados utilizado.
	 */
	private static final String STR_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DATABASE = "divus27";
	private static final String IP = "186.202.152.48";
	private static final String STR_CON = "jdbc:mysql://" + IP + ":3306/"
			+ DATABASE;
	private static final String USER = "divus27";
	private static final String PASSWORD = "mudar123";

	public static Connection getConnection() throws GlobalcodeException {
		Connection conn = null;
		try {
			Class.forName(STR_DRIVER);// classe que representa uma classe java

			conn = DriverManager.getConnection(STR_CON, USER, PASSWORD);
			System.out.println("[ConnectionManager]: Obtendo conexao");
			return conn;

		} catch (ClassNotFoundException e) {
			throw new GlobalcodeException("Driver nao encontrado", e);
		} catch (SQLException e) {
			throw new GlobalcodeException("Erro ao obter a conexao", e);
		}
	}

	public static void closeAll(Connection conn) {
		try {
			if (conn!=null) {
				conn.close();//fechando a conexao
			}
			// c)Se a conexao (conn) não eh null, entao feche a conexao

		} catch (Exception e) {
			System.out
					.println("---> Nao foi possivel fechar a conexao com o banco");
			System.out.println("---> Detalhamento do erro: ");
			e.printStackTrace();
		}
	}
}
