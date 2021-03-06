package com.example.algamoney.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.algamoney.domain.Patio;


@Repository
public interface PatioRepository extends JpaRepository<Patio, Integer> {
}
