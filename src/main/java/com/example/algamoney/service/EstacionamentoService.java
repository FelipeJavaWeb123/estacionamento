package com.example.algamoney.service;

import java.util.Arrays;
import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.algamoney.domain.Estacionamento;
import com.example.algamoney.repository.EstacionamentoRepository;

@Service
public class EstacionamentoService {
	
	@Autowired    /* Instanciar o repositorio*/
	private EstacionamentoRepository repo;
	
	public Estacionamento buscar(Integer id) {
		Optional<Estacionamento> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontraddo! id: " + id + ", tipo: " + Estacionamento.class.getName(), null
				));
	}
	
	public void Gravar(Estacionamento objcli) {
	
		try {
			repo.saveAll(Arrays.asList(objcli));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
