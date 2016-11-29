/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senai.projetointegrador.persistencia;

import Classes.Chale;
import Classes.Socio;
import Interface.CRUD_SOCIO;
import com.senai.projetointegrador.fabricaconexao.FabricaDeConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MaryBeds
 */
public class SocioPersistencia implements CRUD_SOCIO{
    
    private Connection conectar = null;
    public SocioPersistencia() throws Exception{
        conectar = FabricaDeConexao.getInstancia().getConnxao();
    }
    
    @Override
    public ArrayList listarSocioAutorizar() throws SQLException {
       ArrayList dados = new ArrayList();
        String comando = "select * from SOCIOS where STATUS = ?";
        PreparedStatement ps = conectar.prepareStatement(comando);
        ps.setString(1, "PENDENTE");
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Socio socio = new Socio();
            socio.setNome(rs.getString("NOME"));
            socio.setTelefone(rs.getString("TELEFONE"));
            socio.setQuemIndicou(rs.getString("QUEMINDICOU"));
            dados.add(socio);
            
        }
        return dados;

    }
    
    @Override
    public ArrayList listar() throws SQLException {
       ArrayList dados = new ArrayList();
        String comando = "select * from SOCIOS";
        PreparedStatement ps = conectar.prepareStatement(comando);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Socio socio = new Socio();
            socio.setNome(rs.getString("NOME"));
            socio.setTelefone(rs.getString("TELEFONE"));
            socio.setStatus(rs.getString("STATUS"));
            dados.add(socio);
        }
        return dados;

    }
    
}
