package com.senai.projetointegrador.sistemas;

import PacoteFuncionario.FuncionarioInterface;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.senai.projetointegrador.utilmensage.UtilMensage;
import com.senai.projetointegrador.view.imagem.ProdutoLoginView;

public class ProdutoLoginViewCtrl {

	private static ProdutoLoginViewCtrl instancia;
	private ProdutoLoginView loginView;

	public static synchronized ProdutoLoginViewCtrl getInstancia() {
		if (instancia == null) {
			instancia = new ProdutoLoginViewCtrl();
		}
		return instancia;
	}

	private javax.swing.JButton btnLogar;
	private javax.swing.JButton btnSair;
	private javax.swing.JTextField tfLogin;

	public void inicializar() {
		this.iniciarComponente();
		this.iniciaListine();
	}

	private void iniciarComponente() {
		this.tfLogin = this.loginView.getTfLogin();

		this.btnLogar = this.loginView.getBtnLogar();
		this.btnSair = this.loginView.getBtnSair();
	}

	private void iniciaListine() {
		this.btnLogar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					ViewCtrl viewCtrl = ViewCtrl.getInstancia();
					viewCtrl.setLoginView(loginView);
					viewCtrl.validarLogin();
					FuncionarioInterface tela = new FuncionarioInterface();
					tela.setVisible(true);
					loginView.setVisible(false);
					tela.setLocationRelativeTo(null);
					tfLogin.setBackground(Color.white);
				} catch (Exception exception) {
					validacampos(exception.getMessage());
				}
			}
		});

		this.btnSair.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				loginView.setVisible(false);
			}
		});
	}

	private void validacampos(String strMsg) {
		int resposta = UtilMensage.mensage(strMsg);
		if (resposta == 0) {
			this.tfLogin.requestFocus();
			this.tfLogin.setBackground(Color.red);
			this.tfLogin.selectAll();
			;
		}
	}

	public javax.swing.JButton getBtnLogar() {
		return btnLogar;
	}

	public void setBtnLogar(javax.swing.JButton btnLogar) {
		this.btnLogar = btnLogar;
	}

	public javax.swing.JButton getBtnSair() {
		return btnSair;
	}

	public void setBtnSair(javax.swing.JButton btnSair) {
		this.btnSair = btnSair;
	}

	public javax.swing.JTextField getTfLogin() {
		return tfLogin;
	}

	public void setTfLogin(javax.swing.JTextField tfLogin) {
		this.tfLogin = tfLogin;
	}

	public static void setInstancia(ProdutoLoginViewCtrl instancia) {
		ProdutoLoginViewCtrl.instancia = instancia;
	}

	public ProdutoLoginView getLoginView() {
		return loginView;
	}

	public void setLoginView(ProdutoLoginView loginView) {
		this.loginView = loginView;
	}

}
