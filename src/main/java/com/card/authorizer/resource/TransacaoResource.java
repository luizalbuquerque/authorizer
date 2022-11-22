package com.card.authorizer.resource;

import com.card.authorizer.dto.TransacaoDTO;
import com.card.authorizer.entity.CartaoEntity;
import com.card.authorizer.entity.TransacaoEntity;
import com.card.authorizer.exeption.ResourceNotFoundException;
import com.card.authorizer.repository.CartaoRepository;
import com.card.authorizer.repository.TransacaoRepository;
import com.card.authorizer.service.TransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/transacoes", produces = MediaType.APPLICATION_JSON_VALUE)
public class TransacaoResource {

    @Autowired
    private TransacaoService transacaoService;

    @Autowired
    private TransacaoRepository transacaoRepository;
    @Autowired
    private CartaoRepository cartaoRepository;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public ResponseEntity<TransacaoDTO> insert(@RequestParam String numeroCartao, String senhaCartao,  String valorTransacao) {
        return null;
    }



}
