package com.senai.projetointegrador.dependente;

import PacoteFuncionario.DependenteView;

public class ViewCtrl {

	private static ViewCtrl instancia;

	public static synchronized ViewCtrl getInstancia() {
		if (instancia == null) {
			instancia = new ViewCtrl();
		}
		return instancia;
	}
	private DependenteView dependenteView;

	public DependenteView getDependenteView() {
		return dependenteView;
	}
	public void setDependenteView(DependenteView dependenteView) {
		this.dependenteView = dependenteView;
	}
}
