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
public class Chale extends Socio{
    //ATRIBUTOS:
    
    private int numero;
    private String descricao= ""; //caracteristicas do chale (qtd de quartos, suite, ar-condicionado, TV etc..)
    private String status= ""; //Status do chale combobox: (LIVRE / RESERVADO / OCUPADO)
    private int matriculaSocio;
    private boolean isEditar;
   
    //METODOS:
    public Chale(String descricao, String status){
        this.descricao = descricao;
        this.status = status;
    }
    
    public Chale(){
        this.descricao = "";
        this.status = "";
    }

    public Chale(String dataReserva, int socioSelecionado, int numChale) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

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

    public int getMatriculaSocio() {
        return matriculaSocio;
    }

    public void setMatriculaSocio(int matriculaSocio) {
        this.matriculaSocio = matriculaSocio;
    }

    public boolean isIsEditar() {
        return isEditar;
    }

    public void setIsEditar(boolean isEditar) {
        this.isEditar = isEditar;
    }
    
       
 
}
