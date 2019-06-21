package com.hcl.ingsymphony.service;

import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hcl.ingsymphony.entity.AllTickets;
import com.hcl.ingsymphony.repository.AllTicketsRepository;
import com.hcl.ingsymphony.repository.MyTicketRespository;

import junit.framework.Assert;



	@RunWith(SpringRunner.class)
	@SpringBootTest
	public class AllTicketsSericeImpTest {

		@InjectMocks
		private AllTicketsService allTicketServiceImp;

		@Mock
		private AllTicketsRepository allTicketRespository;

		@Test
		public void getAllTickets() {
			AllTickets myticket = new AllTickets();
			myticket.setEmployeeId(1L);
			when(allTicketRespository.findByEmployeeId(1L)).thenReturn(myticket);
			Assert.assertEquals(myticket, allTicketServiceImp.getAllTickets(1L));
		}
	}

