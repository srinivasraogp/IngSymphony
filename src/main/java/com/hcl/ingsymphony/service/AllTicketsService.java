package com.hcl.ingsymphony.service;

import java.util.List;

import com.hcl.ingsymphony.entity.AllTickets;

public interface AllTicketsService {

	AllTickets getAllTickets(Long employeeId);

	List<AllTickets> findAllHighTickets(String severity);

}
