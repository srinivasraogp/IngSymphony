package com.hcl.ingsymphony.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.ingsymphony.entity.MyTicket;
import com.hcl.ingsymphony.repository.MyTicketRespository;

@Service
public class MyTicketServiceImp implements MyTicketService {
	@Autowired
	private MyTicketRespository myTicketRepository;

	@Override
	public MyTicket getMyTickets(Long employeeId) {
		return myTicketRepository.findByEmployeeId(employeeId);

	}

}
