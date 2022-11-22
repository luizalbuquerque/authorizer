package com.card.authorizer.resource;

import com.card.authorizer.entity.CartaoEntity;
import com.card.authorizer.service.CartaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path = "/cartoes", produces = MediaType.APPLICATION_JSON_VALUE)
public class CartaoResource {

    @Autowired
    private CartaoService cartaoService;

    @GetMapping
    public List<CartaoEntity> listar() {
        return cartaoService.listar();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void gerar() {
        cartaoService.gerarNovoCartao();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Object> findById(@PathVariable Long id) {
        return ResponseEntity.ok(cartaoService.findById(id));
    }
    
}
