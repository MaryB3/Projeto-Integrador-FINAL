/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Classes.Socio;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author MaryBeds
 */
public interface CRUD_SOCIO {
    
    public void editar(Socio objeto) throws SQLException; 
    public ArrayList listarSocioAutorizar() throws SQLException;
    public ArrayList listar() throws SQLException;
    public ArrayList listarSocioPorNomeAutorizar(String nome) throws SQLException;
    public ArrayList listarSocioPorNome(String nome) throws SQLException;
    
}
