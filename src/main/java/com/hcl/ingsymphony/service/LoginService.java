package com.hcl.ingsymphony.service;

import org.springframework.web.bind.annotation.RequestBody;

import com.hcl.ingsymphony.dto.BreachDTO;
import com.hcl.ingsymphony.entity.Breach;

public interface LoginService {
	public Breach resolveTickets(@RequestBody BreachDTO breachDTO);

}
