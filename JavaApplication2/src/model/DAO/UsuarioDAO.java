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
import javax.swing.JOptionPane;
import model.Bean.Usuario;

/**
 *
 * @author Senai
 */
public class UsuarioDAO {
     public Usuario logar(Usuario usuario) {
        Usuario usu = new Usuario();

        try {

            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareCall("SELECT * FROM usuario WHERE nome = ? AND senha = ?");
            stmt.setString(1, usuario.getNomeUsuario());
            stmt.setString(2, usuario.getSenha());
            rs = stmt.executeQuery();
            
            if(rs.next()){
                Usuario.setIdUsuario(rs.getInt("id_usuario"));
                System.out.println("DAO: "+Usuario.getIdUsuario());
            }else{
                JOptionPane.showMessageDialog(null, "esse usuario e/ou senha não existem!");
            }
            
            
            
            rs.close();
            stmt.close();
            conexao.close();
            

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return usu;
    }


    public void create(Usuario usuario){
        try{
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            
            stmt = conexao.prepareCall("INSERT INTO usuario(nome, senha) VALUES (?,?)");
            stmt.setString(1, usuario.getNomeUsuario());
            stmt.setString(2, usuario.getSenha());
            stmt.executeUpdate();
            
            stmt.close();
            conexao.close();
            JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso!");
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
}
