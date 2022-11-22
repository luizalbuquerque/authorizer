package com.card.authorizer.service.impl;

import com.card.authorizer.dto.TransacaoDTO;
import com.card.authorizer.repository.CartaoRepository;
import com.card.authorizer.repository.TransacaoRepository;
import com.card.authorizer.service.TransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransacaoServiceImpl implements TransacaoService {

    @Autowired
    private TransacaoRepository transacaoRepository;

    @Autowired
    private CartaoRepository cartaoRepository;

    @Override
    public TransacaoDTO debitar(TransacaoDTO dto) {
        return null;
    }


}

