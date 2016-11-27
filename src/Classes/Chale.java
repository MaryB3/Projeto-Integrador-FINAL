/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Wellington
 */
public class Chale {
    //ATRIBUTOS:
    
    private int numero;
    private String descricao= ""; //caracteristicas do chale (qtd de quartos, suite, ar-condicionado, TV etc..)
    private String status= ""; //Status do chale combobox: (LIVRE / RESERVADO / OCUPADO)
    private String dataReserva = "";
   
    //METODOS:

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }  
        /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }
       /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
       public String getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(String dataReserva) {
        this.dataReserva = dataReserva;
    }
 
}
