package com.card.authorizer.entity;

import javax.persistence.*;
import java.time.Instant;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "transacao")
public class TransacaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String tipoTransacao;

    @Column
    private String status;

    @Column
    private double valorTransacao;

    // Com a anotação abaixo, a coluna salva sempre em UTC (neutro),
    // os clients front que devem tratar o timezone desejado (como o h2-console faz por exemplo)
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant createdAt;

    // Com a anotação abaixo, a coluna salva sempre em UTC (neutro),
    // os clients front que devem tratar o timezone desejado (como o h2-console faz por exemplo)
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant updatedAt;

    //Set, ao contrário do List, não aceita repetições
    //Essa coleção não deve estar no construtor com parâmetros e nem ter o setter
    @ManyToMany //Muitos pra muitos, com uma tabela associativa
    @JoinTable(name = "cartao", //Referencia a tabela associativa
            joinColumns = @JoinColumn(name = "product_id"), //Pega pelo campo da entidade atual
            inverseJoinColumns = @JoinColumn(name = "id")) //Pega pelo campo da entidade da coleção anotada
    private Set<CartaoEntity> categories = new HashSet<>();

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TransacaoEntity)) return false;
        TransacaoEntity entity = (TransacaoEntity) o;
        return Objects.equals(id, entity.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
