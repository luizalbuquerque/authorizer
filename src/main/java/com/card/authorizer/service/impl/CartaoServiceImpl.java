package com.card.authorizer.service.impl;

import com.card.authorizer.entity.CartaoEntity;
import com.card.authorizer.exeption.BusinessException;
import com.card.authorizer.repository.CartaoRepository;
import com.card.authorizer.service.CartaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Random;

import static com.card.authorizer.util.ConstantUtils.CARTAO_DUPLICADO;
import static com.card.authorizer.util.ConstantUtils.CARTAO_NAO_ENCONTRADO;

@Service
public class CartaoServiceImpl implements CartaoService {

    @Autowired
    private CartaoRepository cartaoRepository;

    public void gerarNovoCartao(){
        try {
            CartaoEntity entity = new CartaoEntity();
            entity.setNumeroCartao(geradorNumeroCartao());
            entity.setPassword(geradorPassword());
            entity.setSaldo(500.00);
            cartaoRepository.save(entity);
        } catch (DataIntegrityViolationException e) {
            throw new BusinessException(CARTAO_DUPLICADO);
        }
    }

    @Transactional(readOnly = true)
    public CartaoEntity findById(Long id) {
        return cartaoRepository.findById(id)
                .orElseThrow(() -> new BusinessException(CARTAO_NAO_ENCONTRADO));
    }

//    @Override
//    public Object obterSaldoCartao(String numeroCartao){
//        return cartaoRepository.findByNumeroCartao(numeroCartao);
//    }

    // Gerador da numeração cartão aleatório
    public String geradorNumeroCartao() {
        StringBuilder text = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 12; i++) {
            text.append(random.nextInt(12));
        }
        return text.toString();
    }

    //Gerador de password set automatico.
    public String geradorPassword() {
        StringBuilder text = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            text.append(random.nextInt(4));
        }
        return text.toString();
    }

    public List<CartaoEntity> listar() {
        return cartaoRepository.findAll();
    }

}
