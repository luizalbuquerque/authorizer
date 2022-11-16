package com.card.authorizer.dto;

import com.card.authorizer.entity.TransacaoEntity;

import java.io.Serializable;

public class TransacaoDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String tipoTransacao;
    private String status;
    private double valorTransacao;

    public  TransacaoDTO(){};

    public TransacaoDTO(TransacaoEntity entity){
        this.id = entity.getTransacaoId();
        this.tipoTransacao = entity.getTipoTransacao();
        this.status = entity.getStatus();
        this.valorTransacao = entity.getValorTransacao();
    }

    public Long getTransacaoID() {
        return id;
    }

    public void setTransacaoID(Long transacaoID) {
        this.id = transacaoID;
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
}
