package com.devsuperior.dsmeta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.services.SaleService;

@RestController
@RequestMapping(value="/sales")
public class SaleController {
	
	
	@Autowired
	SaleService service;
	
	@GetMapping
	public ResponseEntity<List<Sale>> findSales() {
		
		return ResponseEntity.ok().body(service.findSales());
	}

}
