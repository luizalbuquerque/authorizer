package com.card.authorizer.service;

import com.card.authorizer.entity.CartaoEntity;

import java.util.List;

public interface CartaoService {

    List<CartaoEntity> listar();
    void gerarNovoCartao();

    Object findById(Long cartaoId);
//    Object obterSaldoCartao(String numeroCartao);
}
