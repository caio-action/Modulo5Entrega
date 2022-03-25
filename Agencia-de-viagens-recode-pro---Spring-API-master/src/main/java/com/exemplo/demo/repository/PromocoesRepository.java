package com.exemplo.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exemplo.demo.entity.Promocao;

@Repository
public interface PromocoesRepository extends JpaRepository<Promocao, Long> {

}
