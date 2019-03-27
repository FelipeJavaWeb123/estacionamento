package com.example.algamoney.service;

import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.algamoney.domain.Clientes;
import com.example.algamoney.domain.Patio;
import com.example.algamoney.repository.PatioRepository;

@Service
public class PatioService {
	
	@Autowired    /* Instanciar o repositorio*/
	private PatioRepository repo;
	
	public Patio buscar(Integer id) {
		Optional<Patio> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontraddo! id: " + id + ", tipo: " + Patio.class.getName(), null
				));
	}
}
