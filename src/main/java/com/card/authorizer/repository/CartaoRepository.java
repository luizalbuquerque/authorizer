package com.card.authorizer.repository;

import com.card.authorizer.entity.CartaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CartaoRepository extends JpaRepository<CartaoEntity, Long> {

//    @Query("SELECT numero_cartao, saldo from cartao where numeroCartao = :numeroCartao")
//    public CartaoEntity findByNumeroCartao(@Param("numeroCartao") String numeroCartao);
}
