package com.card.authorizer.entity;


import javax.persistence.*;
import java.time.Instant;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "cartao")
public class CartaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cartao_id")
    private Long cartaoId;

    @Column(unique = true)
    private String numeroCartao ;

    @Column(unique = true)
    private String password;

    @Column
    private double saldo;

    @Column
    private Instant createdAt;

    @Column
    private Instant updatedAt;

    public CartaoEntity() {
    }

    @OneToMany(mappedBy = "cartao")
    private List<TransacaoEntity> transacoes;


    public CartaoEntity(Long cartaoId, String numeroCartao, String password, double saldo, Instant createdAt, Instant updatedAt) {
        this.cartaoId = cartaoId;
        this.numeroCartao = numeroCartao;
        this.password = password;
        this.saldo = saldo;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }


    public Long getCartaoId() {
        return cartaoId;
    }

    public void setCartaoId(Long cartaoId) {
        this.cartaoId = cartaoId;
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

    @PrePersist
    public void prePersist() {
        createdAt = Instant.now();
    }

    @PreUpdate
    public void preUpdate() {
        updatedAt = Instant.now();
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

    public List<TransacaoEntity> getTransacoes() {
        return transacoes;
    }

    public CartaoEntity setEvents(List<TransacaoEntity> transacoes) {
        this.transacoes = transacoes;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CartaoEntity)) return false;
        CartaoEntity entity = (CartaoEntity) o;
        return Objects.equals(cartaoId, entity.cartaoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cartaoId);
    }

}
