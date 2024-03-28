/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Bean;

/**
 *
 * @author Senai
 */
public class ProdutosComprados {
   private int idProdutosC;
   private int estoqueFk;
    private String nomeProdutoC;

    public ProdutosComprados() {
    }

    public ProdutosComprados(int idProdutosC, int estoqueFk, String nomeProdutoC) {
        this.idProdutosC = idProdutosC;
        this.estoqueFk = estoqueFk;
        this.nomeProdutoC = nomeProdutoC;
    }

    public int getIdProdutosC() {
        return idProdutosC;
    }

    public void setIdProdutosC(int idProdutosC) {
        this.idProdutosC = idProdutosC;
    }

    public int getEstoqueFk() {
        return estoqueFk;
    }

    public void setEstoqueFk(int estoqueFk) {
        this.estoqueFk = estoqueFk;
    }

    public String getNomeProdutoC() {
        return nomeProdutoC;
    }

    public void setNomeProdutoC(String nomeProdutoC) {
        this.nomeProdutoC = nomeProdutoC;
    }

    
 
}
