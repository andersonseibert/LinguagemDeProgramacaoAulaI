/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Anderson
 */
public class Preco {
    private int id;
    private Produto produto;
    private Date dtInicio;
    private Date dtEncerramento;
    private double valor;

    public int getId() {
        return id;
    }

    public Produto getProduto() {
        return produto;
    }

    public Date getDtInicio() {
        return dtInicio;
    }

    public Date getDtEncerramento() {
        return dtEncerramento;
    }

    public double getValor() {
        return valor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void setDtInicio(Date dtInicio) {
        this.dtInicio = dtInicio;
    }

    public void setDtEncerramento(Date dtEncerramento) {
        this.dtEncerramento = dtEncerramento;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
