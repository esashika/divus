/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 */
package br.com.globalcode.aj3.dao;

import java.security.interfaces.RSAKey;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.globalcode.aj3.beans.Cliente;
import br.com.globalcode.aj3.exception.GlobalcodeException;
import br.com.globalcode.aj3.util.ConnectionManager;

public class ClientesDAOImpl implements IClientesDAO {

	private final static String SALVAR_CLIENTE = "INSERT INTO clientes (nome,cpf,telefone) VALUES (?,?,?)";
	private final static String CREATE_TABLE = "CREATE TABLE  IF NOT EXISTS  clientes (id int(3) NOT NULL AUTO_INCREMENT   PRIMARY KEY, nome VARCHAR(20) NOT NULL, cpf varchar(20) NOT NULL, telefone varchar(20) NOT NULL)";
	private final static String DELETE_CLIENTE = "DELETE FROM clientes WHERE cpf = '";
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
	 * br.com.globalcode.aj3.dao.ClientesDAO#excluir(br.com.globalcode.beans
	 * .Cliente)
	 */
	public void excluir(String cpf) throws GlobalcodeException {
		Connection conn = null;
		Statement stmt = null;
		try {
			conn = ConnectionManager.getConnection();
			stmt = conn.createStatement();
			int numeroLinhas = stmt.executeUpdate(DELETE_CLIENTE + cpf + "'");
			System.out.println("Numero de clientes excluidos: " + numeroLinhas);
		} catch (SQLException e) {
			throw new GlobalcodeException("Erro ao excluir cliente: "
					+ DELETE_CLIENTE, e);
		} finally {
			ConnectionManager.closeAll(conn, stmt);
		}
	}

	/*
	 * @see
	 * br.com.globalcode.aj3.dao.ClientesDAO#salvar(br.com.globalcode.beans.
	 * Cliente)
	 */
	public void salvar(Cliente cliente) throws GlobalcodeException {
	}

	/*
	 * @see br.com.globalcode.aj3.dao.ClientesDAO#getAllClientes()
	 */
	public List getAllClientes() throws GlobalcodeException {
		/* 
		 * Obter todos os clientes do banco de dados usando 
		 * a constante GET_ALL_CLIENTES
		 */

		// Criar uma variavel para a Connection
		Connection conexao = null;
		// Criar uma variavel para o Statement
		Statement stmt = null;
		ResultSet rs = null;
		// Criar um ArrayList para armazenar os clientes
		List clientes = new ArrayList();
		
		// Abrir a conexao
		// Criar o Statement
		try {
			conexao = ConnectionManager.getConnection();
			stmt = conexao.createStatement();
			rs = stmt.executeQuery(GET_ALL_CLIENTES);
			while (rs.next()) {
				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				String cpf = rs.getString("cpf");
				String telefone = rs.getString("telefone");
				
				clientes.add(new Cliente(nome, telefone, cpf, id));
				
			}
			
			
		} catch (Exception e) {
			throw new GlobalcodeException("Nao foi possivel listar os clientes", e);
		}finally{
			
			ConnectionManager.closeAll(conexao, stmt, rs);
			
		}
		
		return clientes;
		
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.globalcode.aj3.dao.ClientesDAO#getClienteByID(int)
	 */
	public Cliente getClienteByCPF(String cpf) throws GlobalcodeException {
		return null;
	}
}
