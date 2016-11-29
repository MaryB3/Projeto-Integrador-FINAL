package com.senai.projetointegrador.socio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import com.senai.projetointegrador.utilmensage.UtilMensage;

import PacoteFuncionario.CadastroSocioView;

public class ProdutoSocioCtrl {

	private static ProdutoSocioCtrl instancia;

	public static synchronized ProdutoSocioCtrl getInstancia() {
		if (instancia == null) {
			instancia = new ProdutoSocioCtrl();
		}
		return instancia;
	}

	private CadastroSocioView socioView;
	private JButton btnSalvar;
	private JComboBox<String> jcbQuemIndicou;
	private JTextField cpfTxtField;

	public void inicializar() {
		this.inicializarComponente();
		this.iniciaListerne();
		this.preenchercombo();
	}

	private void inicializarComponente() {
		this.btnSalvar = this.socioView.getSalvarPressed();
		this.jcbQuemIndicou = this.socioView.getJcbQuemIndicou();
		this.cpfTxtField = this.socioView.getCpfTxtField();
	}

	private void preenchercombo() {
		SocioCtrl socioCtrl = SocioCtrl.getInstancia();
		socioCtrl.setSocioView(socioView);
		socioCtrl.setJcbQuemIndicou(jcbQuemIndicou);
		try {
			socioCtrl.preenchercombo();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void iniciaListerne() {

		this.btnSalvar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				SocioCtrl socioCtrl = SocioCtrl.getInstancia();
				socioCtrl.setSocioView(socioView);
				try {
					socioCtrl.inserir();
					UtilMensage.mensage("Salvo com sucesso!");
				} catch (Exception exception) {
					exception.printStackTrace();
					UtilMensage.mensage(exception.getMessage());
				}
			}
		});

		this.cpfTxtField.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent arg0) {
				verificarCPF();

			}

			@Override
			public void focusGained(FocusEvent arg0) {
				verificarCPF();
			}

			private void verificarCPF() {
				SocioCtrl socioCtrl = SocioCtrl.getInstancia();
				socioCtrl.setSocioView(socioView);
				try {
					socioCtrl.verificarCPF();
				} catch (Exception exception) {
					UtilMensage.mensage(exception.getMessage());
				}
			}
		});
	}

	public CadastroSocioView getSocioView() {
		return socioView;
	}

	public void setSocioView(CadastroSocioView socioView) {
		this.socioView = socioView;
	}

}
