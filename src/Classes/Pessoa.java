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
public class Pessoa {
    //Atributos
    public String nome;
    public String cpf;
    public Date dataDeNasc;
    public String estadoCivil;  //criar combobox com: solteiro(a) , casado(a) , divorciado(a) , viúvo(a)
    public String telefone;   
    public String email;
    public String endereco;
    public String banco;
    public int agencia;
    public int conta;
    
    //METODOS
  
    public String getNome() throws Exception {
         if(nome.equals("") || nome.equals(null)) throw new Exception("Nome não preenchido!");
        return nome;
    }

    public String getCpf() throws Exception {
        if(cpf.equals("") || cpf.equals(null)) throw new Exception("Cpf não preenchido!");
        return cpf;
    }

    public Date getDataDeNasc() throws Exception {
        if(dataDeNasc.equals("") || dataDeNasc.equals(null)) throw new Exception("Preencher campo Data de nascimento!");
        return dataDeNasc;
    }

    public String getEstadoCivil() throws Exception {
        return estadoCivil;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getBanco() {
        return banco;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDataDeNasc(Date dataDeNasc) {
        this.dataDeNasc = dataDeNasc;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }
  
}