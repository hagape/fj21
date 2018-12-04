package br.com.caelum.jdbc.teste;

import java.sql.SQLException;
import java.util.Calendar;

import br.com.caelum.jdbc.Dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;


public class JDBCTeste {

	public static void main(String[] args) throws SQLException {
		Contato contato = new Contato();
		contato.setNome("Caelum");
		contato.setEmail("teste@email.com");
		contato.setEndereco("Av. Paulista");
		contato.setDataNascimento(Calendar.getInstance());
		
		ContatoDao dao = new ContatoDao();
		dao.inserir(contato);
		System.out.println("Gravado!");

	}

}
