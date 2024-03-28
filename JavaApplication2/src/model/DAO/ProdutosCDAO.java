package model.DAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import conexao.Conexao;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Bean.ProdutosComprados;

public class ProdutosCDAO {
    public List<ProdutosComprados> read() {
        List<ProdutosComprados> produtosCList = new ArrayList<>();
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("SELECT * FROM PRODUTOS_C");
            rs = stmt.executeQuery();

            while (rs.next()) {
                ProdutosComprados produtosC = new ProdutosComprados();
                produtosC.setIdProdutosC(rs.getInt("ID_PRODUTOS_C"));
                produtosC.setEstoqueFk(rs.getInt("ESTOQUE_FK"));
                produtosC.setNomeProdutoC(rs.getString("NOME_PRODUTOS_C"));

                produtosCList.add(produtosC);
            }

            rs.close();
            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produtosCList;
    }
}
