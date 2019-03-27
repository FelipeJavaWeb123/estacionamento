package com.example.algamoney.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.algamoney.domain.Clientes;

@Repository
public interface ClienteRepository extends JpaRepository<Clientes, Integer> {
}
