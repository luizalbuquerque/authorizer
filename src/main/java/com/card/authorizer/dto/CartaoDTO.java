package com.card.authorizer.dto;

import com.card.authorizer.entity.CartaoEntity;
import com.card.authorizer.entity.TransacaoEntity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CartaoDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String numeroCartao ;
    private String password;
    private double saldo;

    private List<TransacaoDTO> transacoes = new ArrayList<>();

    public CartaoDTO() {
    }

    public CartaoDTO(CartaoEntity entity) {
        this.id = entity.getCartaoId();
        this.numeroCartao = entity.getNumeroCartao();
        this.password = entity.getPassword();
        this.saldo = entity.getSaldo();
    }

    public CartaoDTO(Long id, String numeroCartao, String password, double saldo, List<TransacaoDTO> transacoes) {
        this.id = id;
        this.numeroCartao = numeroCartao;
        this.password = password;
        this.saldo = saldo;
        this.transacoes = transacoes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public List<TransacaoDTO> getTransacoes() {
        return transacoes;
    }

    public void setTransacoes(List<TransacaoDTO> transacoes) {
        this.transacoes = transacoes;
    }

}
