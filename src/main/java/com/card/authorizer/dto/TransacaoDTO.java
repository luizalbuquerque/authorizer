package com.card.authorizer.dto;

import com.card.authorizer.entity.CartaoEntity;
import com.card.authorizer.entity.TransacaoEntity;

import java.io.Serializable;

public class TransacaoDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String tipoTransacao;
    private String status;
    private double valorTransacao;

    private CartaoDTO cartao;

    public  TransacaoDTO(){};

    public TransacaoDTO(TransacaoEntity entity){
        this.id = entity.getTransacaoId();
        this.tipoTransacao = entity.getTipoTransacao();
        this.status = entity.getStatus();
        this.valorTransacao = entity.getValorTransacao();
    }
    public TransacaoDTO(Long id, String tipoTransacao, String status, double valorTransacao) {
        this.id = id;
        this.tipoTransacao = tipoTransacao;
        this.status = status;
        this.valorTransacao = valorTransacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoTransacao() {
        return tipoTransacao;
    }

    public void setTipoTransacao(String tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getValorTransacao() {
        return valorTransacao;
    }

    public void setValorTransacao(double valorTransacao) {
        this.valorTransacao = valorTransacao;
    }

    public CartaoDTO getCartao() {
        return cartao;
    }

    public void setCartao(CartaoDTO cartao) {
        this.cartao = cartao;
    }
}
