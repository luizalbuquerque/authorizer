package com.card.authorizer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Generated
public class TransacaoDTO implements Serializable {

    private Long id;
    private String numeroCartao;
    private String senhaTransacao;
    private double valorTransacao;

}
