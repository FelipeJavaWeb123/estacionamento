package com.example.algamoney;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.algamoney.domain.Clientes;
import com.example.algamoney.repository.ClienteRepository;

@SpringBootApplication
public class EstacionamentoApplication{ //  implements CommandLineRunner{
	
/*	@Autowired
	private ClienteRepository clienteRepository; 
*/
	public static void main(String[] args) {
		SpringApplication.run(EstacionamentoApplication.class, args);
	}

/*	@Override
	public void run(String... args) throws Exception {
		
		Clientes cliente = new Clientes(1,"Felipe Alves Silva","750565691-00");

		clienteRepository.saveAll(Arrays.asList(cliente));
	}*/
}