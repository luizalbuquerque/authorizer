package com.card.authorizer.service.impl;

import com.card.authorizer.dto.CartaoDTO;
import com.card.authorizer.dto.TransacaoDTO;
import com.card.authorizer.entity.CartaoEntity;
import com.card.authorizer.entity.TransacaoEntity;
import com.card.authorizer.exeption.BusinessException;
import com.card.authorizer.repository.CartaoRepository;
import com.card.authorizer.repository.TransacaoRepository;
import com.card.authorizer.service.TransacaoService;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransacaoServiceImpl implements TransacaoService {

    @Autowired
    private TransacaoRepository transacaoRepository;

    @Autowired
    private CartaoRepository cartaoRepository;

    @Override
    public TransacaoDTO debitar(TransacaoDTO transacaoDTO) {


        List<CartaoEntity> cartoes = cartaoRepository.findAll();



        if (transacao.getStatus() == AccountClosureStatus.REQUESTED
                && accountClosure.getCoreBankingStatus() == ACCOUNT_CANCELED
                && accountClosure.getProcessorStatus() == ACCOUNT_CLOSED) {
            accountClosure.setStatus(AccountClosureStatus.EFFECTIVE);
            accountService.updateStatus(accountClosure.getAccount().getUuid(), AccountStatus.CANCELED);
            accountClosureCommunicationService.sendCancelationSuccessEmail(accountClosure);
        }

    }
}
