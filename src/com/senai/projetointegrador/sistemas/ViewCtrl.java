package com.senai.projetointegrador.sistemas;

import com.senai.projetointegrador.view.imagem.ProdutoLoginView;

public class ViewCtrl {
	private static ViewCtrl instancia;
	private ProdutoLoginView loginView;

	public static synchronized ViewCtrl getInstancia() {
		if (instancia == null) {
			instancia = new ViewCtrl();
		}
		return instancia;
	}

	public void validarLogin() throws Exception {
		LoginBO loginBO = LoginBO.getInstancia();
		loginBO.setLoginView(loginView);
		loginBO.validarLogin();
	}

	public ProdutoLoginView getLoginView() {
		return loginView;
	}

	public void setLoginView(ProdutoLoginView loginView) {
		this.loginView = loginView;
	}

}
