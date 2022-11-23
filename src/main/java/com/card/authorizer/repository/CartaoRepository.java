package com.card.authorizer.repository;

import com.card.authorizer.entity.CartaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CartaoRepository extends JpaRepository<CartaoEntity, Long> {


    Optional<Object> findByNumeroCartao(String numeroCartao);
}
