package com.hcl.ingsymphony.controllertest;

<<<<<<< HEAD
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
=======
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
>>>>>>> 53cac9e518fedc67c043697bb620c3bfc7bebaae
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
<<<<<<< HEAD
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
=======

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hcl.ingsymphony.controller.BreachController;
import com.hcl.ingsymphony.dto.BreachRequestDTO;
import com.hcl.ingsymphony.dto.BreachResponsDTO;
import com.hcl.ingsymphony.service.BreachServiceIntf;

@RunWith(SpringRunner.class)
@WebMvcTest(value = BreachController.class)
public class BreachControllerTest {
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	@Autowired
	private BreachServiceIntf breachServiceIntf;
	@Test
	public void registerStudentTest() throws Exception {
		BreachRequestDTO breachReqDto = new BreachRequestDTO();
		breachReqDto.setBusinessArea("retailbanking");
		breachReqDto.setBusinessCategory("debitcard");
		breachReqDto.setDescription("lost");
	
		
		BreachResponsDTO breachResDTO = new BreachResponsDTO();
		breachResDTO.setBusinessArea("retailbanking");
		breachResDTO.setBusinessCategory("debitcard");
		breachResDTO.setDescription("lost");
		mockMvc.perform(post("/ingsymphony/breach").contentType(MediaType.APPLICATION_JSON).content(asJsonString(breachResDTO)))
				.andExpect(status().isCreated());
		
		

	}

	public static String asJsonString(final Object obj) {
		try {
			return new ObjectMapper().writeValueAsString(obj);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	
	
	
>>>>>>> 53cac9e518fedc67c043697bb620c3bfc7bebaae

}
