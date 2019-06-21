package com.hcl.ingsymphony.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.ingsymphony.dto.BreachDTO;
import com.hcl.ingsymphony.service.BreachServiceImpl;

@RestController
@RequestMapping("/ingsymphony")
@CrossOrigin(allowedHeaders = { "*", "*/" }, origins = { "*", "*/" })
public class BreachController {
	
	@Autowired
	BreachServiceImpl breachServiceImpl;
	
	@PutMapping(value="/resolveTickets")
	public ResponseEntity<BreachDTO> resolveTickets(@RequestBody BreachDTO breachDTO)
	{
		BreachDTO breach= breachServiceImpl.resolveTickets(breachDTO);
		return new ResponseEntity<>(breach, HttpStatus.OK);
		
	}


}
