package com.example.algamoney;

import java.sql.Date;
import java.sql.Time;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.algamoney.domain.Clientes;
import com.example.algamoney.domain.Estacionamento;
import com.example.algamoney.domain.Patio;
import com.example.algamoney.domain.Veiculos;
import com.example.algamoney.repository.ClienteRepository;
import com.example.algamoney.repository.EstacionamentoRepository;
import com.example.algamoney.repository.PatioRepository;
import com.example.algamoney.repository.VeiculosRepository;

@SpringBootApplication
public class EstacionamentoApplication implements CommandLineRunner{
	
	@Autowired
	private ClienteRepository clienteRepository; 

	@Autowired
	private VeiculosRepository veiculosRepository; 

	@Autowired
	private PatioRepository patioRepository; 

	@Autowired
	private EstacionamentoRepository estacionamentoRepository; 

	public static void main(String[] args) {
		SpringApplication.run(EstacionamentoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Clientes cliente = new Clientes(1,"Felipe Alves Silva","750565691-00");

		clienteRepository.saveAll(Arrays.asList(cliente));
		
		Veiculos veiculos = new Veiculos(1,"placa","modelo", "cor"); 
		veiculosRepository.saveAll(Arrays.asList(veiculos));

		Patio patio = new Patio(1,"descricao",10, 2.50); 
		patioRepository.saveAll(Arrays.asList(patio));

		Estacionamento estacionamento = new Estacionamento(1,Date.valueOf("2019-28-03"),Date.valueOf("2019-28-03"),Time.valueOf("15:30"),(Double) 8.50,1);

		estacionamentoRepository.saveAll(Arrays.asList(estacionamento));	
	}
}
