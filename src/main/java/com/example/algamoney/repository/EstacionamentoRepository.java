package com.example.algamoney.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.algamoney.domain.Estacionamento;

@Repository
public interface EstacionamentoRepository extends JpaRepository<Estacionamento, Integer> {
}
