/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senai.projetointegrador.persistencia;



import Classes.Reserva;
import Interface.CRUD_RESERVA;
import com.senai.projetointegrador.fabricaconexao.FabricaDeConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
        String comando = "INSERT INTO RESERVAS(DATADARESERVA, NUM_CHALE, MATRICULA_SOCIO) VALUES (?, ?, (SELECT MATRICULA_SOCIO FROM SOCIOS WHERE NOME = ?))";
        PreparedStatement ps = conectar.prepareStatement(comando);
        ps.setString(1, objeto.getDataReserva());
        ps.setInt(2, objeto.getNumChale());
        ps.setString(3, objeto.getNomeSocio());
        ps.executeUpdate();
    }
    
    @Override
    public ArrayList verificarDataDisponivel(String data, int numChale) throws SQLException {
        ArrayList dados = new ArrayList();
        String comando = "SELECT NUM_RESERVA FROM RESERVAS WHERE DATADARESERVA = ? AND NUM_CHALE = ?";
        PreparedStatement ps = conectar.prepareStatement(comando);
        ps.setString(1, data);
        ps.setInt(2, numChale);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Reserva reserva = new Reserva();
            reserva.setNumChale((int)rs.getLong("NUM_RESERVA"));
            dados.add(reserva);
        }
        return dados;

    }
}
