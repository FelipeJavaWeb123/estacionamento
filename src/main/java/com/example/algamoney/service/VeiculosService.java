package com.example.algamoney.service;

import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.algamoney.domain.Clientes;
import com.example.algamoney.domain.Veiculos;
import com.example.algamoney.repository.VeiculosRepository;

@Service
public class VeiculosService {
	
	@Autowired    /* Instanciar o repositorio*/
	private VeiculosRepository repo;
	
	public Veiculos buscar(Integer id) {
		Optional<Veiculos> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontraddo! id: " + id + ", tipo: " + Veiculos.class.getName(), null
				));
	}
}
