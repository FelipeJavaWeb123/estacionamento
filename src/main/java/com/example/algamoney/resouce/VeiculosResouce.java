package com.example.algamoney.resouce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.algamoney.domain.Veiculos;
import com.example.algamoney.service.VeiculosService;

@RestController
@RequestMapping(value="/veiculos")
public class VeiculosResouce {

		@Autowired
		VeiculosService service;
		
		@RequestMapping(value="/{id}",method=RequestMethod.GET)
		public ResponseEntity<?> find(@PathVariable Integer id) {
			Veiculos obj =  service.buscar(id);
			return ResponseEntity.ok().body(obj);
		}
		
		
}