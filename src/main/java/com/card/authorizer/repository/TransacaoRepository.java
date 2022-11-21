package com.card.authorizer.repository;

import com.card.authorizer.entity.TransacaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TransacaoRepository extends JpaRepository<TransacaoEntity, Long> {

}
