package com.card.authorizer.resource;

import com.card.authorizer.dto.TransacaoDTO;
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

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public ResponseEntity<TransacaoDTO> insert(@RequestBody TransacaoDTO dto) {
        dto = transacaoService.debitar(dto);
        return null;
    }
}
