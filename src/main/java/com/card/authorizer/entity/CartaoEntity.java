package com.card.authorizer.entity;


import javax.persistence.*;
import java.time.Instant;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "cartao")
public class CartaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String numeroCartao ;

    @Column(unique = true)
    private String password;

    @Column
    private double saldo;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant createdAt;

    // Com a anotação abaixo, a coluna salva sempre em UTC (neutro),
    // os clients front que devem tratar o timezone desejado (como o h2-console faz por exemplo)
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant updatedAt;

    // Define que o mapeamento ta feito pela entidade do tipo do Set
    // Passando como argumento o nome do campo da outra entidade
    // Onde ta configurado o mapeamento
    @ManyToMany(mappedBy = "cartao")
    private Set<TransacaoEntity> transacao = new HashSet<>();


    //sempre antes de criar o registro
    @PrePersist
    public void prePersist() {
        createdAt = Instant.now();
    }

    //sempre antes de atualizar o registro
    @PreUpdate
    public void preUpdate() {
        updatedAt = Instant.now();
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

    public Set<TransacaoEntity> getTransacao() {
        return transacao;
    }

    public void setTransacao(Set<TransacaoEntity> transacao) {
        this.transacao = transacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CartaoEntity)) return false;
        CartaoEntity entity = (CartaoEntity) o;
        return Objects.equals(id, entity.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
