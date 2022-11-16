package com.card.authorizer.dto;

import com.card.authorizer.entity.CartaoEntity;

import java.io.Serializable;

public class CartaoDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String numeroCartao ;
    private String password;
    private double saldo;


    public CartaoDTO() {
    }

    public CartaoDTO(CartaoEntity entity) {
        this.id = entity.getCartaoId();
        this.numeroCartao = entity.getNumeroCartao();
        this.password = entity.getPassword();
        this.saldo = entity.getSaldo();
    }

    public Long getCartaoId() {
        return id;
    }

    public void setCartaoId(Long cartaoId) {
        this.id = cartaoId;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
