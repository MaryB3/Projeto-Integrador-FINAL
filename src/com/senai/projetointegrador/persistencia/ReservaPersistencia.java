/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senai.projetointegrador.persistencia;

import Classes.Chale;
import Classes.Reserva;
import Interface.CRUD_RESERVA;
import com.senai.projetointegrador.fabricaconexao.FabricaDeConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author MaryBeds
 */
public class ReservaPersistencia implements CRUD_RESERVA{
    
    private Connection conectar = null;
    public ReservaPersistencia() throws Exception{
        conectar = FabricaDeConexao.getInstancia().getConnxao();
    }
    
    /**
     *
     * @param objeto
     * @throws SQLException
     */
    @Override
    public void incluirReserva(Reserva objeto) throws SQLException {
        String comando = "insert into RESERVAS(DATADARESERVA, NUM_CHALE,MATRICULA_SOCIO)values(?,?, ?)";
        PreparedStatement ps = conectar.prepareStatement(comando);
        ps.setString(1, objeto.getDataReserva());
        ps.setInt(2, objeto.getNumero());
        ps.setInt(3, objeto.getMatriculaSocio());
        ps.executeUpdate();
    }
    
}
