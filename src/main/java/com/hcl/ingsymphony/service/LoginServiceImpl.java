package com.hcl.ingsymphony.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.ingsymphony.dto.BreachDTO;
import com.hcl.ingsymphony.entity.Breach;
import com.hcl.ingsymphony.repository.BreachRepository;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	BreachRepository breachRepository;

	
	
	@Override
	public Breach resolveTickets(BreachDTO breachDTO) {
		
		Breach breach=	breachRepository.findByBreachIdAndUserId(breachDTO.getBreachId(),breachDTO.getUserId());
		breach.setStatus(breachDTO.getStatus());
		breachRepository.save(breach);
		return breach;
	}
}

