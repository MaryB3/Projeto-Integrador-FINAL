/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author MaryBeds
 */
public interface CRUD_SOCIO {
    
    public ArrayList listarSocioAutorizar() throws SQLException;
    public ArrayList listar() throws SQLException;
    
}
