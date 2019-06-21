package com.hcl.ingsymphony.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.ingsymphony.entity.AllTickets;
import com.hcl.ingsymphony.repository.AllTicketsRepository;
@Service
public class AllTicketsSericeImp implements AllTicketsService {
@Autowired
private AllTicketsRepository allTicketRespository;
	@Override
	public AllTickets getAllTickets(Long employeeId) {
		return allTicketRespository.findByEmployeeId(employeeId);
	}

}
