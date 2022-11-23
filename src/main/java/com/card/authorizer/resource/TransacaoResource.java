package com.card.authorizer.resource;

import com.card.authorizer.dto.CartaoDTO;
import com.card.authorizer.dto.TransacaoDTO;
import com.card.authorizer.entity.CartaoEntity;
import com.card.authorizer.entity.TransacaoEntity;
import com.card.authorizer.exeption.ResourceNotFoundException;
import com.card.authorizer.repository.CartaoRepository;
import com.card.authorizer.repository.TransacaoRepository;
import com.card.authorizer.service.TransacaoService;
import lombok.var;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping(path = "/transacoes", produces = MediaType.APPLICATION_JSON_VALUE)
public class TransacaoResource {

    @Autowired
    private TransacaoService transacaoService;

    @Autowired
    private TransacaoRepository transacaoRepository;
    @Autowired
    private CartaoRepository cartaoRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TransacaoEntity salvar(@RequestBody TransacaoDTO dto ){
        String numeroCartao = dto.getNumeroCartao();

        CartaoEntity cartao =
                (CartaoEntity) cartaoRepository
                        .findByNumeroCartao(dto.getNumeroCartao())
                        .orElseThrow(() -> new ResponseStatusException(
                                HttpStatus.BAD_REQUEST, "Cartão inexistente"));


        TransacaoEntity transacaoEntity = new TransacaoEntity();
        transacaoEntity.setValorTransacao(cartao.getSaldo() - transacaoEntity.getValorTransacao());
        transacaoEntity.setCartao(cartao);
        transacaoRepository.save(transacaoEntity);
        return  transacaoEntity;
    }

}
