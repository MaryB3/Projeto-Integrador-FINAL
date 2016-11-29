package com.senai.projetointegrador.fabricaconexao;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;

public class FabricaDeConexao implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static String usuario = "root";
	private static String senha = "root";
	//private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String url = "jdbc:mysql://localhost:8889/GOLFCLUB";
	private static String driver = "com.mysql.jdbc.Driver";

	private static FabricaDeConexao instancia;

	public static synchronized FabricaDeConexao getInstancia() {
		if (instancia == null) {
			instancia = new FabricaDeConexao();
		}
		return instancia;
	}

	public Connection getConnxao() throws Exception {
		Class.forName(driver);
		Connection connection = DriverManager.getConnection(url, usuario, senha);
		return connection;
	}

}
