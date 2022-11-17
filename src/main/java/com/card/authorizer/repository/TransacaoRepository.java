package com.card.authorizer.repository;

import com.card.authorizer.entity.TransacaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransacaoRepository extends JpaRepository<TransacaoEntity, Long> {

}
