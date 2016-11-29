package com.senai.projetointegrador.socio;

import javax.swing.JComboBox;

import PacoteFuncionario.CadastroSocioView;

public class SocioCtrl {

	private static SocioCtrl instancia;

	public static synchronized SocioCtrl getInstancia() {
		if (instancia == null) {
			instancia = new SocioCtrl();
		}
		return instancia;
	}

	private CadastroSocioView socioView;
	private JComboBox<String> jcbQuemIndicou;

	public void inserir() throws Exception {
		SocioBO socioBO = SocioBO.getInstancia();
		socioBO.setSocioView(socioView);
		socioBO.inserir();
	}

	public void preenchercombo() throws Exception {
		SocioBO socioBO = SocioBO.getInstancia();
		socioBO.setSocioView(socioView);
		socioBO.setJcbQuemIndicou(jcbQuemIndicou);
		socioBO.preencherCombo();
	}

	public void verificarCPF() throws Exception {
		SocioBO socioBO = SocioBO.getInstancia();
		socioBO.setSocioView(socioView);
		socioBO.veriicarCPF();
	}

	public CadastroSocioView getSocioView() {
		return socioView;
	}

	public void setSocioView(CadastroSocioView socioView) {
		this.socioView = socioView;
	}

	public JComboBox<String> getJcbQuemIndicou() {
		return jcbQuemIndicou;
	}

	public void setJcbQuemIndicou(JComboBox<String> jcbQuemIndicou) {
		this.jcbQuemIndicou = jcbQuemIndicou;
	}

}
