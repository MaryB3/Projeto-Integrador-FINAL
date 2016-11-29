package com.senai.projetointegrador.dependente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import PacoteFuncionario.DependenteView;

public class DependenteViewCtrl {

	private static DependenteViewCtrl instancia;

	public static synchronized DependenteViewCtrl getInstancia() {
		if (instancia == null) {
			instancia = new DependenteViewCtrl();
		}
		return instancia;
	}

	private DependenteView dependenteView;
	private JButton btnSalvar;

	public void inicializar() {
		this.inicializarcomponente();
		this.inicializarlisten();
	}

	private void inicializarcomponente() {
		this.btnSalvar = this.dependenteView.getBtnSalvar();
	}

	private void inicializarlisten() {
		this.btnSalvar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

			}
		});
	}

	public DependenteView getDependenteView() {
		return dependenteView;
	}

	public void setDependenteView(DependenteView dependenteView) {
		this.dependenteView = dependenteView;
	}
}
