package com.nbratti.pizzaria;

import java.sql.*;

public class TesteH2 {
	public static void main(String[] args) throws Exception {
		Class.forName("org.h2.Driver");
		Connection conn = DriverManager.getConnection("jdbc:h2:./meubanco", "sa", "");
		Statement st = conn.createStatement();
		st.execute("CREATE TABLE IF NOT EXISTS pessoa(id INT PRIMARY KEY, nome VARCHAR)");
		st.execute("INSERT INTO pessoa VALUES(1, 'Ana')");
		ResultSet rs = st.executeQuery("SELECT * FROM pessoa");
		while (rs.next()) System.out.println(rs.getInt("id") + " - " + rs.getString("nome"));
		conn.close();
	}
}
