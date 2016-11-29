package com.senai.projetointegrador.utilmensage;

import java.io.Serializable;

public class UtilVariados implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static boolean eNumerico(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch (Exception e) {
		}
		return false;
	}
}
