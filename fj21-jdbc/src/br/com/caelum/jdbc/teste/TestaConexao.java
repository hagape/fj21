package br.com.caelum.jdbc.teste;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.caelum.jdbc.ConnectionFactory;

class TestaConexao {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn = new ConnectionFactory().getConnection();
		System.out.println("Conexão Aberta!!");
		conn.close();
		
	}

}