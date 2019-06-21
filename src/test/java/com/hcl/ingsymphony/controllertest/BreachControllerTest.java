package com.hcl.ingsymphony.controllertest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hcl.ingsymphony.controller.BreachController;
import com.hcl.ingsymphony.dto.BreachDTO;
import com.hcl.ingsymphony.service.BreachServiceImpl;
@RunWith(SpringRunner.class)
@WebMvcTest(value=BreachController.class)
public class BreachControllerTest {
	
	@Autowired 
	MockMvc mockMvc;

	@MockBean
	BreachServiceImpl breachServiceImpl;
	
	@Test
	public void resolveTicketsTest() throws Exception{
		BreachDTO breachDTO=new BreachDTO();
		
		Mockito.when(breachServiceImpl.resolveTickets(breachDTO)).thenReturn(breachDTO);
		mockMvc.perform(
				MockMvcRequestBuilders.put("/ingsymphony/resolveTickets")
				.accept(MediaType.APPLICATION_JSON)
				.contentType(MediaType.APPLICATION_JSON)
				.content(mapToJson(breachDTO)))
				.andExpect(MockMvcResultMatchers.status().isOk());
	}
	protected String mapToJson(Object obj) throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.writeValueAsString(obj);
	}

}
