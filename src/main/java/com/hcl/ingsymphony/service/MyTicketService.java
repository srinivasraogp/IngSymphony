package com.hcl.ingsymphony.service;

import org.springframework.stereotype.Service;

import com.hcl.ingsymphony.entity.MyTicket;

@Service
public interface MyTicketService {

	

	MyTicket getMyTickets(Long employeeId);
	

}
