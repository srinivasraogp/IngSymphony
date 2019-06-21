package com.hcl.ingsymphony.service;

import com.hcl.ingsymphony.dto.BreachRequestDTO;
import com.hcl.ingsymphony.dto.BreachResponsDTO;

public interface BreachServiceIntf {

	BreachResponsDTO registerBreach(BreachRequestDTO breachRequestDTO);
	

}
