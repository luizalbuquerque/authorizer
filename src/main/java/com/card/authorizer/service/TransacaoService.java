package com.card.authorizer.service;

import com.card.authorizer.dto.TransacaoDTO;

public interface TransacaoService {
    TransacaoDTO debitar(TransacaoDTO dto);

}
