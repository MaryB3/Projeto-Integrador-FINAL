package com.senai.projetointegrador.dependente;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import com.senai.projetointegrador.fabricaconexao.FabricaDeConexao;

public class DependentePO {

	private static DependenteBO instancia;

	public static synchronized DependenteBO getInstancia() {
		if (instancia == null) {
			instancia = new DependenteBO();
		}
		return instancia;
	}
	private DependenteTO dependenteTO;
	
	public void inserir(){
		try {
			Connection connection = FabricaDeConexao.getInstancia().getConnxao();
			String sql = "insert into DEPENDENTES(SOCIO_RESPONSAVEL, CPF, NOME, DATADENASCIMENTO, GRAUDEPARENTESCO) VALUES(?,?,?,?,?)";
			PreparedStatement statemen= connection.prepareStatement(sql);
			statemen.setString(1, this.dependenteTO.getNome());
			statemen.setString(2, this.dependenteTO.getCpf());
			statemen.setDate(3, new Date(this.dependenteTO.getDatanascimento().getTime()));
			statemen.setString(4, this.dependenteTO.getParentesco());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}


	public DependenteTO getDependenteTO() {
		return dependenteTO;
	}

	public void setDependenteTO(DependenteTO dependenteTO) {
		this.dependenteTO = dependenteTO;
	}

}
