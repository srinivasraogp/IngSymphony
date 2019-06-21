package com.hcl.ingsymphony.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.ingsymphony.dto.BreachDTO;
import com.hcl.ingsymphony.entity.Breach;
import com.hcl.ingsymphony.repository.BreachRepository;

@Service
public class BreachServiceImpl implements BreachService{

	@Autowired
	BreachRepository breachRepository;

	
	@Override
	public BreachDTO resolveTickets(BreachDTO breachDTO) {
		
		Breach breach=	breachRepository.findById(breachDTO.getBreachId());
		breach.setStatus(breachDTO.getStatus());
		breachRepository.save(breach);
		BeanUtils.copyProperties(breach, breachDTO);
		return breachDTO;
	}
}

