package com.hcl.ingsymphony.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.ingsymphony.entity.AllTickets;
import com.hcl.ingsymphony.service.AllTicketsService;

@RestController
@RequestMapping("/")
public class AllTicketsController {
	@Autowired
	private AllTicketsService allTicketService;

	@GetMapping("/ingsymphony/allTickets/{employeeId}")
	public ResponseEntity<AllTickets> allTickets(@PathVariable Long employeeId) {
		AllTickets allTicketsResDto = allTicketService.getAllTickets(employeeId);
		return new ResponseEntity<>(allTicketsResDto, HttpStatus.OK);
	}
}
