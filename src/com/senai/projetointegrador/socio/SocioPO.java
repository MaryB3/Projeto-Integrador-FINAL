package com.senai.projetointegrador.socio;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.senai.projetointegrador.fabricaconexao.FabricaDeConexao;

public class SocioPO {

	private static SocioPO instancia;

	public static synchronized SocioPO getInstancia() {
		if (instancia == null) {
			instancia = new SocioPO();
		}
		return instancia;
	}

	private SocioTO socioTO;

	public void salvar() {
		try {
			Connection connection = FabricaDeConexao.getInstancia().getConnxao();
			String sql = "insert into socios ( NOME, CPF, DATADENASCIMENTO,ESTADOCIVIL,ENDERECO,"
					+ " TELEFONE, EMAIL, BANCO,CONTA, FORMADEPAGAMENTO, STATUS, QUEMINDICOU, AGENCIA, DATADEASSOCIACAO)"
					+ " values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, this.socioTO.getNome());
			statement.setString(2, this.socioTO.getCpf());
			statement.setDate(3, new Date(this.socioTO.getDatnascimento().getTime()));
			statement.setString(4, this.socioTO.getEstadocivil());
			statement.setString(5, this.socioTO.getEndereco());
			statement.setInt(6, this.socioTO.getTel());
			statement.setString(7, this.socioTO.getEmail());
			statement.setString(8, this.socioTO.getBanco());
			statement.setString(9, this.socioTO.getConta());
			statement.setString(10, this.socioTO.getPagamento());
			statement.setString(11, this.socioTO.getStatus());
			statement.setString(12, this.socioTO.getQuemIndicou());
			statement.setString(13, this.socioTO.getAgencia());
			statement.setDate(14, new Date(this.socioTO.getDatAssociacao().getTime()));
			statement.execute();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<SocioTO> preencherComboBox() throws Exception {
		List<SocioTO> listaCombo = new ArrayList<SocioTO>();
		try {
			Connection connection = FabricaDeConexao.getInstancia().getConnxao();
			String sql = "select nome from socios";
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				SocioTO socioTO = new SocioTO();
				socioTO.setNome(resultSet.getString("nome"));
				;
				listaCombo.add(socioTO);
			}
			statement.close();
			connection.close();
		} catch (Exception e) {
			System.out.println("erro de busca combobox");
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
		return listaCombo;

	}
        
        
        
 

	public SocioTO verificarCPF() throws Exception {
		try {
			Connection connection = FabricaDeConexao.getInstancia().getConnxao();
			String sql = "select cpf from socios where cpf=?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, this.socioTO.getCpf());
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				SocioTO socioTO = new SocioTO();
				socioTO.setCpf(resultSet.getString("cpf"));
				return socioTO;
			}
			statement.close();
			connection.close();
		} catch (Exception e) {
			System.out.println("erro de busca combobox");
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
		return null;

	}

	private SocioTO tranferrenciaderesultset(ResultSet resultSet) throws Exception {
		SocioTO socioTO = new SocioTO();
		socioTO.setNome(resultSet.getString("nome"));
		socioTO.setCpf(resultSet.getString("cpf"));
		socioTO.setDatnascimento(resultSet.getDate(" DATADENASCIMENTO"));
		socioTO.setEstadocivil(resultSet.getString("estadocivil"));
		socioTO.setEndereco(resultSet.getString("endereco"));
		socioTO.setTel(resultSet.getInt("telefone"));
		socioTO.setEmail(resultSet.getString("email"));
		socioTO.setBanco(resultSet.getString("banco"));
		socioTO.setAgencia(resultSet.getString("agencia"));
		socioTO.setConta(resultSet.getString("conta"));
		socioTO.setPagamento(resultSet.getString("formadepagamento"));
		socioTO.setStatus(resultSet.getString("status"));
		socioTO.setQuemIndicou(resultSet.getString("quemindicou"));
		return socioTO;
	}

	public SocioTO getSocioTO() {
		return socioTO;
	}

	public void setSocioTO(SocioTO socioTO) {
		this.socioTO = socioTO;
	}

}
