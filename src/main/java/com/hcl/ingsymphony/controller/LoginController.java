package com.hcl.ingsymphony.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.ingsymphony.dto.BreachDTO;
import com.hcl.ingsymphony.entity.Breach;
import com.hcl.ingsymphony.service.LoginServiceImpl;

@RestController
@RequestMapping("/ingsymphony")
@CrossOrigin(allowedHeaders = { "*", "*/" }, origins = { "*", "*/" })
public class LoginController {
	
	@Autowired
	LoginServiceImpl loginServiceImpl;
	
	@PostMapping(value="/resolveTickets")
	public Breach resolveTickets(@RequestBody BreachDTO breachDTO)
	{
		Breach breach= loginServiceImpl.resolveTickets(breachDTO);
		System.out.println(breach.getStatus());
		return breach;
		
	}


}
