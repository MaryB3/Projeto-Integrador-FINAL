package com.senai.projetointegrador.sistemas;

import java.io.Serializable;

import com.senai.projetointegrador.view.imagem.ProdutoLoginView;

public class LoginBO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static LoginBO instancia;
	private ProdutoLoginView loginView;

	public static synchronized LoginBO getInstancia() {
		if (instancia == null) {
			instancia = new LoginBO();
		}
		return instancia;
	}

	public void validarLogin() throws Exception {
		String login = this.loginView.getTfLogin().getText();
		String senha = String.valueOf(this.loginView.getTfSenha().getPassword());
		LoginTO loginTO = new LoginTO();
		loginTO.setLogin(login);
		loginTO.setSenha(senha);
		LoginPO loginPO = LoginPO.getInstancia();
		loginPO.setLoginTO(loginTO);
		loginTO = loginPO.logar();
		if (loginTO == null) {
			throw new Exception("Login ou Senha invalida");
		}
	}

	public ProdutoLoginView getLoginView() {
		return loginView;
	}

	public void setLoginView(ProdutoLoginView loginView) {
		this.loginView = loginView;
	}

}
