/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Classes.Chale;
import Classes.Reserva;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author MaryBeds
 */
public interface CRUD {
    
    //CHALÉ
    public void incluir(Chale objeto) throws SQLException;
    public void editar(Chale objeto) throws SQLException;
    public void excluir(int numero) throws SQLException;
    public Chale consultarPorStatus(String status) throws SQLException;
    public ArrayList listarStatus(String status) throws SQLException;
    public ArrayList listar() throws SQLException;
    public ArrayList exibirChale(int numChale) throws SQLException;
    
    
}
