/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Date;

/**
 *
 * @author MaryBeds / Wellington
 */
public class Socio extends Pessoa {
    
    //ATRIBUTOS
    private Date dataDeAssociacao;  // criar mascara --/--/----
    private String formaPagamento;  // criar combobox com: DEBITO AUTOMATICO , CARTAO/INTERNET
    private String quemIndicou;
    private String status;
    private java.util.Date dataEntrada;
    private java.util.Date dataSaida;
    private String cpfRecebido;

   //METODOS:
    
    public Socio(){
        
    }
    
    public Socio(String cpf, String status){
        this.cpfRecebido = cpf;
        this.status = status;
    }
    
    public Date getDataDeAssociacao() throws Exception {
         if(dataDeAssociacao.equals(null) || dataDeAssociacao.equals("")) throw new Exception("Informar a Data de Associcão!");
        return dataDeAssociacao;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setDataDeAssociacao(Date dataDeAssociacao) { 
        this.dataDeAssociacao = dataDeAssociacao;
    }

    public void setFormaPagamento(String formaPagamento) {
         this.formaPagamento = formaPagamento;
    }

    public String getQuemIndicou() {
        return quemIndicou;
    }

    public void setQuemIndicou(String quemIndicou) {
        this.quemIndicou = quemIndicou;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getCpfRecebido() {
        return cpfRecebido;
    }

    public void setCpfRecebido(String cpfRecebido) {
        this.cpfRecebido = cpfRecebido;
    }
    
    
    
    
}
