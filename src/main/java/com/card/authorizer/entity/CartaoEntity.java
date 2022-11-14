package com.card.authorizer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "cartao")
@Data
@Generated
@NoArgsConstructor
@AllArgsConstructor
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

}
