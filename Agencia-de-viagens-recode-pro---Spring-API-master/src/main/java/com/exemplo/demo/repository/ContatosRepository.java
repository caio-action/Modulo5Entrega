package com.exemplo.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exemplo.demo.entity.Contato;

@Repository
public interface ContatosRepository extends JpaRepository<Contato, Long>{

}
