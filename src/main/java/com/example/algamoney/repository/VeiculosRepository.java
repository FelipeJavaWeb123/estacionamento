package com.example.algamoney.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.algamoney.domain.Veiculos;

@Repository
public interface VeiculosRepository extends JpaRepository<Veiculos, Integer> {
}
