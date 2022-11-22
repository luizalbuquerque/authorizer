package com.card.authorizer.service;

import com.card.authorizer.entity.CartaoEntity;

import java.util.List;

public interface CartaoService {

    public List<CartaoEntity> listar();
    public void gerarNovoCartao();
    public Object findById(Long cartaoId);
}
