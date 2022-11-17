package com.card.authorizer.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "transacao")
public class TransacaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transacao_id")
    private Long transacaoId;

    @Column
    private String tipoTransacao;

    @NotNull
    private String status;

    @Column
    private double valorTransacao;

    @Column
    private Instant createdAt;

    @Column
    private Instant updatedAt;

    @ManyToOne
    @JoinColumn(name = "cartao_id")
    private CartaoEntity cartao;

    public TransacaoEntity() {
    }

    public TransacaoEntity(Long transacaoId, String tipoTransacao, String status, double valorTransacao, Instant createdAt, Instant updatedAt) {
        this.transacaoId = transacaoId;
        this.tipoTransacao = tipoTransacao;
        this.status = status;
        this.valorTransacao = valorTransacao;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getTransacaoId() {
        return transacaoId;
    }

    public void setTransacaoId(Long transacaoId) {
        this.transacaoId = transacaoId;
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

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public CartaoEntity getCartao() {
        return cartao;
    }

    public void setCartao(CartaoEntity cartao) {
        this.cartao = cartao;
    }

    @PrePersist
    public void prePersist() {
        createdAt = Instant.now();
    }

    @PreUpdate
    public void preUpdate() {
        updatedAt = Instant.now();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TransacaoEntity)) return false;
        TransacaoEntity entity = (TransacaoEntity) o;
        return Objects.equals(transacaoId, entity.transacaoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transacaoId);
    }

}
