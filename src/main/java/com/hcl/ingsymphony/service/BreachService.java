package com.hcl.ingsymphony.service;

import org.springframework.web.bind.annotation.RequestBody;

import com.hcl.ingsymphony.dto.BreachDTO;

public interface BreachService {
	public BreachDTO resolveTickets(@RequestBody BreachDTO breachDTO);

}
