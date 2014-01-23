/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 */
package br.com.globalcode.aj3.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import br.com.globalcode.aj3.beans.Cliente;
import br.com.globalcode.aj3.exception.GlobalcodeException;
import br.com.globalcode.aj3.util.ConnectionManager;

public class ClientesDAOImpl implements IClientesDAO {
	
	private final static String SALVAR_CLIENTE = "INSERT INTO clientes (nome,cpf,telefone) VALUES (?,?,?)";
	private final static String CREATE_TABLE = "CREATE TABLE  IF NOT EXISTS  clientes (id int(3) NOT NULL AUTO_INCREMENT   PRIMARY KEY, nome VARCHAR(20) NOT NULL, cpf varchar(20) NOT NULL, telefone varchar(20) NOT NULL)";
	private final static String DELETE_CLIENTE = "DELETE FROM clientes WHERE cpf ='";
	private final static String GET_ALL_CLIENTES = "SELECT * FROM clientes";
	private final static String GET_CLIENTE_BY_CPF = "SELECT * FROM clientes WHERE cpf = ?";

	
	
	public void createTable() throws GlobalcodeException {
		Connection conn = null;
		Statement stmt = null;
		try {
			conn = ConnectionManager.getConnection();
			stmt = conn.createStatement();
			stmt.executeUpdate(CREATE_TABLE);
		} catch (SQLException e) {
			throw new GlobalcodeException(
					"Erro ao criar a tabela de clientes : " + CREATE_TABLE, e);
		} finally {
			ConnectionManager.closeAll(conn, stmt);
		}
	}

	/*
	 * @see
	 * br.com.globalcode.aj3.dao.ClientesDAO#excluir(br.com.globalcode.beans.Cliente)
	 */
	public void excluir(String cpf) throws GlobalcodeException {
		
		
		
		
		
		

		// Criar uma variavel para a Connection
		Connection conn = null;
		// Criar uma variavel para o Statement
		Statement stmt = null;
		
		// Abrir a conexao
		
		conn =ConnectionManager.getConnection();
		try {
			stmt=conn.createStatement();
			
			
			int linhas = stmt.executeUpdate(DELETE_CLIENTE+cpf+"'");
			System.out.println("Erro de Statement");
			
			System.out.println("Qtdade de LInhas:" + linhas);//numero de linhas deletadas
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			ConnectionManager.closeAll(conn, stmt);
			
		}
		
		
		
		// Criar o Statement
		// Executar a instrucao de delete recuperando o numero de linhas alteradas (executeUpdate)
		// Imprimir o numero de linhas alteradas
		// Fechar a Connection e o Statement
		
	}

	/*
	 * @see
	 * br.com.globalcode.aj3.dao.ClientesDAO#salvar(br.com.globalcode.beans.
	 * Cliente)
	 */
	public void salvar(Cliente cliente) throws GlobalcodeException{
	}

	/*
	 * @see br.com.globalcode.aj3.dao.ClientesDAO#getAllClientes()
	 */
	public List getAllClientes() throws GlobalcodeException{
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.globalcode.aj3.dao.ClientesDAO#getClienteByID(int)
	 */
	public Cliente getClienteByCPF(String cpf) throws GlobalcodeException{
		return null;
	}
}
