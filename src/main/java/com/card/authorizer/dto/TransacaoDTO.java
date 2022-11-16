package com.card.authorizer.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Data
@Generated
@NoArgsConstructor
@AllArgsConstructor
public class TransacaoDTO {

    private Long id;
    private String tipoTransacao;
    private String status;
    private double valorTransacao;

}
