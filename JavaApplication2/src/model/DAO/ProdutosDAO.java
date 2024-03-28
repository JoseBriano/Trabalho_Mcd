/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Bean.Produtos;
import telas.TelaFinal;

/**
 *
 * @author Senai
 */
public class ProdutosDAO {
        public List<Produtos> read() {
        List<Produtos> produtosCList = new ArrayList<>();
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("SELECT * FROM PRODUTOS");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Produtos produtos = new Produtos();
                produtos.setIdProdutos(rs.getInt("ID_PRODUTOS"));
                produtos.setNomeProduto(rs.getString("NOME_PRODUTOS"));
                produtos.setCategoria(rs.getString("CATEGORIA"));
                produtos.setQuantidade(rs.getInt("PRECO"));
                produtos.setPreco(rs.getFloat("preco"));
                produtosCList.add(produtos); 
            }

            rs.close();
            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produtosCList;
    }
     public void addProduto(Produtos produto) {

        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;

            stmt = conexao.prepareCall("INSERT INTO produtos (nome_produtos, categoria,quantidade, preco) VALUES (?,?,?,?)");
            stmt.setString(1, produto.getNomeProduto());
            stmt.setString(2, produto.getCategoria());
            stmt.setInt(3, produto.getQuantidade());
            stmt.setFloat(4, produto.getPreco());

            stmt.executeUpdate();

            stmt.close();
            conexao.close();

          JOptionPane.showMessageDialog(null, "Produto Adicionado No carrinho");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    
    public void deleteProduto(Produtos produto){
        try{
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            
            stmt = conexao.prepareCall("DELETE FROM produtos WHERE id_Produtos = ?");
            stmt.setInt(1, produto.getIdProdutos());
            
            stmt.executeUpdate();
            
            stmt.close();
            conexao.close();
            
            
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    
    public void deleteTudoProduto(Produtos produto){
        try{
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            
            stmt = conexao.prepareCall("DELETE FROM produtos WHERE id_Produtos >=0");
            stmt.executeUpdate();
            
            stmt.close();
            conexao.close();
            
             new TelaFinal().setVisible(true);
             
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

}
