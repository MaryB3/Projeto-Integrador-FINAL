/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senai.projetointegrador.persistencia;

import Classes.Chale;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author MaryBeds
 */
public class ChalePersistencia {
    
    private Connection conectar = null;
    public ChalePersistencia(){
        //conectar = FabricaDeConexao.getConnxao();
    }
    
    //@Override
    public void incluir(Chale objeto) throws SQLException {
        String comando = "insert into CHALES(DESCRICAO,STATUS)values(?,?)";
        PreparedStatement ps = conectar.prepareStatement(comando);
        ps.setString(1, objeto.getDescricao());
        ps.setString(2, objeto.getStatus());
        ps.executeUpdate();
    }
    
    //@Override
    public void editar(Chale objeto) throws SQLException {
        String comando = "update into CHALES(DESCRICAO,STATUS)values(?,?)";
        PreparedStatement ps = conectar.prepareStatement(comando);
        ps.setString(1, objeto.getDescricao());
        ps.setString(2, objeto.getStatus());
        ps.executeUpdate();
    }
    
    //@Override
    public void excluir(int numero) throws SQLException {
        String comando = "delete from  CHALES where  NUM_CHALE=?";
        PreparedStatement ps = conectar.prepareStatement(comando);
        ps.setLong(1, numero);
        ps.executeUpdate();
    }
    
    //@Override
    public Chale consultarPorStatus(String status) throws SQLException {
        String comando = "select * from CHALES where STATUS = ?";
        PreparedStatement ps = conectar.prepareStatement(comando);
        ps.setString(1, status);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            Chale chale = new Chale();
            chale.setStatus(rs.getString("STATUS"));
            return chale;
        }
        return null;
    }
    
    public ArrayList listarStatus(String status) throws SQLException {
       ArrayList dados = new ArrayList();
        String comando = "select * from CHALES where STATUS = ?";
        PreparedStatement ps = conectar.prepareStatement(comando);
        ps.setString(1, status);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Chale chale = new Chale();
            chale.setNumero((int)rs.getLong("NUM_CHALE"));
            chale.setDescricao(rs.getString("DESCRICAO"));
            chale.setStatus(rs.getString("STATUS"));
            dados.add(chale);
        }
        return dados;

    }
    
    //@Override
    public ArrayList listar() throws SQLException {
       ArrayList dados = new ArrayList();
        String comando = "select * from CHALES";
        PreparedStatement ps = conectar.prepareStatement(comando);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Chale chale = new Chale();
            chale.setNumero((int)rs.getLong("NUM_CHALE"));
            chale.setDescricao(rs.getString("DESCRICAO"));
            chale.setStatus(rs.getString("STATUS"));
            dados.add(chale);
        }
        return dados;

    }
    
    /*public void reservar(Chale objeto) throws SQLException {
        String comando = "insert into CHALES(DATADARESERVA, STATUS, NUM_CHALE, MATRICULA_SOCIO)values(?,?,?,?)";
        PreparedStatement ps = conectar.prepareStatement(comando);
        ps.setString(1, objeto.getDataReserva());
        ps.setString(2, objeto.getStatus());
        ps.setLong(3, objeto.getNumero());
        
        ps.executeUpdate();
    }*/
    
}
