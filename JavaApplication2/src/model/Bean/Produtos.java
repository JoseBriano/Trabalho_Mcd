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
public class Produtos {
    private int idProdutos;
    private String nomeProduto;
    private String Categoria;
    private int quantidade;
    private float preco;

    public Produtos() {
    }

    public Produtos(int idProdutos, String nomeProduto, String Categoria, int quantidade, float preco) {
        this.idProdutos = idProdutos;
        this.nomeProduto = nomeProduto;
        this.Categoria = Categoria;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public int getIdProdutos() {
        return idProdutos;
    }

    public void setIdProdutos(int idProdutos) {
        this.idProdutos = idProdutos;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    

}
