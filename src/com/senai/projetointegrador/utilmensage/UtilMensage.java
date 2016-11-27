package com.senai.projetointegrador.utilmensage;

import java.io.Serializable;

import javax.swing.JOptionPane;

public class UtilMensage implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static int mensage(String str) {
		Object[] resposta = { "OK!" };
		return JOptionPane.showOptionDialog(null, str, "ERRO!", JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.INFORMATION_MESSAGE, null, resposta, resposta[0]);

	}

	public static void mensage(Exception exception) {
		exception.getMessage();
	}
}
