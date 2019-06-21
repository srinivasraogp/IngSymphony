package com.hcl.ingsymphony.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.ingsymphony.entity.MyTicket;

@Repository
public interface MyTicketRespository extends JpaRepository<MyTicket, Long>{

	MyTicket findByEmployeeId(Long employeeId);

}
