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
public class Estoque {
    private int idEstoque;
    private String nome;
    private String categoria;
    private int quantidade;

    public Estoque() {
    }

    public Estoque(int idEstoque, String nome, String categoria, int quantidade) {
        this.idEstoque = idEstoque;
        this.nome = nome;
        this.categoria = categoria;
        this.quantidade = quantidade;
    }

    public int getIdEstoque() {
        return idEstoque;
    }

    public void setIdEstoque(int idEstoque) {
        this.idEstoque = idEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    

    
}
