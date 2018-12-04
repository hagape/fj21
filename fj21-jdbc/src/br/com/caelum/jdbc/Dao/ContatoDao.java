package br.com.caelum.jdbc.Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.caelum.jdbc.ConnectionFactory;
import br.com.caelum.jdbc.modelo.Contato;

public class ContatoDao {
	
	public void inserir(Contato contato) throws SQLException{
		Connection conn = new ConnectionFactory().getConnection();
		try{	
				
		String sql = "insert into contatos " + "(nome, email,endereco,dataNascimento) "
				+ "values (?,?,?,?)" ;
		
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, contato.getNome());
		ps.setString(2, contato.getEmail());
		ps.setString(3, contato.getEndereco());
		ps.setDate(4, new Date(contato.getDataNascimento().getTimeInMillis()));
		
		ps.execute();
		
		
		}catch (Exception ex) {
			System.out.println(ex);
			
		}finally {
			conn.close();
		}
		
		
	}

}
