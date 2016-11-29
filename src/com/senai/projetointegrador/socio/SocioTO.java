package com.senai.projetointegrador.socio;

import java.util.Date;

public class SocioTO {

	private Long matricula;
	private java.util.Date datAssociacao;
	private String nome;
	private String cpf;
	private Date Datnascimento;
	private String estadocivil;
	private String endereco;
	private int tel;
	private String email;
	private String banco;
	private String agencia;
	private String conta;
	private String pagamento;
	private String Status;
	private String quemIndicou;

	public SocioTO() {
		this.iniciarvariavel();
	}

	private void iniciarvariavel() {
		this.matricula = (long) 0;
		this.nome = "";
		this.cpf = "";
		this.datAssociacao = new java.util.Date();
		this.Datnascimento = null;
		this.estadocivil = "";
		this.endereco = "";
		this.tel = 0;
		this.email = "";
		this.banco = "";
		this.agencia = "";
		this.conta = "";
		this.pagamento = "";
		this.Status = "";

	}

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public java.util.Date getDatAssociacao() {
		return datAssociacao;
	}

	public void setDatAssociacao(java.util.Date datAssociacao) {
		this.datAssociacao = datAssociacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDatnascimento() {
		return Datnascimento;
	}

	public void setDatnascimento(Date datnascimento) {
		Datnascimento = datnascimento;
	}

	public String getEstadocivil() {
		return estadocivil;
	}

	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public String getPagamento() {
		return pagamento;
	}

	public void setPagamento(String pagamento) {
		this.pagamento = pagamento;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getQuemIndicou() {
		return quemIndicou;
	}

	public void setQuemIndicou(String quemIndicou) {
		this.quemIndicou = quemIndicou;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Datnascimento == null) ? 0 : Datnascimento.hashCode());
		result = prime * result + ((Status == null) ? 0 : Status.hashCode());
		result = prime * result + ((agencia == null) ? 0 : agencia.hashCode());
		result = prime * result + ((banco == null) ? 0 : banco.hashCode());
		result = prime * result + ((conta == null) ? 0 : conta.hashCode());
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((datAssociacao == null) ? 0 : datAssociacao.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((estadocivil == null) ? 0 : estadocivil.hashCode());
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((pagamento == null) ? 0 : pagamento.hashCode());
		result = prime * result + ((quemIndicou == null) ? 0 : quemIndicou.hashCode());
		result = prime * result + tel;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SocioTO other = (SocioTO) obj;
		if (Datnascimento == null) {
			if (other.Datnascimento != null)
				return false;
		} else if (!Datnascimento.equals(other.Datnascimento))
			return false;
		if (Status == null) {
			if (other.Status != null)
				return false;
		} else if (!Status.equals(other.Status))
			return false;
		if (agencia == null) {
			if (other.agencia != null)
				return false;
		} else if (!agencia.equals(other.agencia))
			return false;
		if (banco == null) {
			if (other.banco != null)
				return false;
		} else if (!banco.equals(other.banco))
			return false;
		if (conta == null) {
			if (other.conta != null)
				return false;
		} else if (!conta.equals(other.conta))
			return false;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (datAssociacao == null) {
			if (other.datAssociacao != null)
				return false;
		} else if (!datAssociacao.equals(other.datAssociacao))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (estadocivil == null) {
			if (other.estadocivil != null)
				return false;
		} else if (!estadocivil.equals(other.estadocivil))
			return false;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (pagamento == null) {
			if (other.pagamento != null)
				return false;
		} else if (!pagamento.equals(other.pagamento))
			return false;
		if (quemIndicou == null) {
			if (other.quemIndicou != null)
				return false;
		} else if (!quemIndicou.equals(other.quemIndicou))
			return false;
		if (tel != other.tel)
			return false;
		return true;
	}

}
