package com.example.algamoney.resouce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.algamoney.domain.Patio;
import com.example.algamoney.service.PatioService;

@RestController
@RequestMapping(value="/patio")
public class PatioResouce {

		@Autowired
		PatioService service;
		
		@RequestMapping(value="/{id}",method=RequestMethod.GET)
		public ResponseEntity<?> find(@PathVariable Integer id) {
			Patio obj =  service.buscar(id);
			return ResponseEntity.ok().body(obj);
		}
}