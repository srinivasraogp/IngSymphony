package com.hcl.ingsymphony.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hcl.ingsymphony.entity.AllTickets;
import com.hcl.ingsymphony.service.AllTicketsService;

@RunWith(SpringRunner.class)
@WebMvcTest(value = AllTicketsController.class)
public class AllTicketsControllerTest {
	@Autowired
	private MockMvc mockMvc;
	@MockBean
	private AllTicketsService allTicketService;

	@Test
	public void allTickets() throws Exception {
		AllTickets mockTicket = new AllTickets();
		mockTicket.setBusinessArea("abc");
		mockTicket.setBusinessCategory("Aclass");
		mockTicket.setDescription("Priority");
		mockTicket.setEmployeeId(123L);
		mockTicket.setSeverity("High");
		mockTicket.setStatus("Approed");
		
		Mockito.when(allTicketService.getAllTickets(Mockito.anyLong())).thenReturn(mockTicket);

		String URI = "/ingsymphony/allTickets/123";
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get(URI).accept(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		String outputInJson = result.getResponse().getContentAsString();
		String inputInJson = this.mapToJson(mockTicket);
		Assert.assertEquals(outputInJson, inputInJson);

	}

	private String mapToJson(Object object) throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.writeValueAsString(object);
	}
}