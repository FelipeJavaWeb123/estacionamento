package com.example.algamoney.resouce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.algamoney.domain.Estacionamento;
import com.example.algamoney.service.EstacionamentoService;

@RestController
@RequestMapping(value="/estacionamento")
public class EstacionamentoResouce {

		@Autowired
		EstacionamentoService service;
		
		@RequestMapping(value="/{id}",method=RequestMethod.GET)
		public ResponseEntity<?> find(@PathVariable Integer id) {
			Estacionamento obj =  service.buscar(id);
			return ResponseEntity.ok().body(obj);
		}
		
		
}