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
    private String dataReserva = "";
    

    public Reserva(String dataReserva, int numSocio, int numChale){
        
        
        //this.descricao = descricao;
        //this.status = status;
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
    
}
