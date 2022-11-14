package com.card.authorizer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@Generated
@NoArgsConstructor
@AllArgsConstructor
public class CartaoDTO {

    private Long id;
    private String numeroCartao ;
    private String password;
    private double saldo;
}
