package com.senai.projetointegrador.sistemas;

import java.sql.Connection;
import java.sql.ResultSet;

import com.senai.projetointegrador.fabricaconexao.FabricaDeConexao;

public class LoginPO {

	private static LoginPO instancia;

	public static synchronized LoginPO getInstancia() {
		if (instancia == null) {
			instancia = new LoginPO();
		}
		return instancia;
	}

	private LoginTO loginTO;

	public LoginTO logar() throws Exception {
		LoginTO loginTO = null;
		try {
			FabricaDeConexao.getInstancia();
			Connection connection = FabricaDeConexao.getInstancia().getConnxao();
			String sql = " SELECT *FROM login WHERE usuario= ? and senha = ?";
			java.sql.PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, this.loginTO.getLogin());
			statement.setString(2, this.loginTO.getSenha());
			ResultSet resultSet = statement.executeQuery();
			if (resultSet.next()) {
				loginTO = this.loginTO;
				loginTO.setLogin(resultSet.getString("usuario"));
				loginTO.setSenha(resultSet.getString("senha"));
				return loginTO;
			}
			statement.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public LoginTO getLoginTO() {
		return loginTO;
	}

	public void setLoginTO(LoginTO loginTO) {
		this.loginTO = loginTO;
	}

}
