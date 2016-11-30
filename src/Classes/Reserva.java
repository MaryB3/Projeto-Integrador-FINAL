/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
/**
 *
 * @author MaryBeds
 */
public class Reserva  extends Chale{
    
    private int num_reserva;
    private String dataReserva;
    private int matriculaSOcio;
    private int numChale;
    private String nomeSocio;
    

    public Reserva(String dataReserva, int numChale, int numSocio){
        
        
        this.dataReserva = dataReserva;
        this.numChale = numChale;
        this.matriculaSOcio = numSocio;

    }
    
    public Reserva(String dataReserva, int numChale, String nomeSocio){
        
        
        this.dataReserva = dataReserva;
        this.numChale = numChale;
        this.nomeSocio = nomeSocio;

    }
        
   
    public Reserva(){
        //this.descricao = "";
        //this.status = "";
    }
    
    public int getNum_reserva() {
        return num_reserva;
    }

    public void setNum_reserva(int num_reserva) {
        this.num_reserva = num_reserva;
    }

    public String getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(String dataReserva) {
        this.dataReserva = dataReserva;
    }

    public int getMatriculaSOcio() {
        return matriculaSOcio;
    }

    public void setMatriculaSOcio(int matriculaSOcio) {
        this.matriculaSOcio = matriculaSOcio;
    }

    public int getNumChale() {
        return numChale;
    }

    public void setNumChale(int numChale) {
        this.numChale = numChale;
    }

    public String getNomeSocio() {
        return nomeSocio;
    }

    public void setNomeSocio(String nomeSocio) {
        this.nomeSocio = nomeSocio;
    }
    
    
    
}
