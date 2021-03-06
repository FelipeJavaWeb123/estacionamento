package com.example.algamoney.service;

import java.util.Arrays;
import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.algamoney.domain.Clientes;
import com.example.algamoney.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired    /* Instanciar o repositorio*/
	private ClienteRepository repo;
	
	public Clientes buscar(Integer id) {
		Optional<Clientes> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontraddo! id: " + id + ", tipo: " + Clientes.class.getName(), null
				));
	}
	
	public void Gravar(Clientes objcli) {
		try {
			repo.saveAll(Arrays.asList(objcli));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
