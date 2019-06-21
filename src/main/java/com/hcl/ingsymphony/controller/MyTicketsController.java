package com.hcl.ingsymphony.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.ingsymphony.entity.MyTicket;
import com.hcl.ingsymphony.service.MyTicketService;


@RestController
@RequestMapping("/ingsymphony")
@CrossOrigin(allowedHeaders = { "*", "*/" }, origins = { "*", "*/" })
public class MyTicketsController {
	
	@Autowired
	private MyTicketService myTicketsService;

	@GetMapping("/myTickets/{employeeId}")
	public ResponseEntity<MyTicket> myTickets(@PathVariable Long employeeId) {
		MyTicket myTicketResDto = myTicketsService.getMyTickets(employeeId);
		return new ResponseEntity<>(myTicketResDto, HttpStatus.OK);
	}
}

