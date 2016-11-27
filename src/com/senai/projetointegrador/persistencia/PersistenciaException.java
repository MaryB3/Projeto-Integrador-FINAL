package com.senai.projetointegrador.persistencia;

public class PersistenciaException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PersistenciaException(String str, Exception exception) {
		super(str, exception);
	}

	public PersistenciaException(Exception exception) {
		super(exception);
	}
}
