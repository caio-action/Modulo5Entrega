package com.exemplo.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exemplo.demo.entity.Destino;

@Repository
public interface DestinosRepository extends JpaRepository<Destino, Long> {

}
