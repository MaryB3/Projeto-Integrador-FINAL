package com.senai.projetointegrador.dependente;

public class DependenteBO {

	private static DependenteBO instancia;

	public static synchronized DependenteBO getInstancia() {
		if (instancia == null) {
			instancia = new DependenteBO();
		}
		return instancia;
	}
}
