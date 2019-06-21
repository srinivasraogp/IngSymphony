package com.hcl.ingsymphony.service;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.ingsymphony.dto.BreachRequestDTO;
import com.hcl.ingsymphony.dto.BreachResponsDTO;
import com.hcl.ingsymphony.entity.Breach;
import com.hcl.ingsymphony.entity.Rules;
import com.hcl.ingsymphony.repository.BreachRepositorydel;
import com.hcl.ingsymphony.repository.RuleRepository;

@Service
@Transactional
public class BreachServiceImpl implements BreachServiceIntf {
	@Autowired
	BreachRepositorydel breachRepository;
	@Autowired
	RuleRepository ruleRepository;

	public BreachResponsDTO registerBreach(BreachRequestDTO breachRequestDTO) {
		{
			BreachResponsDTO breachResponseDto = new BreachResponsDTO();
			Breach breach = new Breach();
			Rules rule = new Rules();
			BeanUtils.copyProperties(breachRequestDTO, breach);
			rule = ruleRepository.findByAreaNameAndCategoryName(breachRequestDTO.getBusinessArea(),breachRequestDTO.getBusinessCategory());
			if(rule != null) {
			breach.setSeverity(rule.getSeverity());	
	     	}
			
			breach = breachRepository.save(breach);
			BeanUtils.copyProperties(breach, breachResponseDto);
		
			return breachResponseDto;
		}

	}

}
