/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Classes.Reserva;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author MaryBeds
 */
public interface CRUD_RESERVA {
    
     //RESERVA
    public void incluirReserva(Reserva objeto) throws SQLException;
    public ArrayList verificarDataDisponivel(String data, int numChale) throws SQLException;
}
