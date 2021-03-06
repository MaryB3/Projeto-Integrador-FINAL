/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senai.projetointegrador.persistencia;

import Classes.Chale;
import Interface.CRUD;
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
public class ChalePersistencia implements CRUD{
    
    private Connection conectar = null;
    public ChalePersistencia() throws Exception{
        conectar = FabricaDeConexao.getInstancia().getConnxao();
    }
    
    @Override
    public void incluir(Chale objeto) throws SQLException {
        String comando = "insert into CHALES(DESCRICAO,STATUS_CHALE)values(?,?)";
        PreparedStatement ps = conectar.prepareStatement(comando);
        ps.setString(1, objeto.getDescricao());
        ps.setString(2, objeto.getStatus());
        ps.executeUpdate();
    }
    
    @Override
    public void editar(Chale objeto) throws SQLException {
        String comando = "UPDATE CHALES SET DESCRICAO = ?, STATUS_CHALE = ? WHERE NUM_CHALE = ?";
        PreparedStatement ps = conectar.prepareStatement(comando);
        ps.setString(1, objeto.getDescricao());
        ps.setString(2, objeto.getStatus());
        ps.setInt(3, objeto.getNumero());
        ps.executeUpdate();
    }
    
    @Override
    public void excluir(int numero) throws SQLException {
        String comando = "delete from  CHALES where  NUM_CHALE=?";
        PreparedStatement ps = conectar.prepareStatement(comando);
        ps.setLong(1, numero);
        ps.executeUpdate();
    }
    
    @Override
    public Chale consultarPorStatus(String status) throws SQLException {
        String comando = "select * from CHALES where STATUS_CHALE = ?";
        PreparedStatement ps = conectar.prepareStatement(comando);
        ps.setString(1, status);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            Chale chale = new Chale();
            chale.setStatus(rs.getString("STATUS_CHALE"));
            return chale;
        }
        return null;
    }
    
    @Override
    public ArrayList listarStatus(String status) throws SQLException {
       ArrayList dados = new ArrayList();
        String comando = "select * from CHALES where STATUS_CHALE = ?";
        PreparedStatement ps = conectar.prepareStatement(comando);
        ps.setString(1, status);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Chale chale = new Chale();
            chale.setNumero((int)rs.getLong("NUM_CHALE"));
            chale.setDescricao(rs.getString("DESCRICAO"));
            chale.setStatus(rs.getString("STATUS_CHALE"));
            dados.add(chale);
        }
        return dados;

    }
    
    @Override
    public ArrayList listar() throws SQLException {
       ArrayList dados = new ArrayList();
        String comando = "select * from CHALES";
        PreparedStatement ps = conectar.prepareStatement(comando);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Chale chale = new Chale();
            chale.setNumero((int)rs.getLong("NUM_CHALE"));
            chale.setDescricao(rs.getString("DESCRICAO"));
            chale.setStatus(rs.getString("STATUS_CHALE"));
            dados.add(chale);
        }
        return dados;

    }
    
    @Override
    public ArrayList exibirChale(int numChale) throws SQLException {
        ArrayList dados = new ArrayList();
        String comando = "select DESCRICAO, STATUS_CHALE  from CHALES where NUM_CHALE = ?";
        PreparedStatement ps = conectar.prepareStatement(comando);
        ps.setInt(1, numChale);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Chale chale = new Chale();
            chale.setDescricao(rs.getString("DESCRICAO"));
            chale.setStatus(rs.getString("STATUS_CHALE"));
            dados.add(chale);
            System.out.println("STATUS FROM DB: "+chale.getStatus());
            System.out.println("DESC FROM DB: "+chale.getDescricao());
        }
        
        return dados;

    }
    
    
}
