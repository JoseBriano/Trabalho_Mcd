/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Senai
 */
public class Conexao {
<<<<<<< HEAD
     private static final String url = "jdbc:mysql://localhost:3306/DS_MERCADO";
    private static final String usuario = "root";
    private static final String senha = "";
=======
     private static final String url = "jdbc:mysql://localhost:3306/DS_MERCADO?SSL=false";
    private static final String usuario = "root";
    private static final String senha = "5550123";
>>>>>>> 1713ef02235ac05dc5f0342983ac8b85818a3600
    
    
    public static Connection conectar()throws SQLException{
        return (Connection) DriverManager.getConnection(url, usuario, senha);
    }
}
