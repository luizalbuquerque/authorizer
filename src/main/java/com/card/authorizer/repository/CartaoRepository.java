package com.card.authorizer.repository;

import com.card.authorizer.entity.CartaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CartaoRepository extends JpaRepository<CartaoEntity, Long> {

    Optional<CartaoEntity> findById(Long id);
}
