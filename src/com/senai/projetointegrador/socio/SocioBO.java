package com.senai.projetointegrador.socio;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.JComboBox;

import com.senai.projetointegrador.utilmensage.UtilVariados;

import PacoteFuncionario.CadastroSocioView;

public class SocioBO {

	private static SocioBO instancia;
        
        private static final int[] pesoCPF = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};

	public static synchronized SocioBO getInstancia() {
		if (instancia == null) {
			instancia = new SocioBO();
		}
		return instancia;
	}

	private CadastroSocioView socioView;
	private JComboBox<String> jcbQuemIndicou;

	private void validar() throws Exception {
		String nome = this.socioView.getTfNome().getText();
		String cpf = this.socioView.getCpfTxtField().getText();
		String dataNascimento = this.socioView.getDatanscTF().getText();
		String tel = this.socioView.getTelTxtField().getText();
		String estadocivil = (String) this.socioView.getjComboBox2().getSelectedItem();
		String email = this.socioView.getEmailTxtField().getText();
		String endereco = this.socioView.getRuaTxtField().getText();
		String quemIndicou = this.socioView.getJcbQuemIndicou().getSelectedItem().toString();
		String boleto = this.socioView.getBoletoCheckBox().getText();
		String debitoConta = this.socioView.getCartaoCheckBox().getText();
		String banco = this.socioView.getNomeCartaoTxtField().getText();
		String agencia = this.socioView.getDataValidadeTxtField().getText();
		String conta = this.socioView.getCvcTxtField().getText();
		DateFormat fomatador = new SimpleDateFormat("dd/MM/yyyy");
		String status = "PEDNDENTE";

		if (nome.isEmpty()) {
			throw new Exception("nome obrigatório");
		}

		if (cpf.isEmpty()) {
			throw new Exception("CPF obrigatório");
		}

		/*if (!UtilVariados.eNumerico(cpf)) {
			throw new Exception("Cpf somente numerico!");
		}*/
                

		if (cpf.length() != 11) {
			throw new Exception("CPF invalido!");
		} else if (SocioBO.isValidCPF(cpf) == false) {
                    throw new Exception("CPF invalido!");
                }

		if (tel.isEmpty()) {
			throw new Exception("telefone obrigatório");
		}

		if (!UtilVariados.eNumerico(tel)) {
			throw new Exception("telefone somente numerico!");
		}

		if (dataNascimento.isEmpty()) {
			throw new Exception("data de nascimento obrigatório");
		}

		if (boleto.isEmpty() && debitoConta.isEmpty()) {
			throw new Exception("escolha a forma de pagamento!");
		}
		if (!debitoConta.isEmpty()) {
			if (banco.isEmpty()) {
				throw new Exception("Escolha o banco!");
			}

			if (agencia.isEmpty()) {
				throw new Exception("Informe a agencia!");
			}

			if (conta.isEmpty()) {
				throw new Exception("Informe a conta ");
			}
		}

		SocioTO socioTO = new SocioTO();

		try {
			Date dataformatada = (fomatador.parse(dataNascimento));
			fomatador.parse(dataNascimento);
			socioTO.setDatnascimento(dataformatada);
		} catch (Exception e) {
			throw new Exception("data invalida");
		}

		socioTO.setNome(nome);
		socioTO.setCpf(cpf);
		socioTO.setTel(new Integer(tel));
		socioTO.setEstadocivil(estadocivil);
		socioTO.setEmail(email);
		socioTO.setEndereco(endereco);
		socioTO.setQuemIndicou(quemIndicou);
		socioTO.setPagamento(boleto);
		socioTO.setPagamento(debitoConta);
		socioTO.setAgencia(agencia);
		socioTO.setBanco(banco);
		socioTO.setConta(conta);
		socioTO.setStatus(status);
		SocioPO socioPO = SocioPO.getInstancia();
		socioPO.setSocioTO(socioTO);
		socioPO.salvar();
	}

	public void inserir() throws Exception {
		this.validar();
	}

	public void preencherCombo() throws Exception {
		SocioPO socioPO = SocioPO.getInstancia();
		List<SocioTO> listaCombo = socioPO.preencherComboBox();
		try {
			for (SocioTO socioTO : listaCombo) {
				jcbQuemIndicou.addItem(socioTO.getNome());
			}
		} catch (Exception e) {
			System.out.println("erro ao preencher a combobox");
			e.printStackTrace();
		}
	}

	public void veriicarCPF() throws Exception {
		String cpf = this.socioView.getCpfTxtField().getText();
		if (!cpf.isEmpty() && UtilVariados.eNumerico(cpf)) {
			SocioTO socioTO = new SocioTO();
			socioTO.setCpf(cpf);
			SocioPO socioPO = SocioPO.getInstancia();
			socioPO.setSocioTO(socioTO);
			socioTO = socioPO.verificarCPF();
			if (socioTO != null) {
				throw new Exception("cpf já existente!");
			}
		}
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
        
        
        
     public static boolean isValidCPF(String cpf) {
        if ((cpf==null) || (cpf.length()!=11)) return false;

        Integer digito1 = calcularDigito(cpf.substring(0,9), pesoCPF);
        Integer digito2 = calcularDigito(cpf.substring(0,9) + digito1, pesoCPF);
      return cpf.equals(cpf.substring(0,9) + digito1.toString() + digito2.toString());
    }
      
    private static int calcularDigito(String str, int[] peso) {
      int soma = 0;
      for (int indice=str.length()-1, digito; indice >= 0; indice-- ) {
         digito = Integer.parseInt(str.substring(indice,indice+1));
         soma += digito*peso[peso.length-str.length()+indice];
      }
      soma = 11 - soma % 11;
      return soma > 9 ? 0 : soma;
   }

}
