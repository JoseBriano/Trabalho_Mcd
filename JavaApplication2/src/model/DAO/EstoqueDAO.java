/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import conexao.Conexao;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Bean.Estoque;
import model.Bean.Estoque;


/**
 *
 * @author Senai
 */
public class EstoqueDAO {
     public java.util.List<Estoque> read() {
        java.util.List<Estoque> estoqueList = new ArrayList();
    try {
        Connection conexao = Conexao.conectar();
        PreparedStatement stmt = null;
        ResultSet rs = null;

       
        stmt = conexao.prepareStatement("SELECT * FROM ESTOQUE");
        rs = stmt.executeQuery();

        
        while (rs.next()) {
            
            Estoque estoque = new Estoque();
            
            estoque.setIdEstoque(rs.getInt("ID_ESTOQUE"));
            estoque.setNome(rs.getString("NOME"));
            estoque.setCategoria(rs.getString("CATEGORIA"));
            estoque.setQuantidade(rs.getInt("QUANTIDADE"));
            
            estoqueList.add(estoque);
        }
        
        rs.close();
        stmt.close();
        conexao.close();

    } catch (SQLException e) {
        
        e.printStackTrace();
    }
    
    return estoqueList;
}
     public void create(Estoque estoque) {

        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;

            stmt = conexao.prepareCall("INSERT INTO estoque (nome, categoria, quantidade) VALUES (?,?,?)");
            stmt.setString(1, estoque.getNome());
            stmt.setString(2, estoque.getCategoria());
            stmt.setInt(3, estoque.getQuantidade());

            stmt.executeUpdate();

            stmt.close();
            conexao.close();


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    
    public void delete(Estoque estoque){
        try{
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            
            stmt = conexao.prepareCall("DELETE FROM estoque WHERE id_estoque = ?");
            stmt.setInt(1, estoque.getIdEstoque());
            
            stmt.executeUpdate();
            
            stmt.close();
            conexao.close();
            
            
        }catch (SQLException e){
            e.printStackTrace();
        }
    } 
    public void update(Estoque estoque) {
    try {
        Connection conexao = Conexao.conectar();
        PreparedStatement stmt = null;
        stmt = conexao.prepareCall("UPDATE estoque SET nome = ?, categoria = ?, quantidade = ? WHERE id_estoque = ?");
        stmt.setString(1, estoque.getNome());
        stmt.setString(2, estoque.getCategoria());
        stmt.setInt(3, estoque.getQuantidade());
        stmt.setInt(4, estoque.getIdEstoque()); 
        stmt.executeUpdate();
        stmt.close();
        conexao.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

     

}
