package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnection(){
	
	try {
		return DriverManager.getConnection(
				"jdbc:mysql://localhost/fj21", "root", "caelum");
	} catch (SQLException ex) {
		// TODO Auto-generated catch block
		throw new RuntimeException("Erro");
	}

	}
}
