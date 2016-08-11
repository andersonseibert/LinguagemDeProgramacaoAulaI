/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author Anderson
 */
public class Promocao {
    private int id;
    private String descricao;
    private double desconto;
    private List<Produto> produtos;

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getDesconto() {
        return desconto;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
